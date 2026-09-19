public class BukuTidakDapatDipinjam extends Buku {

    private String lokasiRak;

    public BukuTidakDapatDipinjam(
        int idBuku,
        String judul,
        String penulis,
        int tahunTerbit,
        GenreBuku genre,
        int stok,
        String lokasiRak) {

        super(idBuku, judul, penulis, tahunTerbit, genre, stok);
        this.lokasiRak = lokasiRak;
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    @Override
    public void pinjam() {
        System.out.println("Buku tidak dapat dipinjam dan hanya dapat dibaca di perpustakaan.");
    }

    @Override
    public String getStatus() {
        return "Tidak dapat dipinjam";
    }
}
