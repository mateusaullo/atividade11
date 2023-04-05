import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n1,n2,resultado1,resultado3;
        float n3,resultado2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o primeiro numero inteiro: ");
        n1 = teclado.nextInt();
        System.out.print("Coloque o primeiro numero inteiro: ");
        n2 = teclado.nextInt();
        System.out.print("Coloque o numero real: ");
        n3 = teclado.nextFloat();
        teclado.close();

        resultado1 = (n1*2 * n2/2);
        resultado2 = (n1*3) + n3;
        resultado3 = (int)(n3 * n3 * n3);

        System.out.printf("\nO produto do dobro do primeiro com metade do segundo é = %d\n", resultado1);
        System.out.printf("A soma do triplo do primeiro com o terceiro é = %.0f\n", resultado2);
        System.out.printf("O terceiro elevado ao cubo é = %d\n", resultado3);
    }
}
