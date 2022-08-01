package aplikasirestoran.kelompok6.pbo.controller;

import javax.swing.JOptionPane;
import aplikasirestoran.kelompok6.pbo.model.LoginModel;
import aplikasirestoran.kelompok6.pbo.view.AdminView;
import aplikasirestoran.kelompok6.pbo.view.LoginView;


public class LoginController {
    
    private LoginModel model;

    
    public LoginModel getModel() {
        return model;
    }
    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    //Method pada class controller untuk menghandle komunikasi dari view ke model
    public void loginForm(LoginView view){
        
        //ambil setiap nilai pada field di class view
        String username = view.getTxtUsername().getText();
        String password = view.getTxtPassword().getText();
        
        //buat validasi untuk mengecek seluruh field pada form wajib terisi
        if(username.equals("")){
            JOptionPane.showMessageDialog(view, "USERNAME TIDAK BOLEH KOSONG");
        } else if(password.equals("")){
            JOptionPane.showMessageDialog(view, "PASSWORD TIDAK BOLEH KOSONG");
        } else if(username.equals(model.getUs()) && password.equals(model.getPs())){
            //model.loginForm();
            this.tampilAdmin();
        } else{
            JOptionPane.showMessageDialog(view, "USERNAME ATAU PASSWORD SALAH");
        }
    }
    
    //Buat method untuk menampilkan tampilan admin 
    public void tampilAdmin(){
        AdminView tampil = new AdminView();
        tampil.setVisible(true);
    }
    
}
