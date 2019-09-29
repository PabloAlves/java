package controle;

import java.util.Scanner;

public class IfElseIf {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a media: ");
    double media = entrada.nextDouble();

    if (media >= 7.0) {
      System.out.println("Aprovado!");
    } else if (media < 7.0 && media > 5.0) {
      System.out.println("Recuperação!");
    } else {
      System.out.println("Reprovado!");
    }

    entrada.close();
  }
}
