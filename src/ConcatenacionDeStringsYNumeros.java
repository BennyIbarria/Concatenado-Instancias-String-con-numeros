public class ConcatenacionDeStringsYNumeros {

    public static void main(String[] args) {

        //Creacion de un par de instancias de la clase String
        String nombre= "José Benito Ibarria Topete";
        String objetivo= "Aprenderas Java ";

        //Concatenación básica
        System.out.println(objetivo+ " " + nombre );

        int numero1=5;
        int numero2 = 20;
        Integer edad= 38;

        //Concatenando objetos de la clase string con valores enteros
        System.out.println(objetivo+ " " + nombre + numero1 + numero2);

        //Concatenando objetos de la clase String con valores enteros tomando en cuenta la "precedencia"
        System.out.println(objetivo+ " " + nombre + " " + (numero1 + numero2));

        //Concatenando con el metodo .concat anidados de la clase String
        System.out.println(objetivo.concat(nombre).concat(" a tus ").concat(edad.toString()).concat( " años"));

    }
}
