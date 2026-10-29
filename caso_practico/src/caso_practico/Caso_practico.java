/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_practico;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Caso_practico {


    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite el nombre:");
        String cedula = JOptionPane.showInputDialog("Digite la cedula:");
        String telefono = JOptionPane.showInputDialog("Digite el telefono:");
        String categoria = JOptionPane.showInputDialog("Digite la categoria (VIP / Regular):");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes (1 al 12):"));

        clientes miCliente = new clientes(nombre, cedula, telefono, categoria, mes);

        double subtotalGeneral = 0;
        int puntosGenerales = 0;
        int cantidadVehiculos = 0;

        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {
            String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
            String marca = JOptionPane.showInputDialog("Marca del vehiculo:");
            double precioDia = Double.parseDouble(JOptionPane.showInputDialog("Precio por dia:"));
            int dias = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de dias:"));

            String seguroInput = JOptionPane.showInputDialog("Incluye seguro? (si/no):");
            boolean seguro = seguroInput.equalsIgnoreCase("si");

            String gpsInput = JOptionPane.showInputDialog("Incluye GPS? (si/no):");
            boolean gps = gpsInput.equalsIgnoreCase("si");

            Vehiculos v = new Vehiculos(placa, marca, precioDia, dias, seguro, gps);

            subtotalGeneral += v.getSubtotal();
            puntosGenerales += v.getPuntosGanados();
            cantidadVehiculos++;

            JOptionPane.showMessageDialog(null, "Subtotal de este carro: " + v.getSubtotal() + "\nPuntos: " + v.getPuntosGanados());

            respuesta = JOptionPane.showInputDialog("Desea registrar otro vehiculo? (si/no):");
        }

        double totalPagar = subtotalGeneral;
        int puntosTotales = puntosGenerales;

        if (categoria.equalsIgnoreCase("VIP")) {
            totalPagar = subtotalGeneral - (subtotalGeneral * 0.05);
            puntosTotales = puntosGenerales * 2;
        }

        JOptionPane.showMessageDialog(null, "RESUMEN FINAL - Total: " + totalPagar + "\nPuntos: " + puntosTotales);
    }