package fundamentos;

public class ConversaoTipoNumerico {
  public static void main(String[] args) {
    // implicito
    double a = 1;
    System.out.println(a);

    // explicito
    float b = (float) 1.0;
    System.out.println(b);

    // explicito
    int c = 4000;
    byte d = (byte) c;
    System.out.println(d);
  }
}
