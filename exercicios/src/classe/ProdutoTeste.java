package classe;

public class ProdutoTeste {
  public static void main (String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Caneta";
    p1.preco = 2.50;
    p1.desconto = 0.75;

    System.out.println(p1.nome);
  }
}
