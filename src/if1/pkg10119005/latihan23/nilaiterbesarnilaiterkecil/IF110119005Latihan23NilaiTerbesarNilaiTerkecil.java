/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan23.nilaiterbesarnilaiterkecil;
import java.util.Scanner;


/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program untuk mencari nilai terbesar dan terkecil
 */
public class IF110119005Latihan23NilaiTerbesarNilaiTerkecil {

    /**
     * @param args the command line arguments
     */
        static Scanner scanner = new Scanner(System.in);
        int nilai[];
        String petugas;
        
        private void masukkanNilai(){
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        int jumlah = scanner.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scanner.nextInt();
        }
    }        
    
    private int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }            
        }        
        return nilaiTerkecil;
    }        
    
    private int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0]; 
        for(int x : nilai){           
           if(nilaiTerbesar < x){
                nilaiTerbesar = x;
           }            
        }        
        return nilaiTerbesar;
    }
    
    private void tampilNilai(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println("\nNilai Terbesar adalah "+nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil());
        System.out.println("\nPetugas : "+petugas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        IF110119005Latihan23NilaiTerbesarNilaiTerkecil data = new IF110119005Latihan23NilaiTerbesarNilaiTerkecil();
        data.masukkanNilai();        
        data.tampilNilai();        
        System.out.println("Developed by : Hayin Ananta");
        
    }
}    