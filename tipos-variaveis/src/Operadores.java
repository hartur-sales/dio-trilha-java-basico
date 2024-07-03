public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        // Aqui foi basicamente explorando concatenação, e como era muita coisa, e eu
        // não conseguia copiar como ele, eu só fui printando

        int numero = 5;
        System.out.println(-numero);
        System.out.println(--numero);
        System.out.println(++numero);
        // + numero n tem utilidade nenhuma, pois o + só faz soma e concatenação, n
        // troca sinal

        System.out.println("");

        numero = -numero;
        System.out.println(-numero);
        System.out.println(--numero);
        System.out.println(++numero);

        System.out.println("");

        numero *= (-1);
        System.out.println(-numero);
        System.out.println(--numero);
        System.out.println(++numero);

        System.out.println("");

        // agora vamos usar a propria variavel para mudar seu valor
        int soma = 10;
        System.out.println(soma);
        soma = soma - 2;
        System.out.println(soma);

        System.out.println("");

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            contador++;
            System.out.println(contador);
        }

        // e o boolean?
        boolean dridriSonso = false;
        System.out.println(dridriSonso);
        dridriSonso = !dridriSonso;

        // e o if resumidinho de apenas duas opções? seguinte, tu usa -> condição: se
        // true ? se false
        int a = 4;
        int b = 5;

        // seria o normal em alguns casos
        String resultadoDoEsquema = "";

        // tem vários tipos de comparaçao, ==, !=, >, <, >=, <=,

        if (a > b) {
            resultadoDoEsquema = "A é maior q B";
        } else {
            resultadoDoEsquema = "A é menor q B";
        }

        // em alguns casos eu posso só fazer assim:
        String resultadoDoEsquema2 = a > b ? "A é maior q B" : "A é menor q B";
        System.err.println(resultadoDoEsquema2);

        // igualdade de string é federente
        String nome1 = "Jorge";
        String nome2 = new String("hartur");

        // equals compara conteudo
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais");
        }

        // falar "e" e "ou", dentro de uma expressao
        // e = &&, ou = ||
        if (a == 4 && b == 5) {
            System.out.println("TÁ NORMAL");
        } else {
            System.out.println("TÁ ERRADO");
        }

        int c = 9;
        int d = 10;

        if (a < c || b > d) {
            System.out.println("nem entendo mais");
        } else {
            System.out.println("entendiu");
        }

    }
}