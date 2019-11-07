/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Gaji gaji = new Gaji();
       
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(),gaji.getUangTransport(),
                gaji.getGajiPokok(), gaji.totalGaji(gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok()));
    }
    
}
