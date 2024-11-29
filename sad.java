import java.util.ArrayList;
import java.util.List;

public class sad {

    // 1. Suma de valores: recibe un arreglo de enteros y devuelve la suma de estos.
    public int sumaDeValores(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return suma;
    }

    // 2. Valores únicos: recibe un arreglo de Object y devuelve la cantidad de elementos diferentes.
    public int valoresUnicos(Object[] arreglo) {
        List<Object> arreglito = new ArrayList<>();
        for (Object o : arreglo) {
            if (!arreglito.contains(o)) {
                arreglito.add(o);
            }
        }
        return arreglito.size();
    }

    public static void main(String[] args) {
        sad operaciones = new sad();

        // Ejemplo de uso de sumaDeValores
        int[] numeros = {1, 2, 3, 4, 5,7,8,9,10};
        System.out.println("Suma de valores: " + operaciones.sumaDeValores(numeros));

        // Ejemplo de uso de valoresUnicos
        Object[] objetos = {"A", "B", "A", 1, 2, 3, 1,"C"};
        System.out.println("Cantidad de valores únicos: " + operaciones.valoresUnicos(objetos));
    }
}


