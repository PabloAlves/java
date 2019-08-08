package fundamentos;

import java.util.Scanner;

public class Console {
  public static void main(String[] args) {
    System.out.print("Bom");
    System.out.print("dia!");
    System.out.printf("Numero: %d %d", 1, 2);

    Scanner entrada = new Scanner(System.in);

    entrada.nextLine();
  }
}
