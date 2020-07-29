import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system", "root", "Java2020Ste");
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from user");
			//4.Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name") + ", " + myRs.getString("last_name"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
