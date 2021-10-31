/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author DELDIO..CERIA..05.20
 */
public class TASK4 extends adminn{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String adml[] = new String[5];
        String usr1[] = new String[5];
        
        String baju[] = {"T-Shirt", "Uniqlo", "Supreme", "Louis Vuitton"};
        int bjqt[] = {4, 7, 3, 5};
        String celana[] = {"Jeans  ", "Kain   ", "Bomber", "Celana Pendek"};
        int clqt[] = {6, 2, 6, 3};
        String us, pw;
        int gb = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("");

        System.out.println(" Selamat Datang ");
        System.out.println("[1] Admin");
        System.out.println("[2] User");
        for (int i = 0; i < 23; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.print("Pilih : ");

        int pilih = scan.nextInt();
        if (pilih == 1) {
            adminn ad = new adminn();
            ad.log();
            while (gb < 1) {
                System.out.println("========================");
                System.out.println("Selamat Datang Admin");
                System.out.println("[1] Cek Stock Barang");
                System.out.println("[2] Cek History Pembelian");
                System.out.println("[3] Ubah data");
                System.out.println("[4] Keluar");
                int pilih1 = scan.nextInt();
                if (pilih1 == 1) {
                    ad.bj = baju;
                    ad.bjqt = bjqt;
                    ad.cl = celana;
                    ad.clqt = clqt;
                    ad.barangCek();
                    

                } else if (pilih1 == 2) {
                    System.out.println("");
                } else if (pilih1 == 3){
                    ad.bj = baju;
                    ad.bjqt = bjqt;
                    ad.cl = celana;
                    ad.clqt = clqt;
                    System.out.println("");
                    ad.ubahData();
                    if (ad.ps == 1){
                        baju[ad.ft] = ad.bj[ad.ft];
                        bjqt[ad.ft] = ad.bjqt[ad.ft];
                    }
                    else if (ad.ps == 2){
                        celana[ad.ft] = ad.nb;
                        clqt[ad.ft] = ad.jb;
                    }
                    
                    
                    
                }
            }

        } else if (pilih == 2) {
            gb++;

        } else if (pilih == 3) {

        } else {
            System.out.println("");
        }

    }

}
