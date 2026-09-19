public class BukuDapatDipinjam extends Buku implements DapatDipinjam {

    private int lamaPeminjaman;

    public BukuDapatDipinjam(
        int idBuku,
        String judul,
        String penulis,
        int tahunTerbit,
        GenreBuku genre,
        int stok,
        int lamaPeminjaman) {

        super(idBuku, judul, penulis, tahunTerbit, genre, stok);
        this.lamaPeminjaman = lamaPeminjaman;
    }
    @Override
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