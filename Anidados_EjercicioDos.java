import java.util.Scanner;

public class Anidados_EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println("El factorial de " + i + " es: " + calcularFactorial(i));
        }
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}

