import java.util.Scanner;

public class Menu {
    public static void pilihMenu18(Dosen18[] arrayOfDosen) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("---------------------------");
            System.out.println("     Informasi Dosen       ");
            System.out.println("---------------------------");
            System.out.println("1. Tampilkan Data Umum Semua Dosen");
            System.out.println("2. Tampilkan Jumlah Dosen Per Jenis Kelamin");
            System.out.println("3. Tampilkan Rata-rata Usia Dosen Per Jenis Kelamin");
            System.out.println("4. Tampilkan Dosen Paling Tua");
            System.out.println("5. Tampilkan Dosen Paling Muda");
            System.out.println("6. Keluar");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    DataDosen18.dataSemuaDosen(arrayOfDosen);
                    break;
                case 2:
                    DataDosen18.jumlahDosenPerJenisKelamin(arrayOfDosen);
                    break;
                case 3:
                    DataDosen18.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
                    break;
                case 4:
                    DataDosen18.infoDosenPalingTua(arrayOfDosen);
                    break;
                case 5:
                    DataDosen18.infoDosenPalingMuda(arrayOfDosen);
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("Terima kasih");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih menu yang benar.");
                    break;
            }
        }
    }
}

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    float ipk;

    public Mahasiswa() {
        this.nim = "Tidak diketahui";
        this.nama = "Tidak diketahui";
        this.kelas = "Tidak diketahui";
        this.ipk = 0.0f;
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = "Tidak diketahui";
        this.ipk = 0.0f;
    }
    
    public Mahasiswa(String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}
