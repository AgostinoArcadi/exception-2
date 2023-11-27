public class Main {
    public static void main(String[] args) {
        characterIsNum('ù');
    }

    public static void characterIsNum(char carattere) {
        if(Character.isDigit(carattere)) {
            System.out.println("il carattere '" + carattere +  "' è un numero");
        } else {
            throw new ArithmeticException("il carattere '" + carattere +  "' non è un numero");
        }
    }
}
