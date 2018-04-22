/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbornekbaglanti;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




/**
 *
 * @author vektorel
 */
public class DBOrnekBaglanti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
    Driver.class.forName("org.postgresql.Driver");
    Connection baglanti = DriverManager.getConnection(""
     + "jdbc:postgresql://10.0.11.14:5432/DBmusteritakip", "postgres", "postgres");
    PreparedStatement pr = baglanti.prepareCall("select * from tblmusteri");
    
    ResultSet rs =pr.executeQuery();
    
    while(rs.next()){
        String ad= rs.getString("ad");
        String soyad = rs.getString("soyad");
        System.out.println("Müşteri Adı Soyadı.....:"+ad+" "+soyad);
        
    }    
    
        
    
    }
    
}
