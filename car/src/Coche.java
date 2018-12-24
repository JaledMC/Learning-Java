public class Coche {
    private String matricula;
    private int kilometros;
    private String marca;
    private String modelo;

    /* Sino creamos ningun constructor, Java le asigna uno como el de esta linea por defecto, que no requiere de ningun
    parametro. Pero al crear el segundo, si queremos un constructor que no necesite parametros, debemos crearlo nosotros
    */
    public Coche(){}

    public Coche(String matricula, int kilometros, String marca, String modelo) {
        this.matricula = matricula;
        this.kilometros = kilometros;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Al ser atributos privados, no tenemos acceso a ellos desde fuera de la clase Coche, es decir, en principio no los
    // podemos leer ni en la clase Menu ni Main. Esto se hace por razones de seguridad, previniendo que sobreescribamos
    // el valor sin querer. Para obtener los valores, podemos crear getter: metodos que nos devuelven el valor sin
    // darnos derecho a escritura
    public String getMatricula() {
        return matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
