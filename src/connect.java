//This started off as a copy of http://www.kitebird.com/articles/jdbc.html. Who knows where
//it's gone by the time you read this.

//Got some code from mysql's website and docs as well (mainly the SQL error catching thing

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



   public class connect
   {
	   
	   static String title = "Mr";
	   static String forename = "Harry";
	   static String surname = "Rickards";
	   static String address0 = "105 Parklands";
	   static String address1 = "Maresfield";
	   static String address2 = "";
	   static String address3 = "";
	   static String address4 = "";
	   static String address5 = "";
	   static String postcode = "TN22 2HT";
	   static String phone = "01825760629";
	   static String email = "hrickards@l33tmyst.com";
	   static String type = "Example type";
	   static String fax = "";
	   static String mobile = "";
	   
	   static java.sql.Statement stmt;

	      
	   static String insertString = "insert into customers values(1, '"+title+"', '"+forename+"', '"+surname+"', '"+address0+"', '"+address1+"', '"+address2+"', '"+address3+"', '"+address4+"', '"+address5+"', '"+postcode+"', '"+phone+"', '"+email+"', '"+type+"', '"+fax+"', '"+mobile+"')";
	   
       public static void main (String[] args)
       {
    	   
    	   System.out.println(insertString);
           Connection con = null;

           try
           {

               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
               String serverName = "localhost";
               String mydatabase = "dtelectrics";
               String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url
               String username = "dtelectrics";
               String password = "passw0rd";
               con = DriverManager.getConnection(url, username, password);

        	     // Do something with the Connection

               stmt = con.createStatement();
   	   		stmt.executeUpdate(insertString);

            
                 
           } catch (SQLException ex) {
        	     // handle any errors
        	     System.out.println("SQLException: " + ex.getMessage());
        	     System.out.println("SQLState: " + ex.getSQLState());
        	     System.out.println("VendorError: " + ex.getErrorCode());
        	 }

           catch (Exception e)
           {
               System.err.println ("UNKOWN ERROR: Cann't connect to database");
           }
           finally
           {
               if (con != null)
               {
                   try
                   {
                       con.close ();
                       System.out.println ("Disconnected from database");
                   }
                   catch (Exception e) { /* ignore close errors */ }
               }
           }
       }
   }
   
