package proglan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi harga barang
        int hargaApple = 10000;
        int hargaPisang = 10000;
        int hargaAnggur = 10000;
        int hargajeruk = 10000;


        // Inisialisasi jumlah barang
        int jumlahApple = 0;
        int jumlahPisang = 0;
        int jumlahAnggur = 0;
        int jumlahjeruk = 0;


        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah masing-masing barang
        System.out.print("Masukkan jumlah apple yang dibeli: ");
        jumlahApple = scanner.nextInt();
        System.out.print("Masukkan jumlah pisang yang dibeli: ");
        jumlahPisang = scanner.nextInt();
        System.out.print("Masukkan jumlah anggur yang dibeli: ");
        jumlahAnggur = scanner.nextInt();
        System.out.print("Masukkan jumlah jeruk yang dibeli: ");
        jumlahjeruk = scanner.nextInt();



        // Menghitung total harga
        int totalHarga = (jumlahApple * hargaApple) + (jumlahPisang * hargaPisang) + (jumlahAnggur * hargaAnggur) + (jumlahjeruk * hargajeruk);

        // Menampilkan total harga
        System.out.println("Total harga: " + totalHarga + " Rupiah");

        // Menutup scanner
        scanner.close();
    }
}
