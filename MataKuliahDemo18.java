import java.util.Scanner;

public class MataKuliahDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlahMataKuliah = sc.nextInt();
        MataKuliah18[] arrayOfMataKuliah = new MataKuliah18[jumlahMataKuliah];

        MataKuliah18.tambahData(arrayOfMataKuliah);
        MataKuliah18.cetakInfo(arrayOfMataKuliah);
        sc.close();
        }
    }

