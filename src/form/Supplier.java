/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.*;
//import java.util.Date;


public class Supplier {
    String url = "jdbc:mysql://localhost/cbl";
    String username = "root";
    String password = "";   
    Connection con = null;
    Statement stmt;
    ResultSet rs = null;
    
    String name;
    int id;
    String vat_no;
    String svat_no;
    
     
    public void search_user(String svat_no){
       
        String query="SELECT * FROM supplier where svat_no="+svat_no;
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, this.password);
            stmt = con.createStatement(); 
            rs = stmt.executeQuery(query);
 
                while(rs.next()){
                    String name2 = rs.getString("name");
                    String vat2 = rs.getString("vat_no");
                    this.name=name2;
                    this.vat_no=vat2; 
                }
                
        }catch (Exception e){
            System.out.println("searchUser ===> " + e);
            
        }finally{
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                
            }
        }
    }
    
    public void add_user(){
       
        String query="SELECT * FROM supplier where svat_no="+svat_no;
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, this.password);
            stmt = con.createStatement(); 
            rs = stmt.executeQuery(query);
 
                while(rs.next()){
                    String name2 = rs.getString("name");
                    String vat2 = rs.getString("vat_no");
                    this.name=name2;
                    this.vat_no=vat2; 
                }
                
        }catch (Exception e){
            System.out.println("searchUser ===> " + e);
            
        }finally{
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                
            }
        }
    }
    
}
