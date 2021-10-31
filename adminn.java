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
public class adminn {

    protected String bj[];
    public int ft,ps;
    protected int bjqt[];
    protected String cl[];
    protected int clqt[];
    public String nb;
    public int jb;
    private String pw;
    private String us;

    public void log() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Login");
        System.out.print("Username : ");
        us = scan.next();

        int z = 0;
        System.out.println(us);

        while (z < 3) {
            System.out.print("Password : ");
            pw = scan.next();
            if ("betul".equals(pw)) {

                z = 4;

            } else {
                System.out.println("PW SALAH");
                z++;

            }

        }
    }

    void barangCek() {
        int f = 1;
        System.out.println("======================");
        System.out.println("\t Baju ");
        for (int i = 0; i < bj.length; i++) {
            System.out.println(f + "." + bj[i] + "\t - " + bjqt[i]);
            f++;
        }
        System.out.println("----------------------");
        System.out.println("\t Celana");
        f = 1;
        for (int i = 0; i < cl.length; i++) {
            System.out.println(f + "." + cl[i] + "\t - " + clqt[i]);
            f++;
        }

    }

    void ubahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("[1] Baju");
        System.out.println("[2] Celana");
        System.out.println(": ");
        int pil = scan.nextInt();
        
        if (pil == 1) {
            ps = pil;
            int f = 1;
            System.out.println("======================");
            System.out.println("\t Baju ");
            for (int i = 0; i < bj.length; i++) {
                System.out.println(f + "." + bj[i] + "\t - " + bjqt[i]);
                f++;
            }

            System.out.println(": ");
            int pp = scan.nextInt();
            if (pp == 1 || pp == 2 || pp == 3 || pp == 4) {
                
                pp--;
                ft = pp;
                System.out.println("Masukkan nama baru : ");
                String nb = scan.next();
                bj[pp] = nb;
                System.out.println("Masukkan Jumlah baru : ");
                int jb = scan.nextInt();
                bjqt[pp] = jb;
            }

        } else if (pil == 2) {
            ps = pil;
            System.out.println("----------------------");
            System.out.println("\t Celana");
            int f = 1;
            for (int i = 0; i < cl.length; i++) {
                System.out.println(f + "." + cl[i] + "\t - " + clqt[i]);
                f++;
            }
            System.out.println(": ");
            int pp = scan.nextInt();
            if (pp == 1 || pp == 2 || pp == 3 || pp == 4) {
                System.out.println("Masukkan nama baru : ");
                String nb = scan.next();
                System.out.println("Masukkan Jumlah baru : ");
                int jb = scan.nextInt();
                pp--;
                cl[pp] = nb;
                clqt[pp] = jb;
            }

        }
    }

}
