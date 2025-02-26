import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        Dosen18[] arrayOfDosen = new Dosen18[jumlahDosen];

        Dosen18.tambahData(arrayOfDosen);
        Dosen18.cetakInfo(arrayOfDosen);
        DataDosen18.dataSemuaDosen(arrayOfDosen);
        DataDosen18.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen18.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen18.infoDosenPalingTua(arrayOfDosen);
        DataDosen18.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
