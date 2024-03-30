/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author Katri
 */
import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }

    public static void main(String[] args) {
        // Meminta input dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input dari pengguna
            System.out.println("Masukkan nama mahasiswa:");
            String nama = scanner.nextLine();
            
            System.out.println("Masukkan NIM mahasiswa:");
            String nim = scanner.nextLine();
            
            System.out.println("Masukkan jurusan/prodi mahasiswa:");
            String jurusan = scanner.nextLine();
            
            System.out.println("Masukkan alamat mahasiswa:");
            String alamat = scanner.nextLine();
            
            // Membuat objek Mahasiswa dengan input dari pengguna
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);
            
            // Memanggil metode untuk menampilkan informasi mahasiswa
            mahasiswa.tampilkanInfo();
        }
    }
}

