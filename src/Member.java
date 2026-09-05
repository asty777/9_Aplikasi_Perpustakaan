import java.util.ArrayList;

public class Member {
    private int idMember;
    private String nama;
    private String email;
    private ArrayList<Buku> bukuDipinjam;

    public Member(int idMember, String nama, String email) {
        this.idMember = idMember;
        this.nama = nama;
        this.email = email;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        bukuDipinjam.add(buku);
        System.out.println(nama + " meminjam buku: " + buku.getJudul());
    }

    public void tampilkanBuku() {
        System.out.println("\n===== BUKU YANG DIPINJAM =====");
        System.out.println("Member: " + nama);

        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            for (Buku buku : bukuDipinjam) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }

    public int getIdMember() {
    return idMember;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}