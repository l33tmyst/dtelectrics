//This started off as a copy of http://www.kitebird.com/articles/jdbc.html. Who knows where
//it's gone by the time you read this.

import java.sql.*;

   public class connect
   {
       public static void main (String[] args)
       {
           Connection conn = null;

           try
           {
               String userName = "dtelectrics";
               String password = "passw0rd";
               String url = "jdbc:mysql://localhost/dtelectrics";
               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
               conn = DriverManager.getConnection (url, userName, password);
               System.out.println ("Connected to database");
           }
           catch (Exception e)
           {
               System.err.println ("ERROR: Cann't connect to database");
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
