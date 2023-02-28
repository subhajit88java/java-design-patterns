package creation.pattern.pool.main;

import java.sql.Connection;

import creation.pattern.pool.model.JDBCConnectionPool;

public class TestObjectPool {
	public static void main(String args[])
    {
        // Create the ConnectionPool:
		JDBCConnectionPool pool = new JDBCConnectionPool(
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
            "sa", "password");
 
        // Get a connection:
        Connection con = pool.takeOut();
        // Return the connection:
        pool.takeIn(con);
    }
}
