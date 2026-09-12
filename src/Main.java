public class Main {
    public static void main(String[] args) {

        // tambah genre buku
        GenreBuku novel = new GenreBuku(1, "Novel");
        GenreBuku teknologi = new GenreBuku(2, "Teknologi");
        GenreBuku sejarah = new GenreBuku(3, "Sejarah");


    // buku tidak dapat dipinjam
    BukuTidakDapatDipinjam buku1 = new BukuTidakDapatDipinjam(
        101,
        "Ensiklopedia Indonesia",
        "Tim Ensiklopedia",
        2020,
        sejarah,
        "Rak A1"
    );

    // buku yang dapat dipinjam
    BukuDapatDipinjam buku2 = new BukuDapatDipinjam(
        102,
        "Belajar Java",
        "Budi Santoso",
        2024,
        teknologi,
        7
    );

    BukuDapatDipinjam buku3 = new BukuDapatDipinjam(
        103,
        "Laskar Pelangi",
        "Andrea Hirata",
        2005,
        novel,
        14
    );

        // tambah Member
        Member member1 = new Member(
            1,
            "Asty",
            "asty@gmail.com"
        );

        Member member2 = new Member(
            2,
            "Belinda",
            "belinda@gmail.com"
        );

        // Menampilkan buku
        System.out.println("===== DAFTAR BUKU =====");

        System.out.println("ID Buku     : " + buku1.getIdBuku());
        System.out.println("Judul       : " + buku1.getJudul());
        System.out.println("Penulis     : " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
        System.out.println("Genre       : " + buku1.getGenre().getNamaGenre());
        System.out.println("Status      : " + buku1.getStatus());

        System.out.println();

        System.out.println("ID Buku     : " + buku2.getIdBuku());
        System.out.println("Judul       : " + buku2.getJudul());
        System.out.println("Penulis     : " + buku2.getPenulis());
        System.out.println("Tahun Terbit: " + buku2.getTahunTerbit());
        System.out.println("Genre       : " + buku2.getGenre().getNamaGenre());
        System.out.println("Genre       : " + buku2.getGenre().getNamaGenre());
        System.out.println("Status      : " + buku2.getStatus());

        System.out.println();

        System.out.println("ID Buku     : " + buku3.getIdBuku());
        System.out.println("Judul       : " + buku3.getJudul());
        System.out.println("Penulis     : " + buku3.getPenulis());
        System.out.println("Tahun Terbit: " + buku3.getTahunTerbit());
        System.out.println("Genre       : " + buku3.getGenre().getNamaGenre());
        System.out.println("Status      : " + buku3.getStatus());

        // meminjam buku
        System.out.println("\n===== PEMINJAMAN BUKU =====");

        member1.pinjamBuku(buku1);
        member1.pinjamBuku(buku2);
        member2.pinjamBuku(buku3);

        // Menampilkan buku yang dipinjam
        member1.tampilkanBuku();
        member2.tampilkanBuku();
    }
}