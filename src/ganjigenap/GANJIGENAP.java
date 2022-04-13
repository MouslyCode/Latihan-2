/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjigenap;

import java.util.Scanner;

/**
 *
 * @author ASUS A455L
 */
public class GANJIGENAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int angka;
        
        System.out.print("Masukan angka : ");
        angka = input.nextInt();
        
        if(angka%2==0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
        
    }
    
}
