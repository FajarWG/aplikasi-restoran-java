package aplikasirestoran.kelompok6.pbo.controller;
import aplikasirestoran.kelompok6.pbo.config.Koneksi;
import aplikasirestoran.kelompok6.pbo.model.PelangganModel;
import aplikasirestoran.kelompok6.pbo.view.PelangganView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class PelangganController {
    
    public int _makanan;
    public int _minuman;
    private PelangganModel model;


    public PelangganModel getModel() {
        return model;
    }
    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void kirimPesanan(PelangganView view){
        String namaPemesan= view.getTxtNama().getText();
        String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
        int makanan = _makanan;
        String hargaMakan = view.getTxtHargaMakan().getText();;
        String tmakanan = view.getTxtQtyMakan().getText();
        int minuman = _minuman;
        String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
        String hargaMinum = view.getTxtHargaMinum().getText();
        String tminuman = view.getTxtQtyMinum().getText();
        String total = view.getTxtTotal().getText();
        try {
            Connection con = new Koneksi().konek();
            String sql = "INSERT INTO transaksi (nama_pelanggan, id_makanan,harga_makanan,total_makanan,"
                    + " id_minuman,harga_minuman,total_minuman,total_bayar) VALUES ( ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, namaPemesan);
            ps.setInt(2, makanan);
            ps.setString(3, hargaMakan);
            ps.setString(4, tmakanan);
            ps.setInt(5, minuman);
            ps.setString(6, hargaMinum);
            ps.setString(7, tminuman);
            ps.setString(8, total);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pesanan Anda \n Nama : "+namaPemesan+" \n makanan : "+namaMakanan+" \n harga makanan : "+
                    hargaMakan+" \n Qty : "+tmakanan+" \n Minuman : "+namaMinuman+" \n harga minuman : "+hargaMinum+
                            " \n Qty : "+tminuman+" \n Total Bayar : "+total+"\n SILAHKAN BAYAR KE KASIR");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void resetPesanan(PelangganView view){
        String namaPemesan = view.getTxtNama().getText();
        String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
        String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
        String hargaMakanan = view.getTxtHargaMakan().getText();
        String hargaMinuman = view.getTxtHargaMinum().getText();
        String qtyMakanan = view.getTxtQtyMakan().getText();
        String qtyMinuman = view.getTxtQtyMinum().getText();
        String totalBayar = view.getTxtTotal().getText();
        
        if(namaPemesan.equals("") && namaMakanan.equals("") & namaMinuman.equals("") && hargaMakanan.equals("") && hargaMinuman.equals("") 
                && qtyMakanan.equals("") && qtyMinuman.equals("") && totalBayar.equals("")){
            //do nothing
        }else {
            model.resetPesanan(view);
        }
        
    }
    
    public void hitungTotalAuto(PelangganView view){
        int hargaMakanan;
        int hargaMinuman;
        int jumlahMakanan;
        int jumlahMinuman;
        hargaMakanan=Integer.valueOf(view.getTxtHargaMakan().getText());
        hargaMinuman=Integer.valueOf(view.getTxtHargaMinum().getText());
        jumlahMakanan=Integer.valueOf(view.getTxtQtyMakan().getText());
        jumlahMinuman=Integer.valueOf(view.getTxtQtyMinum().getText());
        int total=hargaMakanan*jumlahMakanan+hargaMinuman*jumlahMinuman;
        view.getTxtTotal().setText(String.valueOf(total));
    }
}
