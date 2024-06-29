package structure.proxy;

public class Main {
    public static void main(String[] args) {
        IDatabase adminDatabase = new DatabaseProxy("ADMIN");
        IDatabase userDatabase = new DatabaseProxy("USER");

        // Admin can execute query
        adminDatabase.query("SELECT * FROM users");

        // User cannot execute query
        userDatabase.query("SELECT * FROM users");
    }
}