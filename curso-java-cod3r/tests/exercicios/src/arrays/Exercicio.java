package arrays;

public class Exercicio {
  public static void main (String[] args) {
    double[] notasArray = new double[10];
    double[][] notasMatriz = new double[10][10];

    notasArray[0] = 10.2;

    String stringArray = Arrays.toString(notasArray);

    System.out.println(stringArray);
    System.out.println('Nota: ' + notasArray[0]);

    double[] notasInicializacao = {1.1, 2.3, 3.5};
  }
}
