import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner (System.in);

        double total, totalcomdesconto, valoreconomizao;

        System.out.print("Valor total das compras --> R$ ");
        total = sc.nextDouble();
        if (total > 1000) {
            totalcomdesconto = total * 0.85;
        }
        else {
            totalcomdesconto = total * 0.92;
        }
        valoreconomizao = total - totalcomdesconto;
        System.out.println("Total com desconto R$ " + df.format(totalcomdesconto));
        System.out.println("Valor economizado R$ " + df.format(valoreconomizao));
    }
}
