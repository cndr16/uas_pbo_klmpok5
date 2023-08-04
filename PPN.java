/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uaspboklompok5;

/**
 *
 * @author @CANDRA ADI S - 22104410040
 */
public interface PPN {
    double PPNSamsung = 0.05; // Nilai PPN default (1%)ouv
    double PPNOppo = 0.02;
    double PPNXiaomi = 0.01;
    
    double hitungHargaSetelahPPN(double harga);

}
