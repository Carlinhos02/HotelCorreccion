package PaqC01;

import java.io.Serializable;
import java.util.Scanner;

public class Cliente implements Serializable {

    private String nombre;
    private String apellido;
    private String dni;
    private int telefono;
    private int tarjeta;
    private int fechaEntrada;
    private int fechaSalida;

    public Cliente(){
        this.nombre=null;
        this.apellido=null;
        this.dni=null;
        this.telefono=0;
        this.tarjeta=0;
        this.fechaEntrada=0;
        this.fechaSalida=0;

    }

    public Cliente(String nombre, String apellido, String dni, int telefono, int tarjeta, int fechaEntrada, int fechaSalida){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.tarjeta = tarjeta;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setDni(String dni){
        this.dni=dni;
    }

    public String getDni(){
        return this.dni;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTarjeta(int tarjeta){
        this.tarjeta=tarjeta;
    }

    public int getTarjeta(){
        return this.tarjeta;
    }

    public void setFechaEntrada(int fechaEntrada){
        this.fechaEntrada=fechaEntrada;
    }

    public int getFechaEntrada(){
        return this.fechaEntrada;
    }

    public void setFechaSalida(int fechaSalida){
        this.fechaSalida=fechaSalida;
    }

    public int getFechaSalida(){
        return this.fechaSalida;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return this.dni == cliente.dni;
    }

}
