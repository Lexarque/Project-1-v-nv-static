package Yee;

import java.util.Scanner;

public class Void {

    // Menginisialisai Variabel Instance agar lebih fleksibel untuk pemakaian
    // Membuat scanner

Scanner S = new Scanner(System.in);
int umur, t, ta;
long NISN;
String nama, kelas, sekolah, jurusan, b;

void show(){

    // Memasukkan data ke tiap variabel menggunakan scanner

    System.out.println("========Silahkan Masukkan ID anda=========");
    System.out.print("NISN : ");
    NISN = S.nextLong();
    S.nextLine();
    System.out.print("Nama : ");
    nama = S.nextLine();
    System.out.print("Umur : ");
    umur = S.nextInt();
    S.nextLine();
    System.out.println("Tanggal Lahir");
    System.out.print("Tanggal : ");
    t = S.nextInt();
    S.nextLine();
    System.out.print("Bulan : ");
    b = S.next();
    System.out.print("Tahun : ");
    ta = S.nextInt();
    S.nextLine();
    System.out.print("Sekolah : ");
    sekolah = S.nextLine();
    System.out.print("Jurusan : ");
    jurusan = S.next();
    S.nextLine();
    System.out.print("Kelas : ");
    kelas = S.nextLine();
}

void print(){

    // Menampilkan hasil dari input

    System.out.println("====================================");
    System.out.println("NISN = " + NISN + "\n" +
            "Nama = " + nama + "\n" +
            "Umur = " + umur + "\n" +
            "Tanggal Lahir = "+ t + " " + b + " " + ta + "\n" +
            "Sekolah = " + sekolah + "\n" +
            "Jurusan = " + jurusan + "\n" +
            "Kelas = " + kelas);
    System.out.println("====================================");
}


}

