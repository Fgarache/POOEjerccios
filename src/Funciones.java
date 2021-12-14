import java.util.Scanner;

public class Funciones {

    public Funciones() {
        int obcion;

        Scanner elegir = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("|| Eligeuna obcion:          ||");
        System.out.println("||  1.Suma                   ||");
        System.out.println("||  2.multiplicacion         ||");
        System.out.println("||  3.Resta                  ||");
        System.out.println("||  4.Divicion               ||");
        System.out.println("||  5.Adivinar un numero:    ||");
        System.out.println("||  6.Tablas de multiplicar  ||");
        System.out.println("===============================");
        obcion= elegir.nextInt();



            switch (obcion){
                case 1 : Suma suma = new Suma();
                break;
                case 2 : multiplicacion mult = new multiplicacion();
                break;
                case 3 : Resta rest = new Resta();
                break;
                case 4: Divicion div = new Divicion();
                break;
                case 5: Numeroaleatorio adiv = new Numeroaleatorio();
                break;
                case 6: Tablasmult tablas = new Tablasmult();

            }


    }


}
