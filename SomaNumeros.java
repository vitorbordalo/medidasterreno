import java.util.Locale;
import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.print("AREA = ");
        System.out.printf("%.2f", area);
        System.out.println();
        System.out.print("PREÇO = ");
        System.out.printf("%.2f", preco);

        sc.close();
    }
}
