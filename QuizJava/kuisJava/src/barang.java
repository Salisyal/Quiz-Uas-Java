import java.util.Scanner;
import java.util.*;
public class barang {

    public boolean admin(){
        Scanner sc = new Scanner(System.in);
        barangMasuk bm = new barangMasuk();
        System.out.println("nama Admin: ");
        bm.setNama(sc.next());
        System.out.println("Nik Admin: ");
        bm.setNik(sc.next());
        return true;
    }

    public List<barangMasuk> listbarangMasuk() {
        List listBarang = new ArrayList();
        barangMasuk bm = new barangMasuk();

        bm.setJenisBarang("1. Buku");
        bm.setNamaBarang("Buku Tulis");
        bm.setJumlahBarang("1 Pak");
        bm.setHarga(45000);
        listBarang.add(bm);

        bm.setJenisBarang("2. Buku");
        bm.setNamaBarang("Buku Gambar");
        bm.setJumlahBarang("1 Pak");
        bm.setHarga(50000);
        listBarang.add(bm);

        bm.setJenisBarang("3. Kertas");
        bm.setNamaBarang("Kertas A4");
        bm.setJumlahBarang("1 Rim");
        bm.setHarga(40000);
        listBarang.add(bm);

        bm.setJenisBarang("4. pulpen");
        bm.setNamaBarang("pulpen biru");
        bm.setJumlahBarang("1 Pak");
        bm.setHarga(38000);
        listBarang.add(bm);

        bm.setJenisBarang("5. pensil");
        bm.setNamaBarang("Pensil Raut");
        bm.setJumlahBarang("1 Pak");
        bm.setHarga(38000);
        listBarang.add(bm);

        return listBarang;
    }

    public List<barangKeluar> listBarangKeluar(){
        List listBarang = new ArrayList();
        barangKeluar bm=new barangKeluar();

        bm.setJenisBarang("1. Buku");
        bm.setNamaBarang("Buku Tulis");
        bm.setJumlah("1 Pak");
        bm.setHarga(45000);
        listBarang.add(bm);

        bm = new barangKeluar();
        bm.setJenisBarang("2. Buku");
        bm.setNamaBarang("Buku Gambar");
        bm.setJumlah("1 Pak");
        bm.setHarga(50000);
        listBarang.add(bm);

        bm = new barangKeluar();
        bm.setJenisBarang("3. Kertas");
        bm.setNamaBarang("Kertas A4");
        bm.setJumlah("1 Rim");
        bm.setHarga(40000);
        listBarang.add(bm);

        bm = new barangKeluar();
        bm.setJenisBarang("4. Bulpen");
        bm.setNamaBarang("Bulpen Biru");
        bm.setJumlah("1 Pak");
        bm.setHarga(38000);
        listBarang.add(bm);

        bm = new barangKeluar();
        bm.setJenisBarang("5. Pensil");
        bm.setNamaBarang("Pensil Raut");
        bm.setJumlah("1 Pak");
        bm.setHarga(32000);
        listBarang.add(bm);

        return listBarang;
    }
}
