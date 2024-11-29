import java.util.Scanner;

public class slsl {

    public double gramosAKilogramos(double gramos) {
        return gramos / 1000;
    }

    public double gramosALibras(double gramos) {
        return gramos * 0.00220462;
    }

    public double kilogramosAGramos(double kilogramos) {
        return kilogramos * 1000;
    }

    public double kilogramosALibras(double kilogramos) {
        return kilogramos * 2.20462;
    }

    public double librasAGramos(double libras) {
        return libras / 0.00220462;
    }

    public double librasAKilogramos(double libras) {
        return libras / 2.20462;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        slsl operaciones = new slsl();

        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Gramos a Kilogramos");
        System.out.println("2. Gramos a Libras");
        System.out.println("3. Kilogramos a Gramos");
        System.out.println("4. Kilogramos a Libras");
        System.out.println("5. Libras a Gramos");
        System.out.println("6. Libras a Kilogramos");

        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = operaciones.gramosAKilogramos(valor);
                System.out.println(valor + " gramos son " + resultado + " kilogramos");
                break;
            case 2:
                resultado = operaciones.gramosALibras(valor);
                System.out.println(valor + " gramos son " + resultado + " libras");
                break;
            case 3:
                resultado = operaciones.kilogramosAGramos(valor);
                System.out.println(valor + " kilogramos son " + resultado + " gramos");
                break;
            case 4:
                resultado = operaciones.kilogramosALibras(valor);
                System.out.println(valor + " kilogramos son " + resultado + " libras");
                break;
            case 5:
                resultado = operaciones.librasAGramos(valor);
                System.out.println(valor + " libras son " + resultado + " gramos");
                break;
            case 6:
                resultado = operaciones.librasAKilogramos(valor);
                System.out.println(valor + " libras son " + resultado + " kilogramos");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}