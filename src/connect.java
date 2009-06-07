//This started off as a copy of http://www.kitebird.com/articles/jdbc.html. Who knows where
//it's gone by the time you read this.

//Got some code from mysql's website and docs as well (mainly the SQL error catching thing

import java.sql.*;


   public class connect
   {
       public static void main (String[] args)
       {
           Connection conn = null;

           try
           {

               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
        	    conn =
        	        DriverManager.getConnection("jdbc:mysql://localhost/dtelectrics?" +
        	                                    "user=dtelectrics&password=passw0rd");

        	     // Do something with the Connection

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
               if (conn != null)
               {
                   try
                   {
                       conn.close ();
                       System.out.println ("Disconnected from database");
                   }
                   catch (Exception e) { /* ignore close errors */ }
               }
           }
       }
   }
