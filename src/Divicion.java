import java.util.Scanner;

public class Divicion {
    public  Divicion (){
        int num2;
        int resultado;
        int num1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("***************");
        System.out.println("    Division      ");
        System.out.println("***************");
        System.out.print("ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        resultado = num1/num2;

        System.out.println("****************");
        System.out.println("Resultado: "+resultado);
        System.out.println("*****************\n");

        Funciones fun = new Funciones();


    }

}
