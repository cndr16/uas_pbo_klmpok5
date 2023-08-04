/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspboklompok5;

/**
 *
 * @author @CANDRA ADI S - 22104410040
 */
public class smartphone implements PPN{
    private String vendor;
    private String tipe;
    private double harga;

    public smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    @Override
    public double hitungHargaSetelahPPN(double harga) {
        double pajak = 0;
        if (harga > 4500000) {
            pajak = PPNSamsung;
        } else if (harga > 4200000) {
            pajak = PPNOppo;
        } else if (harga > 4000000) {
            pajak = PPNXiaomi;
        }
        return harga + (harga * pajak);
    }

    public void tampilkanInformasi() {
        double hargaSetelahPPN = hitungHargaSetelahPPN(harga);
        System.out.println("Informasi Smartphone:");
        System.out.println("Vendor: " + vendor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Harga setelah ditambah PPN: Rp" + hargaSetelahPPN);
    }

    public static void main(String[] args) {
        smartphone samsung = new smartphone("Samsung", "A 51", 5000000);
        smartphone oppo = new smartphone("Oppo", "Reno 5", 4400000);
        smartphone xiaomi = new smartphone("Xiaomi", "A1", 4100000);

        samsung.tampilkanInformasi();
        oppo.tampilkanInformasi();
        xiaomi.tampilkanInformasi();
        
}
}


   