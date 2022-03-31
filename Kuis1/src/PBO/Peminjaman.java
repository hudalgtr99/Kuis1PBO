package PBO;

/**
 * @author Miftah
 */
public class Peminjaman {
   static int id_anggota = 0;
   private boolean pinjam = false;
   private String nama;
   private int NPM;

   Peminjaman(Mahasiswa peminjam) {
      this.nama = peminjam.getNama();
      this.NPM = peminjam.getNPM();
      this.id_anggota = 1;
   }

   boolean pinjam() {
      return this.pinjam;
   }

   void pinjamBuku(Buku buku) {
      buku.kurangStock(1);
      buku.setStock("kurang", 1);
      System.out.println( nama +  " Telah meminjam buku!!! ");
      this.pinjam = true;
   }

   void kembalikanBuku(Buku buku) {
      buku.setStock("tambah", 1);
      // if buku.stock
      System.out.println( nama +  " Telah mengembalikan buku!!! ");
      this.pinjam = false;
   }
}