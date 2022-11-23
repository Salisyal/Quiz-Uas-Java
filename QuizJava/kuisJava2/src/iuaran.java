public class iuaran extends pendataan {
    int iuran,totPembayaran,sampah, keamanan,sumbangan;

    public iuaran(String nama, String nik, String alamat, String job, String statusPernikah, String noTlp, int jml_ank) {
        super(nama, nik, alamat, job, statusPernikah,noTlp, jml_ank);
        this.iuran = iuran;
        this.totPembayaran = totPembayaran;
    }

    public iuaran() {

    }

    @Override
    public Integer getJml_ank() {
        return super.getJml_ank(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String  getNoTlp() {
        return super.getNoTlp(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJob() {
        return super.getJob(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAlamat() {
        return super.getAlamat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNik() {
        return super.getNik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNama() {
        return super.getNama(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setJml_ank(int jml_ank) {
        super.setJml_ank(jml_ank); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNoTlp(String noTlp) {
        super.setNoTlp(noTlp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setJob(String job) {
        super.setJob(job); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getIuran_keamanan() {
        return super.getIuran_keamanan();
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNik(String nik) {
        super.setNik(nik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setStatusPernikahan(String statusPernikahan) {
        super.setStatusPernikahan(statusPernikahan);
    }

    @Override
    public String getStatusPernikahan() {
        return super.getStatusPernikahan();
    }

    public int bayarIuran(){
        totPembayaran = iuran + sampah + keamanan + sumbangan;
        return totPembayaran;
    }
}