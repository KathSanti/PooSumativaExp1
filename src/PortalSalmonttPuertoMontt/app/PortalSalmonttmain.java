package PortalSalmonttPuertoMontt.app;
import PortalSalmonttPuertoMontt.model.DatosFicha;
import PortalSalmonttPuertoMontt.model.Cliente;
import PortalSalmonttPuertoMontt.model.Trabajador;
import PortalSalmonttPuertoMontt.model.Proveedor;

import java.util.Scanner;

public class PortalSalmonttmain {


    public static void main(String[] args) {

        DatosFicha Trabajador1 = new Trabajador("Mercedes","Carrasco","Guerrero","20983567-2","Zulamita #340, Puerto Octay","995874567", "MercedesF@gmail.com");
        DatosFicha Trabajador2 = new Trabajador("Matias","Avedaño","Guajardo","17456789-5","Intendente Saaveda 786, Rio Negro","998887567", "Matiavdeano.G@gmail.com");
        DatosFicha Trabajador3 = new Trabajador("Giselle","Tapia","Maquera","11855182-3","Saturno #245, Osorno","988774458", "GiselleTapia.mA@gmail.com");


        DatosFicha proveedor1 = new Proveedor("EatFish","76456785-8","Entre Lagos #556, Osorno","225687856","EatFish@proveedores.cl","0001560");
        DatosFicha proveedor2 = new Proveedor("DocumentSExpress","75785456-5","Villa Colonial 786, Santiago","256789456","documentsexpress@proveedores.cl","0001561");
        DatosFicha proveedor3 = new Proveedor("ClinicVet","74587475-7","Salto del Petohue #146, Osorno","227777856","clinicvet@proveedores.cl","0001562");



        DatosFicha cliente1 = new Cliente("Cugat S.A", "76407505-6","Avenida San Ramon 3202, Rancagua","225678978","ServicioProvedores@cugat.cl","Puente Chifin 715, Río Negro");
        DatosFicha cliente2 = new Cliente("Walmart S.A", "76407505-7","AV. PRESIDENTE EDUARDO FREI MONTALVA 8301, Santiago","225678557","ServicioProvedores@walmart.cl","Bellavista 257, Recoleta");
        DatosFicha cliente3 = new Cliente("Kiosko Don pepito", "76407505-8","Avenida los vientos 3782, Rancagua","225557828","ServicioProvedores@donpepito.cl","Rios y lagos 385, Puerto Montt");

        boolean salir = false;


        do{
            System.out.println("=========================================");
            System.out.println("|                                        |");
            System.out.println("|         PORTAL ADMINISTRATIVO          |");
            System.out.println("|         SALMONTT PUERTO MONTT          |");
            System.out.println("|                                        |");
            System.out.println("=========================================");

            Scanner sc = new Scanner(System.in);

            System.out.println("\nPor favor escoga la ficha administrativa que desea revisar:");
            System.out.println("1. Trabajadores");
            System.out.println("2. Proveedores");
            System.out.println("3. Clientes");
            System.out.print("Opción: ");
            String opcion = sc.nextLine().trim();


            switch (opcion){
                case "1":
                    System.out.println("\n╔════════════════════════════════╗");
                    System.out.println("║        LISTA TRABAJADORES      ║");
                    System.out.println("╚════════════════════════════════╝");
                    DatosFicha[] trabajadores = {Trabajador1, Trabajador2,Trabajador3};

                    for(DatosFicha trabajador : trabajadores){
                        System.out.println("──────────────────────────────────");
                        trabajador.procesarInformacionFicha();
                        System.out.println("──────────────────────────────────");
                    }

                    if (!bucleMenuVolver(sc)) {
                        salir = true;
                    }
                    break;

                case "2":
                    System.out.println("\n╔════════════════════════════════╗");
                    System.out.println("║        LISTA PROOVEDORES       ║");
                    System.out.println("╚════════════════════════════════╝");
                    DatosFicha[] proveedores = {proveedor1, proveedor2, proveedor3};
                    for(DatosFicha proveedor : proveedores){
                        System.out.println("──────────────────────────────────");
                        proveedor.procesarInformacionFicha();
                        System.out.println("──────────────────────────────────");

                    }
                    if (!bucleMenuVolver(sc)) {
                        salir = true;
                    }
                    break;

                case "3":
                    System.out.println("\n╔════════════════════════════════╗");
                    System.out.println("║        LISTA CLIENTES          ║");
                    System.out.println("╚════════════════════════════════╝");
                    DatosFicha[] clientes = {cliente1, cliente2,cliente3};
                    for(DatosFicha cliente : clientes){
                        System.out.println("──────────────────────────────────");
                        cliente.procesarInformacionFicha();
                        System.out.println("──────────────────────────────────");
                    }

                    if (!bucleMenuVolver(sc)) {
                        salir = true;
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");

            }
        }while (!salir);


    }

    public static boolean bucleMenuVolver(Scanner sc) {
        char confirma;

        System.out.print("¿Deseas volver al menú principal? (S/N): ");
        confirma = sc.next().charAt(0);
        sc.nextLine();

        while (confirma != 'S' && confirma != 's' && confirma != 'N' && confirma != 'n') {
            System.out.println("Opción no válida");
            System.out.print("Ingrese una opción válida (S/N): ");
            confirma = sc.next().charAt(0);
            sc.nextLine();
            System.out.println(" ");
        }

        if (confirma == 'N' || confirma == 'n') {
            System.out.println("Cerrando Software....");
            return false; // Mensaje de despedida al usuario
        }

        return true; // Volver al menú
    }


}

