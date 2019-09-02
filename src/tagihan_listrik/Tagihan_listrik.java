/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagihan_listrik;

import java.util.Scanner;

/**
 *
 * @author KANG_SNAKE
 */
public class Tagihan_listrik {
    public static void main(String[] args) {
        int kwh,biaya,totalnya;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--Program Pembayaran tagihan Listrik--");
        System.out.println("jumlah kwh perbulan: ");
        kwh = scanner.nextInt();
        
        System.out.println("\n-Golongan-");
        if(kwh <=450) {
            System.out.println("Anda termasuk gologngan C ");
            biaya = 2000 + (1000 + kwh);
            System.out.println("biaya:" + "Rp." + biaya);
            int totalbiaya = biaya + (biaya * 15/100);
            System.out.println("\ntotal biaya: " + "Rp. "+ totalbiaya);
            
        }else if (kwh <= 900) {
            System.out.println("Anda termasuk golongan B ");
            biaya = 35000 + (2500 * kwh);
            System.out.println("biay: " + "Rp. " + biaya);
            int totalbiaya = biaya + (biaya * 15/100);
            System.out.println("\ntotal biaya: " + "Rp."+ totalbiaya);
        }else if (kwh <=1200) {
            System.out.println("Anda termasuk golongan A ");
            biaya = 5000 + (3000 * kwh);
            System.out.println("biaya: " + "Rp> " +biaya);
            int totalbiaya = biaya + (biaya * 15/100);
            System.out.println("\ntotal biaya: " + "Rp. "+ totalbiaya);
        }else {
            System.out.println("Maaf Anda Memasukkan Angak Yang Tidak Sesuai");
            
           
        }
    }
    
}
