/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userr;
import java.util.Scanner;
import task4.TASK4;
import task4.ulog;

/**
 *
 * @author DELDIO..CERIA..05.20
 */
public class user extends ulog{
    public String bj[];
    public int ft,ps;
    public int bjqt[];
    public String cl[];
    public int clqt[];
    public int pbj[];
    public int pcl[];
    public String nb;
    public int jb;
    private String pw;
    private String us;

    @Override
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
    public void beliBaju(){
        int f = 1;
        System.out.println("======================");
        System.out.println("\t Baju ");
        for (int i = 0; i < bj.length; i++) {
            System.out.println(f + "." + bj[i] + "\t - " + pbj[i]);
            f++;
        }
        
    }
    
}
