package connection;

import java.sql.*;

public class ConnectionManager {
	
	Connection con = null;
	
	public Connection establishConnection() throws ClassNotFoundException,SQLException
	{
		//2
		Class.forName("com.mysql.cj.jdbc.Driver");
		//3
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ InventoryProject","root","kamalvishnu1521");
		 
		return con;
	}
	
   public void closeConnection()throws SQLException
   {
	   con.close();
   }
}
