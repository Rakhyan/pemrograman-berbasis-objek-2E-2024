/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author Katri
 */
public class ClassManusia {
    // Atribut
    private String nama;
    private int umur;
    private String alamat;

    // Konstruktor
    public ClassManusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Metode berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    // Metode berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }

    public static void main(String[] args) {
        // Membuat beberapa objek Manusia
        ClassManusia orang1 = new ClassManusia("Andi", 25, "Jl. Merdeka No. 10");
        ClassManusia orang2 = new ClassManusia("Budi", 30, "Jl. Jenderal Sudirman No. 20");
        ClassManusia orang3 = new ClassManusia("Cici", 22, "Jl. Pahlawan No. 5");

        // Memanggil metode berjalan dan berlari untuk setiap objek
        orang1.berjalan();
        orang2.berlari();
        orang3.berjalan();
    }
}

