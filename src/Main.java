import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tambah Genre Buku
        GenreBuku novel = new GenreBuku(1, "Novel");
        GenreBuku teknologi = new GenreBuku(2, "Teknologi");
        GenreBuku sejarah = new GenreBuku(3, "Sejarah");


        //Tambah Buku
        BukuTidakDapatDipinjam buku1 = new BukuTidakDapatDipinjam(
            101,
            "Ensiklopedia Indonesia",
            "Tim Ensiklopedia",
            2020,
            sejarah,
            5,
            "Rak A1"
        );

        BukuDapatDipinjam buku2 = new BukuDapatDipinjam(
            102,
            "Belajar Java",
            "Budi Santoso",
            2024,
            teknologi,
            5,
            7
        );

        BukuDapatDipinjam buku3 = new BukuDapatDipinjam(
            103,
            "Laskar Pelangi",
            "Andrea Hirata",
            2005,
            novel,
            3,
            14
        );


        // Tambah Member
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


        //Daftar Buku
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(buku1);
        daftarBuku.add(buku2);
        daftarBuku.add(buku3);


        //Peminjaman Buku
        member1.pinjamBuku(buku1);
        member1.pinjamBuku(buku2);
        member2.pinjamBuku(buku3);


        // Member
        ArrayList<Member> daftarMember = new ArrayList<>();

        daftarMember.add(member1);
        daftarMember.add(member2);


        // MENU
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       SISTEM PERPUSTAKAAN");
            System.out.println("=================================");
            System.out.println("A. Tampilkan Daftar Buku");
            System.out.println("B. Tampilkan Buku yang Dipinjam");
            System.out.println("C. Tampilkan Daftar Member");
            System.out.println("D. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu: ");

            String pilihan = scanner.nextLine().toUpperCase();


            // List Daftar Buku
            if (pilihan.equals("A")) {

                System.out.println("\n==================== DAFTAR BUKU ====================");

                System.out.printf(
                    "%-8s %-25s %-20s %-12s %-15s %-8s%n",
                    "ID",
                    "Judul",
                    "Penulis",
                    "Tahun",
                    "Genre",
                    "Stok"
                );

                System.out.println(
                    "--------------------------------------------------------------------------------"
                );

                for (Buku buku : daftarBuku) {

                    System.out.printf(
                        "%-8d %-25s %-20s %-12d %-15s %-8d%n",
                        buku.getIdBuku(),
                        buku.getJudul(),
                        buku.getPenulis(),
                        buku.getTahunTerbit(),
                        buku.getGenre().getNamaGenre(),
                        buku.getStok()
                    );
                }


            // List Buku yang Dipinjam
            } else if (pilihan.equals("B")) {

                System.out.println("\n================ BUKU YANG DIPINJAM ================");

                for (Member member : daftarMember) {

                    System.out.println("\nMember: " + member.getNama());

                    if (member.getBukuDipinjam().isEmpty()) {

                        System.out.println("Tidak ada buku yang dipinjam.");

                    } else {

                        System.out.printf(
                            "%-8s %-25s %-20s%n",
                            "ID",
                            "Judul",
                            "Penulis"
                        );

                        System.out.println(
                            "-------------------------------------------------------"
                        );

                        for (Buku buku : member.getBukuDipinjam()) {

                            System.out.printf(
                                "%-8d %-25s %-20s%n",
                                buku.getIdBuku(),
                                buku.getJudul(),
                                buku.getPenulis()
                            );
                        }
                    }
                }


            // List Daftar Member
            } else if (pilihan.equals("C")) {

                System.out.println("\n==================== DAFTAR MEMBER ====================");

                System.out.printf(
                    "%-10s %-20s %-30s%n",
                    "ID",
                    "Nama",
                    "Email"
                );

                System.out.println(
                    "------------------------------------------------------------"
                );

                for (Member member : daftarMember) {

                    System.out.printf(
                        "%-10d %-20s %-30s%n",
                        member.getIdMember(),
                        member.getNama(),
                        member.getEmail()
                    );
                }

            } else if (pilihan.equals("D")) {

                System.out.println("\nProgram selesai.");
                break;

            } else {

                System.out.println("\n[ERROR] Pilihan menu tidak tersedia.");
            }
        }

        scanner.close();
    }
}