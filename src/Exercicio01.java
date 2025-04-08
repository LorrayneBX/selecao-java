import java.text.DecimalFormat;
import java.util.Scanner;

/*programa exemplo para calcular
 a média entre duas notas e imprimir a situação do aluno
*/
public class Exercicio01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Insira a nota 1 do aluno: ");
        nota1 = sc.nextDouble();
        System.out.print("Insira a nota 2 do aluno:  ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("média final = " +df.format(media));

        if (media>= 6) {
            System.out.println("Você esta APROVADO");
        }
        else {
            System.out.println("Você está REPROVADO");
        }
    }
}
