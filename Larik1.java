/**
 * Larik1
 */
public class Larik1 {

    public static void main(String[] args) {
        // Deklarasi array
        String[] nama = new String[5];
        // isi data array
        nama[0] = "Selamet Winaryo";
        nama[1] = "Muhammad Sodikin";
        nama[2] = "Indah Tri S.";
        nama[3] = "Sibrol Malisi";
        nama[4] = "Fajar Prasetyo";

        String[] jurusan= {"OAA","ASE","AIS","IK","AK"};

        // menampilkan data array
        System.out.println(nama[2]);
        nama[2] = "Prihananto";

        System.out.println("nama baru :"+nama[2]);
    }
}