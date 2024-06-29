package structure.proxy;

public class RealDatabase implements IDatabase {
    @Override
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}