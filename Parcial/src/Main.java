import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hola que deseas hacer?");
        int opcion;
        do {
            System.out.println("1.zodiaco\n2.validar si eres mayor de edad\n3.validar si tu numero es perfecto\n4.validador de palindromo \n5.validador de capicua\n6.conversor de morse a texto\n7.conversor de texto a morse\n8.caballeros del sodiaco\n9.juego libre\n10.salir");
            Scanner leer = new Scanner(System.in);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Zodiaco.zodiaco();
                    break;
                case 2:
                    System.out.println("ingrese su año de nacimiento");
                    int anio1;
                    anio1 = leer.nextInt();
                    anio1 = 2025 - anio1;
                    if(anio1 >17){
                        System.out.println("usted es mayor de edad");
                    }
                    else{
                        System.out.println("usted es menor de edad");
                    }
                    break;
                case 3:
                    int n1,n2,i;
                    System.out.println("ingrese su numero a evaluar");
                    n1=leer.nextInt();
                    i=1;
                    n2=0;
                    do {
                    if(n1%i==0){
                       n2=n2+i;
                    }
                    else{}
                    i++;
                    }while(n1-1>i);
                    if(n2==n1){
                        System.out.println("su numero es un numero perfecto");
                    }
                    else{
                        System.out.println("su numero no es un numero perfecto");
                    }

                    break;
                case 4:
                    String palabra ="";
                    System.out.println("Ingrese su palabra a evaluar:");
                    palabra = leer.next();

                    if (ValidadorPalindromo4.validarPalindromo(palabra)) {
                        System.out.println("Es palíndromo");
                    } else {
                        System.out.println("No es palíndromo");
                    }
                    //https://www.youtube.com/watch?v=dMvxJFCaNGo&list=WL&index=1&t=184s
                    //VIDEO CON EL QUE ME GUIE
                    break;
                case 5:
                    String capicua1 ="";
                    System.out.println("Ingrese su numero a evaluar a evaluar:");
                    capicua1 = leer.next();
                    if (Capicua.validarCapicua(capicua1)){
                        System.out.println("Es capicua");
                    }
                    else{
                        System.out.println("No es capicua");
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Gracias por usar el programa :D");
                    break;
                default:
                    System.out.println("numero no valido");
            }
        }while(opcion!=10);
    }
}




