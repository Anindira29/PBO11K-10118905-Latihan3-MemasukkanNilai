/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author 
 * Nama         : Anindira Dina Fitriani
 * Kelas        : IF11 - K
 * Deskripsi    : Memasukkan nilai dari keyboard
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda :");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah : " +nama);
        
    }
    
}
