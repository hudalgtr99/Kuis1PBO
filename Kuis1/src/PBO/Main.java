package PBO;
/**
 * @author Miftah
 */

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Miftahul Huda Guntara", 2015061038, "TI A", 20);
        new Peminjaman(mhs1);
        mhs1.daftarAnggota(new Peminjaman(mhs1));
        System.out.println("Peminjaman ke : " + mhs1.anggota.id_anggota);

        //EKSEKUSI BUKU
        Buku buku1 = new Buku("Buku Paket PBO Advance", "Acediaz", 1011, 99);
        buku1.show();
        mhs1.anggota.pinjamBuku(buku1);
    }
    
}
