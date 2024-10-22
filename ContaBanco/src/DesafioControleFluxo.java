import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir mensagem de erro
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    // Método contar deve estar fora do método main
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println(i);
        }
    }
}

// Tive algumas dúvidas no momento de tratar as exceções, consultei o material, revi a aulas e pedi ajuda a inteligência artificial para melhor entender.