public class GenreBuku {
    private int idGenre;
    private String namaGenre;

    public GenreBuku(int idGenre, String namaGenre) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }
}