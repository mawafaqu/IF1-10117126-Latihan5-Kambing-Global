/*
 * 
 * @author
 * NAMA : MAWA FAQU ROCHMAN
 * KELAS : PBO1
 * NIM : 10117126
 * Deskripsi Program : 
 */

package if1.pkg10117126.latihan5.kambing.global;

/**
 *
 * @author MAWA
 */
public class KambingGlobal {
// variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    //method untuk menampilkan jumlah kambing
public void getJumlahKambing()  {
    System.out.println("Jumlah kambing: " + jumlahKambing); 

}
public void tambahKambing()  {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing); 
}
    public static void main(String[] args) {
      KambingGlobal kambingSusu = new KambingGlobal();
      
      // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
      
      // Menambah satu Kambing
      kambingSusu.tambahKambing();
      
      //Menampilkan jumlah kambing yang ada
      kambingSusu.getJumlahKambing();
    }
    
}
