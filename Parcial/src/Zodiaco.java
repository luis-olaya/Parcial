import java.util.Scanner;
public class Zodiaco {
    public static void zodiaco(){
        Scanner leer = new Scanner(System.in);
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
    }
}
