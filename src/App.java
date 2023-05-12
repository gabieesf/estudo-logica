import java.util.Scanner;

class App {
  public static void main(String[] args) {
    // variáveis
    int n;
    int ano;

    // comando de entrada
    Scanner ler = new Scanner(System.in);

    // Estrutura de repetição
    while (true) {
      System.out.printf("Qual a sua idade?\n");

      n = ler.nextInt();
      // operador aritimético
      ano = 2023 - n;

      // comando de saída
      System.out.println("O seu ano de nascimento é:" + Integer.toString(ano));

      processo(ano);
    }

  }

  // Funções (procedimentos)
  public static void processo(Integer ano) {
    // operador logico e relacional; estruturas condicionais
    if (ano >= 1945 && ano < 1960) {
      System.out.println("Você é da geração Baby Boomer");
    }

    if (ano >= 1960 && ano < 1985) {
      System.out.println("Você é da geração X");
    }

    if (ano >= 1985 && ano < 1995) {
      System.out.println("Você é da geração Y");
    }

    if (ano >= 1995 && ano < 2010) {
      System.out.println("Você é da geração Z");
    } else {
      System.out.println("Não tem uma geração definida");
    }
  }
}
