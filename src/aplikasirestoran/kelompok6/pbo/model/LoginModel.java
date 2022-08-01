package aplikasirestoran.kelompok6.pbo.model;

import javax.swing.JOptionPane;
import aplikasirestoran.kelompok6.pbo.event.LoginListener;


public class LoginModel {

    private String username;
    private String password;
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
    
    protected void fireOnChange(){
        if(loginListener != null){
            loginListener.onChange(this);
        }
    }
    
    public void loginForm(){
        JOptionPane.showMessageDialog(null, "LOGIN BERHASIL");
    }
    
    public void loginNotValid(){
        JOptionPane.showMessageDialog(null, "Username & Password Salah");
    }
    
}
