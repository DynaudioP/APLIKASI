/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawat;

import java.util.Scanner;

class P {
    int jml,tagih,kembali,pilihan,bayar,ps,harga;
    int par1 = 0;
    int par2 = 1;
    
    String tiket1[][] = {{"","Jakarta", "Bandung", "Banjarmasin", "Mataram"},{"","800000","700000","750000","950000"}};
    
    
    
    
    
    String kursi1[][] = {{""},{"","A1", "A2", "A3", "A4", "A5"},{"","B1", "B2", "B3", "B4", "B5"},{"","C1", "C2", "C3", "C4", "C5"},{"","D1", "D2", "D3", "D4", "D5"}};
    
    
    void lihatHarga(){
        System.out.println("Harga Tiketnya sebesar "+ harga);
        
        for (int i = 0; i < 23; i++){
            System.out.print("=");
        }
    }
    
    void bayarTiket(){
        
        
        
    }
    
    void kembalian(){
        System.out.println(bayar);
        jml = bayar - harga;
        
        
    }
  
}
/**
 *
 * @author DELDIO..CERIA..05.20
 */
public class PESAWAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tikett[][] = {{"","Jakarta", "Bandung", "Banjarmasin", "Mataram"},{"","800000","700000","750000","950000"}};
    
    
    
    
    
        String seat1[][] = {{""},{"","A1", "A2", "A3", "A4", "A5"},{"","B1", "B2", "B3", "B4", "B5"},{"","C1", "C2", "C3", "C4", "C5"},{"","D1", "D2", "D3", "D4", "D5"}};
        Scanner scan = new Scanner(System.in);
        P pswt = new P();
        for (int i = 0; i < 23; i++){
        System.out.print("=");  
        }
        System.out.println("");
        System.out.print("Masukan Nama Anda : ");
        String nama = scan.next();
        
        System.out.println("");
        
        System.out.println("Selamat Datang " + nama);
        System.out.println("Di Airline Kelompok 1");
        for (int i = 0; i < 23; i++){
        System.out.print("=");  
        }
        System.out.println("");
        
        int var1 = 0;
        int var2 = 1;
        
        
        for (int i = 1; i < tikett[var1].length; i++){
            System.out.println(i + "."+ tikett[var1][i]+ "\t - "+ tikett[var2][i]);
        }
        System.out.println("5.Keluar");
        System.out.print("Pilih : ");
        int pilih = scan.nextInt();
        
        if (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4){
            System.out.println("1. Booking Ticket");
            System.out.println("2. Cek Kursi");
            System.out.println("3. Kembali");
            System.out.println("Pilih : ");
            int pilih1 = scan.nextInt();
            for (int i = 0; i < 23; i++){
                System.out.print("=");  
                }
            System.out.println("");
            
            if (pilih1 == 1){
                for (int i = 1; i < seat1[pilih].length; i++){
                    System.out.println(i + ". \t"+ seat1[pilih][i]);
                }
                System.out.println("Pilih : ");
                int pilih2 = scan.nextInt();
                if (pilih2 == 1 || pilih2 == 2 || pilih2 == 3 || pilih2 == 4 || pilih2 == 5){
                    pswt.pilihan = pilih2;
                    
                    int hargas = Integer.parseInt(tikett[var2][pilih2]);
                    pswt.harga = hargas;
                    System.out.println(hargas);
                    pswt.lihatHarga();
                    
                    
                    int  z = 0;
                    while (z == 0){
                        System.out.println("");
                        System.out.println("Masukkan Uang anda : ");
                        int pay = scan.nextInt();
                        pswt.bayar = pay;
                    
                        System.out.println("");
                        if (pay > hargas){
                            pswt.kembalian();
                            z++;
                        }else{
                            System.out.println("Uang Anda Kurang, Ulangi");
                        }
                        
                    }
                    
      
                    System.out.println("Kembalian anda sebesar "+ pswt.jml);
                    
                    System.out.println("Terimakasih");
                    
                    
                    
                    
                }
                
                
            
            }
            else if (pilih1 == 2){
                for (int i = 0; i < 23; i++){
                System.out.print("=");  
                }
                
                
                
            
            }
            else {
                
            }
        
        } else{
            System.out.println("Terimakasih");
        }

        // TODO code application logic here
    }
    
}
