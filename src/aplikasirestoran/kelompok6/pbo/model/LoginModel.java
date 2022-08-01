package aplikasirestoran.kelompok6.pbo.model;

import javax.swing.JOptionPane;
import aplikasirestoran.kelompok6.pbo.event.LoginListener;


public class LoginModel {

    //Deklarasi Atribut yang digunakan untuk menampung data dari Form Login
    private String username;
    private String password;
    private final String us = "ADMIN";
    private final String ps = "admin123";
    //Deklarasi listener yang telah dibuat sebagai atribut class model
    private LoginListener loginListener;

    public LoginListener getLoginListener() {
        return loginListener;
    }
    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }
    
    //Deklarasi Getter dan Setter
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
        this.fireOnChange();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
        this.fireOnChange();
    }
    
    public String getUs() {
        return us;
    }
    public String getPs() {
        return ps;
    }
    
    
    //Method untuk memberikan informasi apabila 
    //terjadi perubahan data di dalam model
    protected void fireOnChange(){
        //validasi jika object loginListener tidak kosong
        if(loginListener != null){
            loginListener.onChange(this);
        }
    }
    
    //Method berupa aksi yang akan dilakukan terhadap data
    public void loginForm(){
        //kode untuk membuat aksi ketika button login di klik
        JOptionPane.showMessageDialog(null, "LOGIN BERHASIL");
    }
    
    
}
