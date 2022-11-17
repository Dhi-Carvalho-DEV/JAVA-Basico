public class Operadores {
    public static void main(String[] args) throws Exception {
        // Concatenação
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Unários
        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        // Incrementação e Decrementação
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);

        // Negação
        boolean variavel = true;

        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);
    }
}
