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

/**
 *
 * @author vektorel
 */
public class DBIslemler {
    
    public void kaydet(){
    
        try{
        Driver.class.forName("org.postgresql.Driver");
        
        //ConnectionString -> yer pc için: localhost:5432
        Connection baglanti = DriverManager.getConnection(
                "jdbc:postgresql://10.0.11.14:5432/DBmusteritakip", "postgres", "postgres");
        
        PreparedStatement pr = baglanti.prepareCall(""
                + "insert into tblmusteri(ad,soyad) values('HOCA','YeniSoyad')");
        pr.executeUpdate();
        baglanti.close();
        System.out.println("İşlem Tamam");
        }catch(Exception ex){
            System.out.println("HATA OLUŞTU");
        } 
  
    
    }


    public void duzenle(){
    
        try{
           Driver.class.forName("org.postgresql.Driver");
      Connection baglanti = DriverManager.getConnection(""
              + "jdbc:postgresql://10.0.11.14:5432/DBmusteritakip", "postgres", "postgres");
      PreparedStatement pr = baglanti.prepareCall(""
              + "UPDATE tblmusteri SET ad='Muhammet Ali', soyad='HOCA' WHERE ad='HOCA';");
      pr.executeUpdate();
      baglanti.close();
        }catch(Exception ex){
            System.out.println("HATA VAR....");
        }
        
    
    }// duzenle methosunun sonu    
    
    
    public void sil(){
    
        try{
         Driver.class.forName("org.postgresql.Driver");
    Connection  baglanti = DriverManager.getConnection(""
        + "jdbc:postgresql://10.0.11.14:5432/DBmusteritakip", "postgres", "postgres");
    PreparedStatement pr = baglanti.prepareCall("delete from tblmusteri where id=8");
    pr.executeUpdate();
      baglanti.close();
        }catch(Exception ex){
         System.out.println("HATA VAR....");
        }
        
    
    }
    
}
