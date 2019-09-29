package fundamentos;

public class App {
    public static void main (String[] args) {
        AreaCircunferencia calcular = new AreaCircunferencia();
        double area = calcular.calcular();

        System.out.println("Area eh: " + area);
    }
}

