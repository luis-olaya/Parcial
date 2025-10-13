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
                    int anio, mes, dia;
                    do {
                        System.out.println(" ingrese año de nacimiento");
                        anio = leer.nextInt();
                    } while (anio < 0);

                    do {
                        System.out.println(" ingrese mes de nacimiento");
                        mes = leer.nextInt();
                    } while (mes < 0 || mes > 12);
                    System.out.println(" ingrese dia de nacimiento");
                    dia = leer.nextInt();
                    if (mes == 1) {
                        if (dia > 0 && dia < 32) {
                            if ((dia > 0) && (dia > 20)) {
                                System.out.println("signo:capricornio, caballero shura");
                            } else {
                                System.out.println("signo:Acuario, caballero camus");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }

                    }
                    if (mes == 2) {
                        if ((dia > 0) && (dia < 30)) {
                            if ((dia > 0) && (dia < 19)) {
                                System.out.println("signo:Acuario, caballero camus");
                            } else {
                                System.out.println("signo:piscis, caballero aphrodite");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }

                    }
                    if (mes == 3) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 22)) {
                                System.out.println("signo:piscis, caballero aphrodite");
                            } else {
                                System.out.println("signo:aries caballero moo");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }

                    }
                    if (mes == 4) {
                        if ((dia > 0) && (dia < 31)) {
                            if ((dia > 0) && (dia < 20)) {
                                System.out.println("signo:aries caballero moo");
                            } else {
                                System.out.println("signo:tauro caballero aldebaran");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }

                    if (mes == 5) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 21)) {
                                System.out.println("signo:tauro caballero aldebaran");
                            } else {
                                System.out.println("signo:geminis caballero ares");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }

                    }

                    if (mes == 6) {
                        if ((dia > 0) && (dia < 31)) {
                            if ((dia > 0) && (dia < 21)) {
                                System.out.println("signo:geminis caballero ares");
                            } else {
                                System.out.println("signo:cancer caballero deathmask");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }

                    }

                    if (mes == 7) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 23)) {
                                System.out.println("signo:cancer caballero deathmask");
                            } else {
                                System.out.println("signo:Leo, caballero aiolia");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }

                    if (mes == 8) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 23)) {
                                System.out.println("signo:Leo, caballero aiolia");
                            } else {
                                System.out.println("signo:virgo, caballero shaka");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }

                    if (mes == 9) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 31)) {
                                System.out.println("signo:virgo, caballero shaka");
                            } else {
                                System.out.println("signo:libra caballero dohko");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }
                    if (mes == 10) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 23)) {
                                System.out.println("signo:libra caballero dohko");
                            } else {
                                System.out.println("signo:escorpio caballero milo");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }

                    if (mes == 11) {
                        if ((dia > 0) && (dia < 31)) {
                            if ((dia > 0) && (dia < 22)) {
                                System.out.println("signo:escorpio caballero milo");
                            } else {
                                System.out.println("signo:sagitario caballero aiolos");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    } else {
                    }
                    if (mes == 12) {
                        if ((dia > 0) && (dia < 32)) {
                            if ((dia > 0) && (dia < 22)) {
                                System.out.println("signo:sagitario caballero aiolos");
                            } else {
                                System.out.println("signo:capricornio caballero shura");
                            }
                        } else {
                            System.out.println("dia no es valido");
                        }
                    }
                    break;
                case 2:
                    System.out.println("ingrese su año de nacimiento");
                    int anio1;
                    anio1 = leer.nextInt();
                    anio = 2025 - anio1;
                    if(anio >17){
                        System.out.println("usted es mayor de edad");
                    }
                    else{
                        System.out.println("usted es menor de edad");
                    }
                    break;
                case 3:
                    int n1;
                    System.out.println("ingrese su numero a evaluar");

                    break;
                case 4:
                    break;
                case 5:
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
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("numero o caracter no valido");
            }
        }while(opcion!=10);
    }
}




