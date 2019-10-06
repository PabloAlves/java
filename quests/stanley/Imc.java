package myapp;

public class Imc {
  private double height;
  private double weight;

  public final double VALOR_ABAIXO_PESO = 18.5;
  public final double VALOR_PESO_NORMAL = 18.5;
  public final double VALOR_SOBREPESO = 25;
  public final double VALOR_OBSIDADE_1 = 30;
  public final double VALOR_OBESIDADE_2 = 35;
  public final double VALOR_OBESIDADE_3 = 40;

  public final String MENSAGEM_ABAIXO_PESO = "Abaixo do peso";
  public final String MENSAGEM_PESO_NORMAL = "Peso normal";
  public final String MENSAGEM_SOBREPESO = "Sobrepeso";
  public final String MENSAGEM_OBSIDADE_1 = "Obesidade grau 1";
  public final String MENSAGEM_OBESIDADE_2 = "Obesidade grau 2";
  public final String MENSAGEM_OBESIDADE_3 = "Obesidade grau 3";
  public final String MENSAGEM_INVALIDO = "Os parametros informados sao invalidos.";

  Imc (double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  public double calculate() {
    if (height > 0) {
      return weight / ((height / 100) * (height / 100));
    } else {
      return -1;
    }
  }

  public String result(double value) {
    if (value < VALOR_PESO_NORMAL) {
      return MENSAGEM_ABAIXO_PESO;
    } else if (value >= VALOR_PESO_NORMAL && value < VALOR_SOBREPESO) {
      return MENSAGEM_PESO_NORMAL;
    } else if (value >= VALOR_SOBREPESO && value < VALOR_OBSIDADE_1) {
      return MENSAGEM_SOBREPESO;
    } else if (value >= VALOR_OBSIDADE_1 && value < VALOR_OBESIDADE_2) {
      return MENSAGEM_OBSIDADE_1;
    } else if (value >= VALOR_OBESIDADE_2 && value < VALOR_OBESIDADE_3) {
      return MENSAGEM_OBESIDADE_2;
    } else if (value >= VALOR_OBESIDADE_3) {
      return MENSAGEM_OBESIDADE_3;
    } else {
      return MENSAGEM_INVALIDO;
    }
  }
}
