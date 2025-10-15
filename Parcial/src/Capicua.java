public class Capicua {
    public static boolean validarCapicua(String palindromo) {
        palindromo = palindromo.toLowerCase();
        palindromo = palindromo.replace("-", "");
        palindromo = palindromo.replace(".", "");
        palindromo = palindromo.replace(",", "");
        palindromo = palindromo.replace(" ", "");
        palindromo = palindromo.replace("'", "");
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
