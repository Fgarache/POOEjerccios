import java.util.Scanner;

public class Tablasmult {
    Tablasmult (){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar deseas?");
        num = entrada.nextInt();

        if (num > 0){
            for (int i =1; i <=10; i++){
                System.out.println(num +" X "+i+" =    "+ num*i);


            }
        }
        System.out.println("");
        Funciones fun = new Funciones();

    }

}
