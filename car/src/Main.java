import java.util.ArrayList;

/**El programa se compone de 3 clases:
 * Un 'main', o clase principal, que va llamando a los metodos de cada clase.
 * La clase coche, que define los atributos que debe tener un coche: matricula, kilometros, marca,modelo
 * La clase menu, que muestra los mensajes convenientes en la pantalla
 *
 * En cada iteracion del bucle, mostramos el menu inicial en pantalla. Si el usuario desea crear un nuevo coche, llama
 * al constructor de la clase, que nos obliga a introducir el valor de los atributos. Este coche recien creado se guarda
 * en la lista.
 * */

public class Main {
    public static void main(String[] args){  // en java los mains siempre se declaran asi
        ArrayList<Coche> cocheArrayList = new ArrayList<Coche>();  // Creamos la lista donde guardar los coches, de tipo Coche
        Menu menu = new Menu();  // Instanciamos el menu
        boolean exit = true;  // Esta variable indica cuando debemos cerrar el programa
        while(exit) {  // Mientras exit sea verdadera, ejecutar el programa
            int opcion = menu.select();  // Mostrar el menu de seleccion inicial, e introducir la opcion al switch
            switch (opcion) {
                case 1:
                    // creamos un coche con sus atributos y lo guardamos en la lista con el metodo add
                    Coche coche =  menu.opcion1();
                    cocheArrayList.add(coche);
                    break;
                case 2:
                    // Le damos la lista al metodo para que pueda mostrar todos los vehiculos
                    menu.opcion2(cocheArrayList);
                    break;
                case 3:
                    // Le damos la lista al metodo para que pueda mostrar los vehiculos deseados
                    menu.opcion3(cocheArrayList);
                    break;
                case 4:
                    // Le damos la lista al metodo para que pueda borrar los vehiculos deseados
                    menu.opcion4(cocheArrayList);
                    break;
                case 5:
                    // exit se torna falso, salimos del programa
                    menu.opcion5();
                    exit = false;
                    break;
                default:
                    menu.incorrecta();
                    break;
            }

        }
    }
}
