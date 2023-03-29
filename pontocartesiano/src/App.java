import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            Pontocart pontocartesiano = new Pontocart();

            System.out.print("Digite o valor de x1: ");
            pontocartesiano.setX1(sc.nextInt());

            System.out.print("Digite o valor de x2: ");
            pontocartesiano.setX2(sc.nextInt());

            System.out.print("Digite o valor de y1: ");
            pontocartesiano.setY1(sc.nextInt());

            System.out.print("Digite o valor de y2: ");
            pontocartesiano.setY2(sc.nextInt());

            System.out.print("A distância entre os pontos é: " + pontocartesiano.resultado());
        }
    }
}
