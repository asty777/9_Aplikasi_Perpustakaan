public class Buku {
    private int idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private GenreBuku genre;

    public Buku(int idBuku, String judul, String penulis, int tahunTerbit, GenreBuku genre) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
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

    public String getStatus() {
        return "Dapat dipinjam";
    }

    public void pinjam() {
        System.out.println("Buku dapat dipinjam.");
    }
    
}