public abstract class Buku {
    private int idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private GenreBuku genre;
    private int stok;

    public Buku(int idBuku, String judul, String penulis, int tahunTerbit, GenreBuku genre, int stok) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.stok = stok;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public GenreBuku getGenre() {
        return genre;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    public void tambahStok() {
        stok++;
    }

    public abstract String getStatus();

    public abstract void pinjam();
    
}