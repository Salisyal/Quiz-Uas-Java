import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class penjualanBarang {

//    customer newcustomer = customerDetail();

    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat RupiahIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        System.out.println("======================================");
        System.out.println("Program penjualan dengan data barang");
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);

        System.out.println("    Kode Barang     Nama Barang     Harga Satuan");
        System.out.println("    A01             Buku         Rp. 700.000,00");
        System.out.println("    B02             Kertas         Rp. 800.000,00");
        System.out.println("    C03             Pulpen           Rp. 50.000,00");

        System.out.print("\nMasukkan Jumlah Pembeli   : ");
        int jumlahpembeli = input.nextInt();
        String[] nama = new String[jumlahpembeli];
        String[] kode = new String[jumlahpembeli];
        int[] jumlahbarang = new int[jumlahpembeli];
        String[] nbarang = new String[jumlahpembeli];
        int[] harga = new int[jumlahpembeli];
        int[] bayar = new int[jumlahpembeli];

        for (int x = 0; x < jumlahpembeli; x++) {
            System.out.println("\nPembeli Ke-" + (x + 1));
            System.out.print("Nama Pembeli  : ");
            nama[x] = input.next();
            System.out.print("Kode Barang   : ");
            kode[x] = input.next();
            System.out.print("Jumlah        : ");
            jumlahbarang[x] = input.nextInt();

            switch (kode[x]) {
                case "A01":
                    nbarang[x] = "Buku";
                    harga[x] = 700000;
                    bayar[x] = harga[x] * jumlahbarang[x];
                    break;
                case "B02":
                    nbarang[x] = "Kertas";
                    harga[x] = 800000;
                    bayar[x] = harga[x] * jumlahbarang[x];
                    break;
                case "C03":
                    nbarang[x] = "Pulpen";
                    harga[x] = 50000;
                    bayar[x] = harga[x] * jumlahbarang[x];
                    break;
                default:
                    System.out.println("\n\tError");
                    break;
            }
        }

        System.out.println("\n==============================================================================================================================================");
        System.out.println("No \tNama Pembeli \tKode Barang \tNama Barang \tJumlah \t\tHarga \t\t\tBayar");
        for (int i = 0; i < jumlahpembeli; i++) {
            System.out.println((i + 1) + " \t" + nama[i] + " \t\t" + kode[i] + " \t\t" + nbarang[i] + " \t" + jumlahbarang[i] + " \t\t" + RupiahIndo.format(harga[i]) + " \t\t" + RupiahIndo.format(bayar[i]));
        }
        System.out.println("\n==============================================================================================================================================");
        System.out.println("\nNama      : Faisyal Ramadhan");
        System.out.println("Jurusan    : Teknik Informatika");

    }
//    public static customer customerDetail(){
//        customer customer = new customer();
//        System.out.println("Enter Id: ");
//        int jumlahpembeli = input.nextInt();
//
//    }
}