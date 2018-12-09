
package statistics.matcher;

public class QueryBuilder {
    
    Matcher m;
    
    public QueryBuilder() {
        this.m = new All();
    }

    public Matcher build() {
        return this.m;
    }

    public QueryBuilder playsIn(String team) {
        this.m = new And(m, new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String goals) {
        this.m = new And(m, new HasAtLeast(value, goals));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String goals) {
        this.m = new And(m, new HasFewerThan(value, goals));
        return this;
    }
    
}
