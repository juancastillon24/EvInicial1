import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    Scanner sc = new Scanner(System.in);


    public void anadirContacto() {
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el teléfono: ");
        String telefono = sc.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, telefono);
        contactos.add(nuevoContacto);

        System.out.println("Contacto añadido correctamente.");
    }


    public void mostrar(){
        System.out.println("Listado de contactos: ");
        for(Contacto contacto : contactos){
            System.out.println(contacto);

        }
    }
    public void buscarcontacto(){
        System.out.println("Introduce el nombre a buscar: ");
        String nombre = sc.nextLine();
        boolean existe = false;

        for(Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre)){
                System.out.println("El número de "+nombre+" es "+contacto.getNumero());
                existe = true;
            }
        }
        if(!existe){
            System.out.println("El contacto no existe");
        }
    }
    public void salir(){
        System.out.println("Saliendo de la aplicación. . .");
    }
}
