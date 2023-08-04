package uaspboklompok5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil = 0;

        System.out.println("Menu Pilihan:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.print("Masukkan pilihan Anda: ");

        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hasil = a + b;
                break;
            case 2:
                hasil = a - b;
                break;
            default:
                System.out.println("Pilihan Anda salah");
        }

        System.out.println("Hasil: " + hasil);
    }
}
