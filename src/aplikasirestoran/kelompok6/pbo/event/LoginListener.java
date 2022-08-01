package aplikasirestoran.kelompok6.pbo.event;

import aplikasirestoran.kelompok6.pbo.model.LoginModel;


public interface LoginListener {
    
    //Method untuk menghandle apabila terjadi perubahan pada model
    void onChange(LoginModel login);

    
}
