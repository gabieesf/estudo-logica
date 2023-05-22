import java.util.Scanner;

class App {
  public static void main(String[] args) {
    // variáveis
    int n;
    int ano;
    String gen;
    int cont = 0;

    int i, j;
    String mat[][] = new String[3][3];

    // comando de entrada
    Scanner ler = new Scanner(System.in);

    // Estrutura de repetição

    while (cont < 3) {
      System.out.printf("Qual a sua idade?\n");
      n = ler.nextInt();
      System.out.println();

      // operador aritimético
      ano = 2023 - n;

      // comando de saída
      System.out.println("O seu ano de nascimento é: " + Integer.toString(ano));

      gen = processo(ano);
      System.out.println();

      mat[cont][0] = Integer.toString(n);
      mat[cont][1] = Integer.toString(ano);
      mat[cont][2] = gen;

      cont++;
    }

    System.out.println("[IDADE]" + "    [ANO]  " + "   [GERAÇÃO]");

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print("  [" + mat[i][j] + "]  ");
      }

      System.out.println();

    }

  }

  // Funções (procedimentos)
  public static String processo(Integer ano) {
    // operador logico e relacional; estruturas condicionais
    if (ano >= 1945 && ano < 1960) {
      System.out.println("Você é da geração Baby Boomer");
      return "Baby boomer";
    }

    if (ano >= 1960 && ano < 1985) {
      System.out.println("Você é da geração X");
      return "Geração X";
    }

    if (ano >= 1985 && ano < 1995) {
      System.out.println("Você é da geração Y");
      return "Geração Y";
    }

    if (ano >= 1995 && ano < 2010) {
      System.out.println("Você é da geração Z");
      return "Geração Z";

    } else {
      System.out.println("Não tem uma geração definida");
      return "Não tem uma geração definida";
    }
  }

}
