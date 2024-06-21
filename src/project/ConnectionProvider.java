/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author k s shirur
 */
public class ConnectionProvider
{
    public static Connection getConn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","admin");
            return con;
            
        }
        catch(Exception e)
        {
            return null;
            
        }
    }
    
}
