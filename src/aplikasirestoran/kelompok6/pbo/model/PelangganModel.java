package aplikasirestoran.kelompok6.pbo.model;
import aplikasirestoran.kelompok6.pbo.event.PelangganListener;
import aplikasirestoran.kelompok6.pbo.view.PelangganView;
import javax.swing.JOptionPane;


public class PelangganModel {
    private String namaPemesan;
    private String namaMakanan;
    private String namaMinuman;
    private int hargaMakanan;
    private int hargaMinuman;
    private int tmakanan;
    private int tminuman;
    private int total;
    private PelangganListener pelangganListener;


    public String getNamaPemesan() {
        return namaPemesan;
    }
    public void setNama(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }
    
    public String getNamaMinuman() {
        return namaMinuman;
    }
    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }
    
    public int getHargaMakanan() {
        return hargaMakanan;
    }
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getHargaMinuman() {
        return hargaMinuman;
    }
    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public int getTmakanan() {
        return tmakanan;
    }
    public void setTmakanan(int tmakanan) {
        this.tmakanan = tmakanan;
    }

    public int getTminuman() {
        return tminuman;
    }
    public void setTminuman(int tminuman) {
        this.tminuman = tminuman;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }
    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
        this.fireOnchange();
    }
    
    protected void fireOnchange(){
        if(getPelangganListener() != null){
            this.getPelangganListener().onChange(this);
        }
    }
    
    
    public void kirimPesanan(){
        
    }
    
    public void resetPesanan(PelangganView view){
        view.getCmbMakanan().setSelectedIndex(0);
        view.getCmbMinuman().setSelectedIndex(0);
        view.getTxtQtyMakan().setText("");
        view.getTxtQtyMinum().setText("");
        view.getTxtHargaMakan().setText("");
        view.getTxtHargaMinum().setText("");
        view.getTxtNama().setText("");
        view.getTxtTotal().setText("");   
    }
    
    
}
