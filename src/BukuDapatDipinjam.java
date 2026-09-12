public class BukuDapatDipinjam extends Buku {

    private int lamaPeminjaman;

    public BukuDapatDipinjam(int idBuku, String judul, String penulis, int tahunTerbit, GenreBuku genre, int lamaPeminjaman) {
        super(idBuku, judul, penulis, tahunTerbit, genre);
        this.lamaPeminjaman = lamaPeminjaman;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }
    @Override
    public void pinjam() {
        System.out.println("Durasi peminjaman: " + lamaPeminjaman + " hari.");
    }

    @Override
    public String getStatus() {
        return "Dapat dipinjam";
    }
}