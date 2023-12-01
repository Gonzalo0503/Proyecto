package Tema3;
import java.util.Scanner;

public class EstanEnOrden {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Numero 1: ");
        int n1=teclado.nextInt();

        System.out.println("Numero 2: ");
        int n2=teclado.nextInt();

        System.out.println("Numero 3: ");
        int n3=teclado.nextInt();

        if (n1==n2 && n2==n3){
            System.out.println("Los 3 numeros son iguales.");
        }else if (n1<=n2 && n2<=n3){
            System.out.println("Están ordenados ascendentemente.");
        }else if (n1>=n2 && n2>=n3){
            System.out.println("Están ordenados descendentemente.");
        }else{
            System.out.println("No están ordenados.");
        }
teclado.close();}
}
