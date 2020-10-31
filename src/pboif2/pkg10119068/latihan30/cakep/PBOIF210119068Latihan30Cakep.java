/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan warna cakep
 */
public class PBOIF210119068Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    
    public static final String red = "\u001b[31m";
    public static final String green = "\u001b[32m";
    public static final String yellow = "\u001b[33m";
    public static final String blue = "\u001b[34m";
    public static final String purple = "\u001b[35m";
    public static final String cyan = "\u001b[36m";
    public static final String black = "\u001b[30m";
    
    public static void kondisi(String hasil){
        if ("Yoi".equals(hasil)){
            System.out.println(red + "Cakep Bener," + purple + " goog job");
        }else {
            System.out.println(red+"Tetep Cakep Sih....");
            System.out.println(cyan+"sing penting paham konsepnya yeee...");
            System.out.println("Keep the code work dude");
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        String hasil;
        System.out.println(red + "kamu " + green + "ngerjain sendiri " + yellow + "latihan 17 sampe " + blue + "latihan 30 ini?");
        System.out.print(blue + "Jawab " + red + "(Yoi/Enggak) : ");
        hasil = keyboard.next();
        System.out.println();
        kondisi(hasil);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
