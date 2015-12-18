package Ch15;
//:Lookup.java
//Looks up email addresses in a local database using JDBC
import java.sql.*;

public class Lookup {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String dbUrl = "jdbc:odbc:people";
		String user = "";
		String password = "";
		try{
			//Load the driver(registers itself)
			Class.forName("sum.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection(dbUrl, user, password);
			Statement s = c.createStatement();
			//SQL code:
			ResultSet r = s.executeQuery("SELECT FIRST, LAST, EMAIL " + "FROM people.csv people " + "WHERE " + "(Last='" +  
					args[0] + "')" + " AND (EMAIL Is Not Null) " + "ORDER BY FIRST");
			while(r.next()){
				//Capitalization doesn't matter:
				System.out.println(r.getString("Last") + ", " + r.getString("FIRST") + ": " + r.getString("EMAIL"));
			}
			s.close(); //Also closes ResultSet
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
