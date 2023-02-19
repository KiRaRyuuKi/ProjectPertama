package main;

import java.util.Scanner;

class student {
    String fName;
    String iName;
    String studentStatus;
        
    public void set(String fName, String iName, String studentStatus) {
        this.fName = fName;
        this.iName = iName;
        this.studentStatus = studentStatus;
    }
        
    public void show() {
        System.out.println("Data Diri Mahasiswa !");
        System.out.println("Nama Mahasiswa  : " + fName);
        System.out.println("ID Mahasiswa    : " + iName);
        System.out.println("Status Mahasiswa: " + studentStatus);
    }
}

public class MainAccess {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        student mahasiswa = new student();
        
        System.out.println("Masukkan Data Diri Kamu !");
        System.out.print("Nama   : ");
        String Nama = scan.nextLine();
        System.out.print("ID     : ");
        String ID = scan.next();
        System.out.print("Status : ");
        String Status = scan.next();
        
        System.out.println("");
        
        mahasiswa.set(Nama, ID, Status);
        mahasiswa.show();
    } 
}
