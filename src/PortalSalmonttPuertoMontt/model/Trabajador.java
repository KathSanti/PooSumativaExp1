package PortalSalmonttPuertoMontt.model;
import PortalSalmonttPuertoMontt.model.DatosFicha;

public class Trabajador extends DatosFicha {

    private String ApellidoPaterno;
    private String ApellidoMaterno;

    public Trabajador(String nombre, String ApellidoPaterno, String ApellidoMaterno, String rut, String direccion, String telefono, String email) {
        super(nombre, rut, direccion, telefono, email);
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
    }


    @Override
    public void procesarInformacionFicha(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + ApellidoPaterno);
        System.out.println("Apellido Materno: " + ApellidoMaterno);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }

}
