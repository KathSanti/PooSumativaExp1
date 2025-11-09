package PortalSalmonttPuertoMontt.model;

public abstract class DatosFicha {

    protected String nombre;
    protected String rut;
    protected String direccion;
    protected String telefono;
    protected String email;



    public DatosFicha(String nombre, String rut, String direccion, String telefono, String email) {
        if(!rut.matches("[0-9]+-[0-9kK]")){
            throw new IllegalArgumentException("Formato de rut no valido");
        }
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DatosFicha{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public abstract void procesarInformacionFicha();
}
