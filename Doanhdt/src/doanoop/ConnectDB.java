/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ngt son
 */
public class ConnectDB {
  
    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLGym;encrypt=false";
            String user = "aa";
            String pwd = "aa";
            con = DriverManager.getConnection(url,user,pwd);
            if(con != null)
                System.out.println("ket noi thanh cong");
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
        return con;
    }
}