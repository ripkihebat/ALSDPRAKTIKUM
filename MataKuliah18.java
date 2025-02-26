import java.util.Scanner;

public class MataKuliah18 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public MataKuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah18() {
    }

    public static void tambahData(MataKuliah18[] arrayOfMataKuliah) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i] = new MataKuliah18();

            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            arrayOfMataKuliah[i].kode = sc.nextLine();
            System.out.print("Nama        : ");
            arrayOfMataKuliah[i].nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            arrayOfMataKuliah[i].sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            arrayOfMataKuliah[i].jumlahJam = Integer.parseInt(dummy);
        }
        sc.close();
    }

    public static void cetakInfo(MataKuliah18[] arrayOfMataKuliah) {
        System.out.println("---------------------------");
        System.out.println("Informasi Mata Kuliah");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode        : "+ arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : "+ arrayOfMataKuliah[i].nama);
            System.out.println("SKS         : "+ arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayOfMataKuliah[i].jumlahJam);
            System.out.println("---------------------------");
        }
    }
}