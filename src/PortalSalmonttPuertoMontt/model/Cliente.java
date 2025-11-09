package PortalSalmonttPuertoMontt.model;
import PortalSalmonttPuertoMontt.model.DatosFicha;

public class Cliente extends DatosFicha {

    private String sucursal;

    public Cliente(String nombre, String rut, String direccion, String telefono, String email, String sucursal) {
        super(nombre, rut, direccion, telefono, email);
        this.sucursal = sucursal;
    }

    @Override
    public void procesarInformacionFicha(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }






}
