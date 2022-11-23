public class pendataan {
    String nama, nik, alamat, job, noTlp, statusPernikahan;
    int jml_ank, iuran_sampah, iuran_keamanan;

    public pendataan(String nama, String nik, String alamat, String job, String noTlp, String statusPernikahan, int jml_ank){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.job = job;
        this.noTlp = noTlp;
        this.statusPernikahan = statusPernikahan;
        this.jml_ank = jml_ank;
    }

    pendataan() {

    }

    public int getIuran_sampah() {
        return iuran_sampah;
    }

    public void setIuran_sampah(int iuran_sampah) {
        this.iuran_sampah = iuran_sampah;
    }

    public int getIuran_keamanan() {
        return iuran_keamanan;
    }

    public void setIuran_keamanan(int iuran_keamanan) {
        this.iuran_keamanan = iuran_keamanan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }

    public void setJml_ank(int jml_ank) {
        this.jml_ank = jml_ank;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJob() {
        return job;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public Integer getJml_ank() {
        return jml_ank;
    }

    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

}