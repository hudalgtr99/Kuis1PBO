package PBO;
/**
 * @author Miftah
 */
public class Mahasiswa {
    String nama;
    String kelas;
    int NPM;
    int usia;
    boolean status = false;
    Peminjaman anggota;
    
   
    Mahasiswa(String nama, int NPM, String kelas, int usia){
        this.nama = nama;
        this.NPM = NPM;
        this.kelas = kelas;
        this.usia = usia;
    }

    void daftarAnggota(Peminjaman anggota) {
      this.anggota = anggota;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getNPM(){
        return NPM;
    }
    public void setNPM(int NPM){
        this.NPM = NPM;
    }
    
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public int getUsia(){
        return usia;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }   
}
