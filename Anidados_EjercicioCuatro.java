public class Anidados_EjercicioCuatro {
    public static void main(String[] args) {
        char letra = 'Z';

        while (letra >= 'A') {
            for (char i = letra; i >= 'A'; i--) {
                System.out.print(i);
            }
            System.out.println();
            letra--;
        }
    }
}

