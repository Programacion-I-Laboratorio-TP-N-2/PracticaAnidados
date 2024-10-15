import java.util.Scanner;

public class Anidados_EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (N): ");
        int N = scanner.nextInt();

        System.out.println("Los números primos entre 2 y " + N + " son:");
        for (int num = 2; num <= N; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

