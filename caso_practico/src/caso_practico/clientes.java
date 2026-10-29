package caso_practico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

public class clientes {
    private String nombre;
    private String cedula;
    private String telefono;
    private String categoria;
    private int mes;


    public clientes(String nombre, String cedula, String telefono, String categoria, int mes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.categoria = categoria;
        this.mes = mes;
    }


    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getCedula() { 
        return cedula; 
    }
    public void setCedula(String cedula) { 
        this.cedula = cedula; 
    }

    public String getTelefono() { 
        return telefono; 
    }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public String getCategoria() { 
        return categoria; 
    }
    public void setCategoria(String categoria) { 
        this.categoria = categoria; 
    }

    public int getMes() { 
        return mes; 
    }
    public void setMes(int mes) { 
        this.mes = mes; 
    }
}