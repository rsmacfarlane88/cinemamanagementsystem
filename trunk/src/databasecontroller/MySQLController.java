package databasecontroller;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * This class contains all the fetch, get and update commands to interface with the oracle
 * database.
 *
 * @author Scott
 *
 */

public class MySQLController {
    private String server_host;
    private String server_username;
    private String server_password;
    private int server_port;

    private Connection connection_stream = null;

	/**
	 * Sets up the class for interfacing with the oracle database.
	 *
	 * @param server_host
	 * @param server_username
	 * @param server_password
	 * @param server_port
	 */

     public MySQLController() throws SQLException{
        // Setup all the required settings for the controller to connect to
        this.server_host = "localhost";
        this.server_username = "root";
        this.server_password = "";
        this.server_port = 3306;

        this.connect();
	}


	public void connect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection_stream = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemamanagementsystem", "root", "");
        }catch(Exception e){
            System.out.println("Unabled to load MYSQL DRIVER");
        }
	}

	public void disconnect(){

	}

	public void putData(String query_string) throws SQLException{
            Statement st = this.connection_stream.createStatement();
            st.executeUpdate(query_string);
	}

	public ResultSet getData(String query_string) throws SQLException{
            Statement st = this.connection_stream.createStatement();
            return st.executeQuery(query_string);
	}

	public int countRows(String table_name){
		return 0;
	}
}
