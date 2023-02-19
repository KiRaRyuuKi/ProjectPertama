package access;

import java.util.Scanner;

public class CafeCeria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("|--------------------------------|");
        System.out.println("|           CAFE CERIA           |");
        System.out.println("|         ANEKA MINUMAN          |");
        System.out.println("|--------------------------------|");
        System.out.println("|          SPESIAL MENU :        |");
        System.out.println("|         1. Soft Drinks         |");
        System.out.println("|         2. Mix Juice           |");
        System.out.println("|         3. Nescafe             |");
        System.out.println("|         4. Soda Milk           |");
        System.out.println("|         5. Tea                 |");
        System.out.println("|--------------------------------|");
        
        System.out.println("");
        
        System.out.print("Nama Pembeli : ");
        String Nama = scan.nextLine();
        System.out.print("Masukkan pesanan anda : ");
        int Pesanan = scan.nextInt();
        switch(Pesanan) {
            case 1:
                System.out.println("Anda memesan minuman Soft Drinks");
                break;
            case 2:
                System.out.println("Anda memesan minuman Mix Juice");
                break;
            case 3:
                System.out.println("Anda memesan minuman Nescafe");
                break;
            case 4:
                System.out.println("Anda memesan minuman Soda Milk");
                break;
            case 5:
                System.out.println("Anda memesan minuman Tea");
                break;
            default:
                System.out.println("Pesanan yang anda pilih tidak ada dalam menu");
        }
        
        System.out.println("");
        
        System.out.println("|--------------------------------|");
        System.out.println("| Pesanan akan segera kami antar |");
        System.out.println("|   Terima kasih " + Nama + "  |");
        System.out.println("|       telah berkunjung di      |");
        System.out.println("|           CAFE CERIA           |");
        System.out.println("|--------------------------------|");
    }
}
