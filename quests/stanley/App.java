package myapp;

public class App {
  public static void main(String[] args) {
    // informar altura (cm) e peso (kg)
    Imc imc = new Imc(178, 2);
    double resultant = imc.calculate();
    String status = imc.result(resultant);

    System.out.println("Sua faixa do IMC: " + status);
  }
}
