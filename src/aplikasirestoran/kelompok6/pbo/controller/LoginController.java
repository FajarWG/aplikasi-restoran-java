package aplikasirestoran.kelompok6.pbo.controller;

import aplikasirestoran.kelompok6.pbo.config.Koneksi;
import aplikasirestoran.kelompok6.pbo.model.LoginModel;
import aplikasirestoran.kelompok6.pbo.view.AdminView;
import aplikasirestoran.kelompok6.pbo.view.LoginView;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {
    
    private LoginModel model;

    public LoginModel getModel() {
        return model;
    }
    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    public void loginForm(LoginView view){
        
        String user = view.getTxtUsername().getText();
        String pass = view.getTxtPassword().getText();
        
        try {
            if(user.equals("") || pass.equals("")){
                JOptionPane.showMessageDialog(view,"Username atau Password Masih Kosong");
            }else{
                Connection con = new Koneksi().konek();
                String sql = "SELECT * FROM login where`username` =? AND `password` = ?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, user);
                ps.setString(2, pass);

                ResultSet rs = ps.executeQuery();
                
                if (rs.next()){
                    
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    
                    if(!user.equals(username) || !pass.equals(password)){
                        model.loginNotValid();
                    }else if (user.equals(username) && pass.equals(password)){
                        model.setUsername(user);
                        model.setPassword(pass);
                        
                        model.loginForm();
                        this.tampilAdminView();
                        view.dispose();
                    }
                }
            }
        } catch (Exception e) {
            
        }
    }
    
    public void tampilAdminView(){
        AdminView tampil = new AdminView();
        tampil.setVisible(true);
    }
    
}
