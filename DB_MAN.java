package package1;

import java.sql.*;
import java.io.*;

public class DB_MAN {
    String strDriver = "com.mysql.cj.jdbc.Driver";   
    String strURL = "jdbc:mysql://127.0.0.1:3306/subway";     
    String strUser = "root";                              
    String strPWD = "rootpw";                             
    
    Connection DB_con;
    Statement DB_stmt;  
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch(Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try{
            DB_stmt.close();
            DB_con.close();
        }catch (Exception e) {
            System.out.println("SQLException:" + e.getMessage());
        }
    }
}
