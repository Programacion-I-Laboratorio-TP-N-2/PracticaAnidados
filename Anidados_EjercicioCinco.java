public class Anidados_EjercicioCinco {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            String numero = Integer.toString(i);
            numero = numero.replace('3', 'E');
            System.out.println(numero);
        }
    }
}
