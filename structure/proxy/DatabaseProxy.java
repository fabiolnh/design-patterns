package structure.proxy;

public class DatabaseProxy implements IDatabase {
    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.realDatabase = new RealDatabase();
        this.userRole = userRole;
    }

    @Override
    public void query(String sql) {
        if ("ADMIN".equals(userRole)) {
            realDatabase.query(sql);
        } else {
            System.out.println("Access denied: insufficient permissions");
        }
    }
}