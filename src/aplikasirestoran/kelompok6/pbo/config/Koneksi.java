/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasirestoran.kelompok6.pbo.config;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class Koneksi {
    private Connection con;
    public Connection konek(){
        try{
            String url = "jdbc:mysql://localhost/db_rest";
            String username = "root"; 
            String password ="";
        con = DriverManager.getConnection(url,username,password);
          
        }catch (Exception e){
  
        }
        return con;
}
}
