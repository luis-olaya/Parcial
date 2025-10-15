public class ValidadorPalindromo4 {
    public static boolean validarPalindromo(String palindromo) {
        palindromo = palindromo.toLowerCase();
        palindromo = palindromo.replace(" ", "");
        palindromo = palindromo.replace("á", "a");
        palindromo = palindromo.replace("é", "e");
        palindromo = palindromo.replace("í", "i");
        palindromo = palindromo.replace("ó", "o");
        palindromo = palindromo.replace("ú", "u");

        int a = 0;
        int b = palindromo.length() - 1;

        while (a < b) {
            if (palindromo.charAt(a) != palindromo.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}