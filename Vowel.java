public class Vowel {
    public static void main(String[] args) {

    }

    public static boolean isAvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'y' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U' || ch == 'Y' ||
                ch == 'а' || ch == 'е' || ch == 'ё' ||
                ch == 'и' || ch == 'о' || ch == 'у' ||
                ch == 'ы' || ch == 'э' || ch == 'ю' ||
                ch == 'я' || ch == 'А' || ch == 'Е' ||
                ch == 'Ё' || ch == 'И' || ch == 'О' ||
                ch == 'У' || ch == 'Ы' || ch == 'Э' ||
                ch == 'Ю' || ch == 'Я';
    }

    public static boolean isAvowel2(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            case 'а':
            case 'е':
            case 'ё':
            case 'и':
            case 'о':
            case 'у':
            case 'ы':
            case 'э':
            case 'ю':
            case 'я':
            case 'А':
            case 'Е':
            case 'Ё':
            case 'И':
            case 'О':
            case 'У':
            case 'Ы':
            case 'Э':
            case 'Ю':
            case 'Я':
                return true;
            default:
                return false;
        }
    }


}
