package aplikasirestoran.kelompok6.pbo.model;

import aplikasirestoran.kelompok6.pbo.event.AdminListener;
import javax.swing.JOptionPane;

public class AdminModel {
    
    //Atribut
    private String id_transaksi;
    private String id_makanan;
    private String id_minuman;
    private String nama_makanan;
    private String nama_minuman;
    private String harga_makanan;
    private String harga_minuman;
    private String total_makanan;
    private String total_minuman;
    private String nama_pelanggan;
    private String total_bayar;
    private AdminListener listener;

    public AdminListener getListener() {
        return listener;
    }

    public void setListener(AdminListener listener) {
        this.listener = listener;
        this.fireOnChange();
    }

    public String getId_transaksi() {
        return id_transaksi;
        
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
        this.fireOnChange();
    }

    public String getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(String id_makanan) {
        this.id_makanan = id_makanan;
        this.fireOnChange();
    }

    public String getId_minuman() {
        return id_minuman;
    }

    public void setId_minuman(String id_minuman) {
        this.id_minuman = id_minuman;
        this.fireOnChange();
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
        this.fireOnChange();
    }

    public String getNama_minuman() {
        return nama_minuman;
    }

    public void setNama_minuman(String nama_minuman) {
        this.nama_minuman = nama_minuman;
        this.fireOnChange();
    }

    public String getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(String harga_makanan) {
        this.harga_makanan = harga_makanan;
        this.fireOnChange();
    }

    public String getHarga_minuman() {
        return harga_minuman;
    }

    public void setHarga_minuman(String harga_minuman) {
        this.harga_minuman = harga_minuman;
        this.fireOnChange();
    }

    public String getTotal_makanan() {
        return total_makanan;
    }

    public void setTotal_makanan(String total_makanan) {
        this.total_makanan = total_makanan;
        this.fireOnChange();
    }

    public String getTotal_minuman() {
        return total_minuman;
    }

    public void setTotal_minuman(String total_minuman) {
        this.total_minuman = total_minuman;
        this.fireOnChange();
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
        this.fireOnChange();
    }

    public String getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(String total_bayar) {
        this.total_bayar = total_bayar;
        this.fireOnChange();
    }
    
    
    
    protected void fireOnChange(){ //kalo ada event maka tembakan modelnya
        if(listener != null){
            this.listener.onChange(this);
        }
    }
    public void tambahData(){
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }
    public void editData(){
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
    }
    public void resetMakanan(){
        this.setId_makanan("");
        this.setNama_makanan("");
        this.setHarga_makanan("");
    }
    public void resetMinuman(){
        this.setId_minuman("");
        this.setNama_minuman("");
        this.setHarga_minuman("");
}
}
