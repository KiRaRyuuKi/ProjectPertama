package main;

import java.util.Scanner;

public class MainPriority {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan nama dan umur !");
        System.out.print("Nama : ");
        String Nama = scan.nextLine();
        System.out.print("Umur : ");
        int Umur = scan.nextInt();
        
        System.out.println("");
        
        MainSystem dataPertama = new MainSystem(Nama, Umur);
        MainSystem dataKedua = new MainSystem("RyuuKun", 19);
        
        if(dataPertama.getAge() == dataKedua.getAge()) {
            System.out.println(dataPertama.getName() + ", Umur kamu sama dengan umur " + dataKedua.getName());
        } else {
            System.out.println(dataPertama.getName() + ", Umur kamu tidak sama dengan umur " + dataKedua.getName());
        }
    }  
}
