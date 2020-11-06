/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan38.perhitunganlingkaran.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Data Program Perhitungan Lingkaran Berbasis Object Oriented
 */

import java.util.Scanner;
public class PerhitunganLingkaran {

    static Scanner scan = new Scanner(System.in);
    private static double dimeterLingkaran;

    private static void validasi(String diameter){
        if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            masukkanDiameter();
        }else{
            dimeterLingkaran = Double.parseDouble(diameter);
        }
    }

    private static void masukkanDiameter(){
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        validasi(scan.next());
    }
    

    public static void main(String[] args) {
        Latihan38PerhitunganLingkaranOO lingkaran = new Latihan38PerhitunganLingkaranOO();
        masukkanDiameter();
        lingkaran.hitung(dimeterLingkaran);
        System.out.println("Developed by : Alfi Nurizkya");
    }
}

