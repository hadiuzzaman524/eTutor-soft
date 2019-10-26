/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Commentstoredatabase {
              
   Connection getConnection() throws SQLException
    {  
        Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/comment", "root", "");
     
        return conn;
    }
    
   ResultSet getcomment(String queary) throws SQLException
    {
       
        
        Connection conn=getConnection();
        Statement statement=(Statement) conn.createStatement();
        
        ResultSet rs=statement.executeQuery(queary);

       return rs; 
    }

   boolean addcomment(String queary) throws SQLException {
      
   Connection connection=getConnection();
   Statement statement=(Statement) connection.createStatement();
   
   
   return statement.executeUpdate(queary)>0; 
   }
    
}
