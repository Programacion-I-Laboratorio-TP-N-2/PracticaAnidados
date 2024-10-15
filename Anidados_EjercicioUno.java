public class Anidados_EjercicioUno {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");

        for (int numero = 1; numero <= 1000; numero++) {
            if (esPerfecto(numero)) {
                System.out.println(numero);
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
}

