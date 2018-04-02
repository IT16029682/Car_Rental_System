/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Krishan
 */
public class NewClass {
    
    
    
    
     public static String hostName ;
      public static   String dbName;
      public static  String user ;
      public  static String password ;
      public static  boolean LoginReq ;
    private static LoG hhh;
    /**
     *
     * 
     * 
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException
    {
        Connection con = null;
        
        
        // Connect to database
       
        
        try{
            if(!LoginReq)
            {
            con = DriverManager.getConnection("jdbc:sqlserver://"+hostName+":1433;user="+user+";"+"password="+password+";"+"databaseName="+dbName);
            }
            else
            {
             con = DriverManager.getConnection("jdbc:sqlserver://"+hostName+":1433;databaseName="+dbName+";integratedSecurity=true");
            }
            
            return con;
        }
         catch (Exception e) {
           
            return null;
        }
        
    }
    
    
    public static void main(String[] args) throws SQLException {
        
        
             
    

    }
}
    

