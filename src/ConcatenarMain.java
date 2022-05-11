public class ConcatenarMain {

    public static void main(String[] args) {

        String[] cadena = { "Hola ", "Mundo", "!!!" };

        System.out.println(concatenarMain(cadena));
    }

    static String concatenarMain(String[] cadenas) {
        String frase = "";
        for (String cadena : cadenas) {
            frase += cadena;
        }
        return frase;

    }
}
