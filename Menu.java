AAAAAA SUSAH GAMAU AH NGIDE NGIDE LAGI


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
