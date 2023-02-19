package access;

import java.util.Scanner;

public class KarismaAgungPlaza {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("         Karisma Agung Plaza (KAP)          ");
        System.out.println("          Promo Belanja Berhadiah           ");
        System.out.println("     Khusus Pembelian 5 barang pertama      ");
        System.out.println("       Dengan harga minimum Rp 100000       ");
        System.out.println("--------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String Nama = scan.nextLine();
        
        System.out.println("");
        
        System.out.print("Masukkan harga barang ke-1    : ");
        int HargaPertama = scan.nextInt();
        System.out.print("Masukkan harga barang ke-2    : ");
        int HargaKedua = scan.nextInt();
        System.out.print("Masukkan harga barang ke-3    : ");
        int HargaKetiga = scan.nextInt();
        System.out.print("Masukkan harga barang ke-4    : ");
        int HargaKeempat = scan.nextInt();
        System.out.print("Masukkan harga barang ke-5    : ");
        int HargaKelima = scan.nextInt();
        
        System.out.println("");
        
        int TotalHarga = HargaPertama + HargaKedua + HargaKetiga + HargaKeempat + HargaKelima;
        System.out.println("Total harga pembelian atas nama " + Nama);
        System.out.println("Adalah : " + TotalHarga);
        
        System.out.println("");
        
        System.out.println("Selamat...");
        if(TotalHarga > 100000) {
            System.out.println("Anda mendapatkan hadiah 1 bauh Kompor Gas");
        } else if(TotalHarga > 80000) {
            System.out.println("Anda mendapatkan potongan harga 10000");
        } else if(TotalHarga > 60000) {
            System.out.println("Anda mendapatkan potongan harga 8000");
        } else if(TotalHarga > 40000) {
            System.out.println("Anda mendapatkan potongan harga 5000");
        } else {
            System.out.println("Anda tidak mendapatkan apa apa");
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("                Terima Kasih                ");
        System.out.println("Anda telah berbelanja di Karisma Agung Plaza");
        System.out.println("--------------------------------------------");
    }  
}
