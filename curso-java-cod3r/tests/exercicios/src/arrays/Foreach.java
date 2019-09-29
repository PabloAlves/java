package arrays;

public class Foreach {
  public static void main (String[] args) {
    double[] notas = {1.2, 9.7, 5.5};

    for(double nota : notas) {
      System.out.print('Nota: ' + nota);
    }
  }
}
