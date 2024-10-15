import java.util.Scanner;

public class Anidados_EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (N): ");
        int N = scanner.nextInt();

        long sumaFactoriales = 0;
        for (int i = 0; i <= N; i++) {
            sumaFactoriales += calcularFactorial(i);
        }

        System.out.println("La suma de los factoriales desde 0 hasta " + N + " es: " + sumaFactoriales);
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}

