import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        double resultado;
        String opcao;

        System.out.println("(A)dição");
        System.out.println("(S)ubtração");
        System.out.println("(M)ultiplicação");
        System.out.println("(D)ivisão");
        opcao = sc.next();
        opcao = opcao.toLowerCase();

        if (opcao.equals("a") || opcao.equals("s") || opcao.equals("m") || opcao.equals("d")) {
            System.out.print("Informe o primeiro valor -->");
            valor1 = sc.nextInt();
            System.out.print("Informe o segundo valor -->");
            valor2 = sc.nextInt();

            if (opcao.equals("d") && valor2 == 0){
                System.out.println("Não existe divisão por zero");
            }
            else {
                if (opcao.equals("a")){
                    resultado = valor1 + valor2;

                }
                else if (opcao.equals("s")){
                    resultado = valor1 - valor2;
                }
                else if (opcao.equals("m")){
                    resultado = valor1 * valor2;
                }
                else {
                    resultado = (double)valor1 / valor2;
                }

                System.out.println("resultado =" + resultado);

            }

        }
    }
}
