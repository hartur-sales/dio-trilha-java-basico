public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1500.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // e pra nao mudar? a gente usa as constantes, que no caso é socar o FINAL

        int numero = 5;
        numero = 15;
        System.out.println("Numero: " + numero);

        final double VALOR_DE_PI = 3.14;

        String meuNome = "Hartur";

    }
}
