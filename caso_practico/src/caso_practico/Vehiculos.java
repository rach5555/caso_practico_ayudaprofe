/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico;

/**
 *
 * @author User
 */
public class Vehiculos {

    private String placa;
    private String marca;
    private double precioDia;
    private int dias;
    private boolean seguroCompleto;
    private boolean gps;
    
    private double subtotal;
    private int puntosGanados;

    public Vehiculos(String placa, String marca, double precioDia, int dias, boolean seguroCompleto, boolean gps) {
        this.placa = placa;
        this.marca = marca;
        this.precioDia = precioDia;
        this.dias = dias;
        this.seguroCompleto = seguroCompleto;
        this.gps = gps;
        calcularSubtotalYPuntos();
    }

    private void calcularSubtotalYPuntos() {
        double costoBase = precioDia * dias;
        puntosGanados = 0;

 
        if (dias > 7) {
            costoBase = costoBase - (costoBase * 0.15);
            puntosGanados += 5;
        }

        double recargoSeguro = 0;
        if (seguroCompleto) {
            recargoSeguro = 5000 * dias;
            puntosGanados += 2; 
        }

        double recargoGps = 0;
        if (gps) {
            recargoGps = 2000 * dias;
        }

     
        this.subtotal = costoBase + recargoSeguro + recargoGps;
    }

    public String getPlaca() {
        return placa;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }
}
    