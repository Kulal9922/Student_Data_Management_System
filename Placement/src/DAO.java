import java.sql.Connection;
import java.sql.DriverManager;


public class DAO {
	public static void main(String[] args) {
		
	}
	String username="root";

    String password="root";

    static final String DB_URL = "jdbc:mysql://localhost:3306/studentdata";
	                            //"jdbc:mysql://localhost:3306/folderlock";
    public Connection getConnection()
     {
	 Connection conn=null;
	 try{
	 Class.forName("com.mysql.cj.jdbc.Driver");

    //STEP 3: Open a connection
	System.out.println("Connected to Database Successfully !!!");
	
    conn = DriverManager.getConnection
         (DB_URL,username,password);
    }
   catch (Exception e)
   {
  System.out.println("Unable to connect Database");
    }
	 return conn;

}}
