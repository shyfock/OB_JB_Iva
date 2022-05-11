import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio en pesos ($):");
        double precio = sc.nextDouble();
        System.out.println("El precio, iva incluido es: $ " + incluirIva(precio));
        sc.close();

    }

    // Función que aplica el IVA al precio, recibe un parámetro
    static double incluirIva(double precio) {
        double iva = 0.19 * precio;
        double incluyeIva = precio + iva;
        return incluyeIva;
    }
}
