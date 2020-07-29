

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class db {

		/**
		 * @param args
		 */
		public static void main( String args[] )
		{
			try{
				// Load the database Driver
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance() ;
				
				String dbServer = "jdbc:mysql://localhost:3306/car_rental_system";
				String user = "root";
				String password = "Java2020Ste";
				String query = "SELECT * FROM user";

				// Get a connection to the database
				Connection conn = DriverManager.getConnection(dbServer, user, password) ;

				// Get a statement from the connection
				Statement stmt = conn.createStatement() ;

				// Execute the query
				ResultSet rs = stmt.executeQuery(query) ;
				
				
				// Loop through the result set
				while(rs.next()) {
					System.out.println( rs.getString("iduser") + "\t" + rs.getString("first_name") + 
							"\t" + rs.getString("last_name")) ;
				}

				// Close the result set, statement and the connection
				rs.close() ;
				stmt.close() ;
				conn.close() ;
			}
			catch( SQLException se ){
				System.out.println( "SQL Exception:" ) ;

				// Loop through the SQL Exceptions
				while( se != null ){
					System.out.println( "State  : " + se.getSQLState()  ) ;
					System.out.println( "Message: " + se.getMessage()   ) ;
					System.out.println( "Error  : " + se.getErrorCode() ) ;

					se = se.getNextException() ;
				}
			}
			catch( Exception e ){
				System.out.println( e ) ;
			}
		}
	}


