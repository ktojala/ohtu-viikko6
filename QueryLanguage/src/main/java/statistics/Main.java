package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        Matcher m0 = new Or( new HasAtLeast(40, "goals"),
                             new HasAtLeast(60, "assists"),
                             new HasAtLeast(85, "points")
        );
        
        for (Player player : stats.matches(m0)) {
            System.out.println( player );
        }
        System.out.println("");

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
        Matcher m3 = new Not( new HasAtLeast(1, "goals"));
        for (Player player : stats.matches(m3)) {
            System.out.println( player );
        }
        System.out.println("");

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
