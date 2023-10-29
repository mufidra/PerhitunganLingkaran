/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan22_perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO22
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Perhitungan Lingkaran
 */
public class SI_RegPagi_22166010_Latihan22_PerhitunganLingkaran {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double phi = 3.14;
        System.out.println("============Perhitungan Nilai Lingkaran===========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        
        double diameter= input.nextInt();
        double jarijari = diameter / 2;
        double luas = phi * jarijari*jarijari;
        double keliling = 2 * phi * jarijari;
        System.out.println("Jari-jari Lingkaran = "+jarijari);
        System.out.println("Luas Lingkaran = "+luas);
        System.out.println("Keliling Lingkaran = "+keliling);
    }
}
