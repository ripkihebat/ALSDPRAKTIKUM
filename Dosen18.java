import java.util.Scanner;

public class Dosen18 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    int usia;

    public Dosen18(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Dosen18() {
    }

    public static void tambahData(Dosen18[] arrayOfDosen) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen18();

            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.print("Kode            : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama            : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : (y=perempuan, n=laki-laki) ");
            String inputJK = sc.nextLine().toLowerCase();

            arrayOfDosen[i].jenisKelamin = inputJK.equals("y");
            System.out.print("Usia            : ");
            dummy = sc.nextLine();
            arrayOfDosen[i].usia = Integer.parseInt(dummy);
        }
        sc.close();
    }

    public static void cetakInfo(Dosen18[] arrayOfDosen) {
        System.out.println("---------------------------");
        System.out.println("Informasi Dosen");
        int counter = 1;
        for (Dosen18 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+ counter);
            System.out.println("Kode            : "+ dosen.kode);
            System.out.println("Nama            : "+ dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Perempuan" : "Laki-laki"));
            System.out.println("Usia            : "+ dosen.usia);
            System.out.println("---------------------------");
            counter++;
        }
    }
}
