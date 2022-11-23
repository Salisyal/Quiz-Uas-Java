import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        pendataan p = new pendataan();
        iuaran i = new iuaran();


        System.out.println("========================================");
        System.out.println("Pendataan dan Pembayaran Iuran warga");
        System.out.println("========================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("");
        System.out.print("PILIHAN MENU: ");
        pilihan = sc.nextInt();
        System.out.println("----------------------------------------");

        if(pilihan == 1){
            Scanner s = new Scanner(System.in);
            System.out.println("*** Data Warga ***");
            System.out.println("Masukan Nama: ");
            p.nama = s.next();
            System.out.println("Masukan Nik: ");
            p.nik = s.next();
            System.out.println("Masukan Alamat: ");
            p.alamat= s.next();
            System.out.println("Masukan No.Tlp; ");
            p.noTlp = s.next();
            System.out.println("-------------------------------------");
            System.out.println("*** Data Pekerjaan ***");
            System.out.println("Masukan Pekerjaan: ");
            p.job = s.next();
            System.out.println("Masukan Alamat Kantor: ");
            p.alamat = s.next();
            System.out.println("-------------------------------------");
            System.out.println("*** Data Status ***");
            System.out.println("masukan status pernikahan");
            p.statusPernikahan = s.next();
            System.out.println("Masukan Nama Suami/Istri");
            p.nama = s.next();
            System.out.println("Masukan Jumlah Anak");
            p.jml_ank = s.nextInt();
        }
        else if (pilihan == 2) {
            Scanner s = new Scanner(System.in);
            System.out.println("Masukan Nik: ");
            p.nik = s.next();
            System.out.println("Masukan Iuran: ");
            i.iuran = s.nextInt();
            System.out.println("Masukan Uang sampah: ");
            i.sampah = s.nextInt();
            System.out.println("Masukan Uang Sumbangan: ");
            i.sumbangan = s.nextInt();
            System.out.println("Total iuran warga rt 05 : "+i.bayarIuran());
        }
        else{
            System.out.println("Program Gk jalan");
        }
    }
}
