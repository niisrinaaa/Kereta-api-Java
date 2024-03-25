import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pesanan;
        String tiket, nama_pelanggan, beli, jawaban;
        double harga_tiket, jumlah_tiket, total_bayar;

        System.out.println("Selamat datang di Pemesanan Tiket Kereta Api");
        System.out.println("===========================================");
        System.out.println(" Toko Kereta Paling murah");
        System.out.println("===========================================");
        System.out.println("Apakah Anda ingin memesan tiket kereta api? iya/tidak");
        beli = input.nextLine();
        
        if (beli.equalsIgnoreCase ("iya")) {
            System.out.println("Tiket Tersedia : ");
            System.out.println("-------------------------------------------");
            System.out.println("1. Cirebon - Tuparev"
            + "\n1. harga bussiness : Rp. 20000"
            + "\n2. harga executive : Rp. 30000");
        System.out.println("2. Johar - Bypass"
                 + "\n3. harga bussiness : Rp. 10000"
                 + "\n4. harga executive : Rp. 20000");
        System.out.println("3. Klari -Badami "
                + "\n5. harga bussiness : Rp. 15000"
                + "\n6. harga executive : Rp. 25000");
        System.out.println("-------------------------------------------");
           
        

        do {
            System.out.println("Masukkan nama pelanggan : ");
            nama_pelanggan = input.nextLine();
            System.out.println("Masukkan nomor tiket yang ingin dipesan : ");
            pesanan = input.nextInt();
            System.out.println("Masukkan jumlah tiket yang ingin dipesan : ");
            jumlah_tiket = input.nextDouble();

            if (pesanan == 1) {
                tiket = "Cirebon - Tuparev";
                harga_tiket = 20000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar);
            } else if (pesanan == 2) {
                tiket = "Cirebon - Tuparev";
                harga_tiket = 30000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar);
            }else if (pesanan == 3) {
                tiket = "Johar - Bypass";
                harga_tiket = 10000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar); 
            }else if (pesanan == 4) {
                tiket = "Johar - Bypass";
                harga_tiket = 20000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar);
            }else if (pesanan == 5) {
                tiket = "Klari - Badami";
                harga_tiket = 15000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar);
            }else if (pesanan == 6) {
                tiket = "Klari - Badami";
                harga_tiket = 25000;
                total_bayar = harga_tiket * jumlah_tiket;
                System.out.println("Nama pelanggan : " + nama_pelanggan);
                System.out.println("Tiket yang dipesan : " + tiket);
                System.out.println("Harga tiket : Rp. " + harga_tiket);
                System.out.println("Jumlah tiket : " + jumlah_tiket);
                System.out.println("Total bayar : Rp. " + total_bayar);
             } else {
                System.out.println("Nomor tiket yang Anda masukkan tidak tersedia");
            }

        System.out.println("Apakah Anda ingin memesan tiket lagi? iya/tidak");
        jawaban = input.next();
        }while (jawaban.equalsIgnoreCase("iya") );

        }
    }
}
