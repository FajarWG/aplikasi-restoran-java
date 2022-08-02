/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasirestoran.kelompok6.pbo.controller;

import aplikasirestoran.kelompok6.pbo.config.Koneksi;
import aplikasirestoran.kelompok6.pbo.model.AdminModel;
import aplikasirestoran.kelompok6.pbo.view.AdminView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus N751J
 */
public class AdminController {
    private AdminModel model;

    /**
     * @return the model
     */
    public AdminModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(AdminModel model) {
        this.model = model;
    }
    
    //Data Makanan
    public void tambahMakanan(AdminView view){
        String inputIdMakanan = view.getTxtIdMakanan().getText();
        String inputNamaMakanan = view.getTxtNamaMakanan().getText();
        String inputHargaMakanan = view.getTxtHargaMakanan().getText();     
        //menu.add(inputID);
        //menu.add(inputNAMA);
        //menu.add(inputHARGA);             
        try {
            Connection con = new Koneksi().konek();
            String sql = "INSERT INTO makanan VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputIdMakanan);
            ps.setString(2, inputNamaMakanan);
            ps.setString(3, inputHargaMakanan);
            ps.executeUpdate();
            model.tambahData();
            model.resetMakanan();
            view.tampilMakanan();
            
        } catch (Exception e) {
      }
    }
    
    public void editMakanan(AdminView view){
         String inputIdMakanan = view.getTxtIdMakanan().getText();
         String inputNamaMakanan = view.getTxtNamaMakanan().getText();
         String inputHargaMakanan = view.getTxtHargaMakanan().getText();

         if (view.getTxtIdMakanan().getText().equals("") || view.getTxtNamaMakanan().getText().equals("")){
            JOptionPane.showMessageDialog(view,"Data Harus di isi");
         }else{
         try {
             
            Connection con = new Koneksi().konek();
            String sql = "UPDATE makanan SET nama_makanan = ?, harga_makanan =? where id_makanan =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputNamaMakanan);
            ps.setString(2, inputHargaMakanan);
            ps.setString(3, inputIdMakanan);
            ps.executeUpdate();
            model.editData();
            model.resetMakanan();
            view.tampilMakanan();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
            
        }
      }
    }
    
    public void hapusMakanan(AdminView view){
        String inputID = view.getTxtIdMakanan().getText();
                
        if (view.getTxtIdMakanan().getText().equals("") || view.getTxtNamaMakanan().getText().equals("")){
            JOptionPane.showMessageDialog(view,"Data Harus di isi");
         }else{
        try {
            Connection con = new Koneksi().konek();
            String sql = "DELETE FROM makanan WHERE id_makanan = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputID);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(view,"Berthasil Di Hapus");
            model.resetMakanan();
            view.tampilMakanan();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
      } 
    }
    //Data Minuman
    public void tambahMinuman(AdminView view){
        String inputIdMinuman = view.getTxtIdMinum().getText();
        String inputNamaMinuman = view.getTxtNamaMinum().getText();
        String inputHargaMinuman = view.getTxtHargaMinum().getText();
        
        //menu.add(inputID);
        //menu.add(inputNAMA);
        //menu.add(inputHARGA);
        if (view.getTxtIdMinum().getText().equals("") || view.getTxtNamaMinum().getText().equals("")){
            JOptionPane.showMessageDialog(view,"Data Harus di isi");
         }else{
            
        try {
            Connection con = new Koneksi().konek();
            String sql = "INSERT INTO minuman VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputIdMinuman);
            ps.setString(2, inputNamaMinuman);
            ps.setString(3, inputHargaMinuman);
            ps.executeUpdate();
            model.tambahData();
            model.resetMinuman();
            view.tampilMinuman();
           
        } catch (Exception e) {
        }
      }
    }   
    public void editMinuman(AdminView view){
         String inputIdMinuman = view.getTxtIdMinum().getText();
         String inputNamaMinuman = view.getTxtNamaMinum().getText();
         String inputHargaMinuman = view.getTxtHargaMinum().getText();

         if (view.getTxtIdMinum().getText().equals("") || view.getTxtNamaMinum().getText().equals("")){
            JOptionPane.showMessageDialog(view,"Data Harus di isi");
         }else{ 
         try {
             
            Connection con = new Koneksi().konek();
            String sql = "UPDATE minuman SET nama_minuman = ?, harga_minuman =? where id_minuman =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputNamaMinuman);
            ps.setString(2, inputHargaMinuman);
            ps.setString(3, inputIdMinuman);
            ps.executeUpdate();
            model.editData();
            model.resetMinuman();
            view.tampilMinuman();
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());  
        }
    }           
    }
    
    public void hapusMinuman(AdminView view){
        String inputIdMinuman = view.getTxtIdMinum().getText();
        
        if (view.getTxtIdMinum().getText().equals("") || view.getTxtNamaMinum().getText().equals("")){
            JOptionPane.showMessageDialog(view,"Data Harus di isi");
         }else{ 
        
        try {
            Connection con = new Koneksi().konek();
            String sql = "DELETE FROM minuman WHERE id_minuman = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputIdMinuman);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(view,"Berthasil Di Hapus");
            model.resetMinuman();
            view.tampilMinuman();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }      
    }      
    }
   
    
    
    

