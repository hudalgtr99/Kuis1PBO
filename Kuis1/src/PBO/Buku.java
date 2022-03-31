package PBO;
/**
 * @author Miftah
 */
public class Buku {
   private String judul, penulis;
   int jumlah_halaman;
   private int stock;
   private boolean status;

   Buku(String judul, String penulis, int jumlah_halaman, int stock) {
      this.judul = judul;
      this.penulis = penulis;
      this.jumlah_halaman = jumlah_halaman;
      this.stock = stock;
   }

   void show() {
      System.out.println("==========================================="
                       + "\n           === DETAIL BUKU ===\n"
                       + "===========================================\n");
      System.out.println("=== Judul    : " + this.judul);
      System.out.println("=== Penulis  : " + this.penulis);
      System.out.println("=== Hal      : " + this.jumlah_halaman + " hal");
      System.out.println("=== Stock    : " + this.stock + " item");
      System.out.println("\n===========================================");
   }
   int getStock() {
      return this.stock;
   }

   void kurangStock(int proses) {
      this.stock -= proses;
   }

   void tambahStock(int proses) {
      this.stock += proses;
   }

   void setStock(String kondisi, int value) {
      this.stock = (kondisi == "tambah" ? this.stock + value : this.stock - value);
   }
}
