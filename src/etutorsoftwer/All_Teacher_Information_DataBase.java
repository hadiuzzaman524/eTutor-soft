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
public class All_Teacher_Information_DataBase {
      
   Connection getConnection() throws SQLException
    {  String s="rangpurdistrict";
        Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+s, "root", "");
     
        return conn;
    }
    
   ResultSet getAllTeacher(String queary) throws SQLException
    {
       
        
        Connection conn=getConnection();
        Statement statement=(Statement) conn.createStatement();
        
        ResultSet rs=statement.executeQuery(queary);

       return rs; 
    }

   boolean addTeacher(All_Teacher_Information_Geter std,String queary) throws SQLException {
      
   Connection connection=getConnection();
   Statement statement=(Statement) connection.createStatement();
  // String queary="insert into rangpursadar values()";
   
   
   return statement.executeUpdate(queary)>0; 
   }
   
   
}
