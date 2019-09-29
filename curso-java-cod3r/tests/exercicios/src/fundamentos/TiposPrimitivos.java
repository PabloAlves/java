package fundamentos;

public class TiposPrimitivos {
  public static void main(String[] args) {
    // funcionario

    // tipos numericos
    byte anosDeEmpresa = 23;
    short nroVoos = 532;
    int id = 57000;
    long pontos = 3444555666L;

    // tipos de ponto flutuante
    float salario = 12000.45F; // java nao analisa o valor - verifica se eh ponto flutuante
    double vendasAcumuladas = 25000444.50;

    // tipo booleano
    boolean estaDeFerias = true;

    // tipo caractere
    char status = 'A'; // ativo

    System.out.println(anosDeEmpresa * 365);
    System.out.println(nroVoos / 2);
    System.out.println(vendasAcumuladas / pontos);
    System.out.println("ID: " + id + " ganha => " + salario);
    System.err.println("Esta de ferias: " + estaDeFerias);
    System.out.println("Status: " + status);
  }
}
