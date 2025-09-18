import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Agenda agenda = new Agenda();
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("===================");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar todos los contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1-> agenda.anadirContacto();
                case 2-> agenda.mostrar();
                case 3-> agenda.buscarcontacto();
                case 4-> agenda.salir();

            }
        }while(opcion != 4);

    }
}
