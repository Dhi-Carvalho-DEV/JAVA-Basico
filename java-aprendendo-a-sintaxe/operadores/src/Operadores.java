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

        // Ternário

        int a, b;

        a = 6;
        b = 6;

        // String resultado = "";
        // if (a == b) {
        // resultado = "verdadeiro";
        // } else {
        // resultado = "falso";
        // }

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // Relacionais

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        if (numero1 > numero2) {
            System.out.println("Numero 1 maior que nummero 2");
        }

        if (numero1 < numero2) {
            System.out.println("Numero 1 menor que numero 2");
        }

        String nomeUm = "Diogo";
        String nomeDois = "Diogo";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = new String("Diogo");
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));

        // Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas são verdadeiras");
        } else {
            System.out.println("fim");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas são verdadeiras");
        } else {
            System.out.println("fim");
        }

        if (condicao2 || (7 < 4)) {
            System.out.println("Ambas são falsas");
        } else {
            System.out.println("fim");
        }
    }
}
