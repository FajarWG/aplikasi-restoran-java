/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasirestoran.kelompok6.pbo.model;

import aplikasirestoran.kelompok6.pbo.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus N751J
 */
public class AdminModel {
    //Atribut
    private int totalmakanminum;
    private int totalpenjualan;
    private int penghasilan;
    
    private String idMakanan;
    private String namaMakanan;
    private int hargaMakanan;
    
    private String idMinuman;
    private String namaMinuman;
    private int hargaMinuman;
    
    private int totalMakanan;
    private int totalBayar;
    private String idTransaksi;
    private String namaPelanggan;
    private PelangganListener listener;
    
    
 
    
    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
    
    /**
     * @return the totalmakanminum
     */
    public int getTotalmakanminum() {
        return totalmakanminum;
    }

    /**
     * @param totalmakanminum the totalmakanminum to set
     */
    public void setTotalmakanminum(int totalmakanminum) {
        this.totalmakanminum = totalmakanminum;
    }

    /**
     * @return the totalpenjualan
     */
    public int getTotalpenjualan() {
        return totalpenjualan;
    }

    /**
     * @param totalpenjualan the totalpenjualan to set
     */
    public void setTotalpenjualan(int totalpenjualan) {
        this.totalpenjualan = totalpenjualan;
    }

    /**
     * @return the penghasilan
     */
    public int getPenghasilan() {
        return penghasilan;
    }

    /**
     * @param penghasilan the penghasilan to set
     */
    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    /**
     * @return the idMakanan
     */
    public String getIdMakanan() {
        return idMakanan;
    }

    /**
     * @param idMakanan the idMakanan to set
     */
    public void setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
    }

    /**
     * @return the namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * @param namaMakanan the namaMakanan to set
     */
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    /**
     * @return the hargaMakanan
     */
    public int getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaMakanan the hargaMakanan to set
     */
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    /**
     * @return the idMinuman
     */
    public String getIdMinuman() {
        return idMinuman;
    }

    /**
     * @param idMinuman the idMinuman to set
     */
    public void setIdMinuman(String idMinuman) {
        this.idMinuman = idMinuman;
    }

    /**
     * @return the namaMinuman
     */
    public String getNamaMinuman() {
        return namaMinuman;
    }

    /**
     * @param namaMinuman the namaMinuman to set
     */
    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    /**
     * @return the hargaMinuman
     */
    public int getHargaMinuman() {
        return hargaMinuman;
    }

    /**
     * @param hargaMinuman the hargaMinuman to set
     */
    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    /**
     * @return the totalMakanan
     */
    public int getTotalMakanan() {
        return totalMakanan;
    }

    /**
     * @param totalMakanan the totalMakanan to set
     */
    public void setTotalMakanan(int totalMakanan) {
        this.totalMakanan = totalMakanan;
    }

    /**
     * @return the totalBayar
     */
    public int getTotalBayar() {
        return totalBayar;
    }

    /**
     * @param totalBayar the totalBayar to set
     */
    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    /**
     * @return the idTransaksi
     */
    public String getIdTransaksi() {
        return idTransaksi;
    }

    /**
     * @param idTransaksi the idTransaksi to set
     */
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    /**
     * @return the namaPelanggan
     */
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    /**
     * @param namaPelanggan the namaPelanggan to set
     */
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
   public void tambahMakananan(){
       JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
   }
   public void editMakanan(){
       JOptionPane.showMessageDialog(null,"Berhasil Mengedit Data");
   }
   public void tambahMinuman(){
       JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
   }
   public void editMinuman(){
       JOptionPane.showMessageDialog(null,"Berhasil Mengedit Data");
   }
    protected void fireOnChange(){ //kalo ada event maka tembakan modelnya
        if(listener != null){
            this.listener.onChange(this);
        }
    }
}
