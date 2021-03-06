package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();
        
        Matcher m = query.playsIn("NYR").hasAtLeast(10,"goals").hasFewerThan(25,"goals").build();
        
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
        System.out.println("");

// Jostain syystä alla ei query3:n paikalla voinut käyttää samaa query2:ta m7:lle
// m8:n muodostuksessa ei ollut vastaavaa ongelmaa

        QueryBuilder query2 = new QueryBuilder();
        QueryBuilder query3 = new QueryBuilder();
        Matcher m6 = query2.playsIn("PHI").hasAtLeast(10,"goals").hasFewerThan(20,"goals").build();
        Matcher m7 = query3.playsIn("EDM").hasAtLeast(60,"points").build();
        
        Matcher m8 = query2.oneOf(m6, m7).build();
                
        for (Player player : stats.matches(m8)) {
            System.out.println( player );
        }
        System.out.println("");
        
// Tässä versiossa ei ole ongelma jos käyttää query2 joka kohdassa

        m8 = query2.oneOf(query2.playsIn("PHI")
                .hasAtLeast(10,"goals")
                .hasFewerThan(20,"goals")
                .build(),
            query3.playsIn("EDM")
                .hasAtLeast(60,"points")
                    .build()
        ).build();
                
        for (Player player : stats.matches(m8)) {
            System.out.println( player );
        }
        System.out.println("");

//        Matcher m0 = new Or( new HasAtLeast(40, "goals"),
//                             new HasAtLeast(60, "assists"),
//                             new HasAtLeast(85, "points")
//        );
//        
//        for (Player player : stats.matches(m0)) {
//            System.out.println( player );
//        }
//        System.out.println("");

//        Matcher m = new And( new HasAtLeast(10, "goals"),
//                             new HasAtLeast(20, "assists"),
//                             new PlaysIn("PHI")
//        );
//        
//        for (Player player : stats.matches(m)) {
//            System.out.println( player );
//        }
//        System.out.println("");
// All    
//        Matcher m2 = new And();
//        for (Player player : stats.matches(m2)) {
//            System.out.println( player );
//        }
//        System.out.println("");
// Not
//        Matcher m3 = new Not( new HasAtLeast(1, "goals"));
//        for (Player player : stats.matches(m3)) {
//            System.out.println( player );
//        }
//        System.out.println("");

//        Matcher m4 = new Or( new HasAtLeast(40, "goals"), new HasAtLeast(40, "assists"));
//        for (Player player : stats.matches(m4)) {
//            System.out.println( player );
//        }
//        System.out.println("");

//        Matcher m5 = new HasFewerThan(2, "goals");
//        
//        for (Player player : stats.matches(m5)) {
//            System.out.println( player );
//        }
//        System.out.println("");
    }
}
