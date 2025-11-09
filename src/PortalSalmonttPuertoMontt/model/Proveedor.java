package PortalSalmonttPuertoMontt.model;
import PortalSalmonttPuertoMontt.model.DatosFicha;

public class Proveedor extends DatosFicha {

    private String CentroDeCosto;

    public Proveedor(String nombre, String rut, String direccion, String telefono, String email, String CentroDeCosto){
        super(nombre, rut, direccion, telefono, email);
        this.CentroDeCosto = CentroDeCosto;
    }

    @Override
    public void procesarInformacionFicha(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Centro de costo: " + CentroDeCosto);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }
}
