import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // utilizamos la libreria scanner para poder recibir mensajes. Selecionamos in para elegir como entrada el teclado
    private Scanner keyboard = new Scanner(System.in);

    public int select() {
        // Menu inicial que enseñar
        System.out.println("---------------------------------------------------------");
        System.out.println("Opcion 1: guardar vehiculo");
        System.out.println("Opcion 2: mostrar todos los coches");
        System.out.println("Opcion 3: mostrar coches con x kilometros");
        System.out.println("Opcion 4: borrar coche");
        System.out.println("Opcion 5: salir del programa");
        System.out.println("---------------------------------------------------------");
        return keyboard.nextInt();  // Devolvemos el valor pulsado por el usuario. Este valor debe ser un entero
    }

    public Coche opcion1() {
        keyboard.nextLine();  // consumimos el enter
        System.out.println("Introduzca matricula del vehiculo:");
        String matricula = keyboard.nextLine();  // Recogemos el string que introduce el usuario, y lo guardamos en matricula
        System.out.println("Introduzca kilometraje del vehiculo:");
        int kilometros = keyboard.nextInt();  // nextInt() recoge enteros por teclado
        keyboard.nextLine();  // consumimos el enter
        System.out.println("Introduzca marca del vehiculo:");
        String marca = keyboard.nextLine();  // nextLine() recoge string por teclado
        System.out.println("Introduzca modelo del vehiculo:");
        String modelo = keyboard.nextLine();  // nextLine() recoge string por teclado
        return  new Coche(matricula, kilometros, marca, modelo);  // devolvemos el objeto coche recien creado
    }

    public void opcion2(ArrayList<Coche> cocheArrayList) {
        /*Creamos un bucle que itera en la lista, mostrando en cada paso un coche*/
        System.out.println("Mostrando todos los vehiculos guardados...");
        for (int i = 0; i < cocheArrayList.size(); i++) {
            mostrarCoche(i, cocheArrayList);
        }
    }

    public void opcion3(ArrayList<Coche> cocheArrayList) {
        /*Creamos un bucle que itera en la lista, mostrando en cada paso un coche, si sus kilometros son mayores que los
        * seleccionados. Para acceder a un objeto de la lista, usamos el metodo get(). Una vez seleccionado el objeto,
        * accedemos a sus atributos por el getter*/
        System.out.println("Introduzca el numero de kilometros de los coches a mostrar");
        int minKilometros =  keyboard.nextInt();
        for (int i = 0; i < cocheArrayList.size(); i++) {
            int kilometros = cocheArrayList.get(i).getKilometros();
            if (minKilometros <= kilometros) {
                mostrarCoche(i, cocheArrayList);
            }
        }
    }

    private void mostrarCoche(int i, ArrayList<Coche> cocheArrayList) {
        // Este metodo es auxiliar, ayuda a opcion 2 y 3 a mostrar coches, para no repetir codigo. Al ser auxiliar, no
        // se accede a el desde fuera de la clase, y puede ser declarado como privado
        String matricula = cocheArrayList.get(i).getMatricula();
        int kilometros = cocheArrayList.get(i).getKilometros();
        String marca = cocheArrayList.get(i).getMarca();
        String modelo = cocheArrayList.get(i).getModelo();
        System.out.println("Numero:" +i+ ". matricula: " +matricula+ ", kilometros: " +kilometros+ ", marca: " +marca+ ", modelo: " +modelo);
    }

    public void opcion4(ArrayList<Coche> cocheArrayList) {
        // Igual que el metodo opcion3, pero busca por matricula, para borrar el coche con el metodo remove(). Las
        // matriculas son string, para poder compararlas usamos equals
        System.out.println("Introduzca la matricula del vehiculo a borrar");
        keyboard.nextLine();  // consumimos el enter
        String matriculBorrar =  keyboard.nextLine();
        for (int i = 0; i < cocheArrayList.size(); i++) {
            String matricula = cocheArrayList.get(i).getMatricula();
            if (matricula.equals(matriculBorrar)) {
                cocheArrayList.remove(i);
            }
        }
    }

    public void opcion5() {
        System.out.println("Saliendo del programa...");
    }

    public void incorrecta(){
        System.out.println("Opcion incorrecta");
    }
}
