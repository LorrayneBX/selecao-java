import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;

        System.out.println("Digite o valor o lado A: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor o lado B: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor o lado C: ");
        c = sc.nextDouble();


        //condição para ser um triangulo
        if (a<b+c && b<a+c && c< a+b){
            System.out.println("Os valores representam um triângulo: ");
        }
        else {
            System.out.println("Os valores NÃO representam um triângulo: ");
        }

        //para não ser um triangulo
        if (a>b+c || b> a+c || c > a+b) {
            System.out.println("Os valores não representam um triângulo: ");
        }
    }
}
