public class kleineUebungenLoesung {
    public static void main(String[] args) {
        // 1. Erzeuge ein StringBuilder aus einem String (manuell)
        String s1 = "Hallo";
        char[] chars1 = s1.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (char c : chars1) {
            sb1 = new StringBuilder(sb1.toString() + c);
        }
        System.out.println(sb1); // Hallo

        // 2. Füge einen String an einen StringBuilder an (ohne append())
        StringBuilder sb2 = new StringBuilder("Hallo");
        String s2 = " Welt";
        for (char c : s2.toCharArray()) {
            sb2 = new StringBuilder(sb2.toString() + c);
        }
        System.out.println(sb2); // Hallo Welt

        // 3. Wandle einen StringBuilder zurück in einen String (direkt aus char[])
        char[] chars3 = new char[sb2.length()];
        for (int i = 0; i < sb2.length(); i++) {
            chars3[i] = sb2.toString().charAt(i);
        }
        String s3 = new String(chars3);
        System.out.println(s3); // Hallo Welt

        // 4. Ersetze in einem String alle Leerzeichen durch Bindestriche ("-")
        String s4 = "Ich lerne Java";
        char[] chars4 = s4.toCharArray();
        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] == ' ') {
                chars4[i] = '-';
            }
        }
        String result4 = new String(chars4);
        System.out.println(result4); // Ich-lerne-Java

        // 5. Füge in einen StringBuilder an Position 5 ein Zeichen ein (ohne insert())
        StringBuilder sb5 = new StringBuilder("HalloWelt");
        char c5 = '-';
        char[] chars5 = new char[sb5.length() + 1];
        for (int i = 0, j = 0; i < chars5.length; i++) {
            if (i == 5) {
                chars5[i] = c5;
            } else {
                chars5[i] = sb5.charAt(j++);
            }
        }
        sb5 = new StringBuilder(new String(chars5));
        System.out.println(sb5); // Hallo-Welt

        // 6. Lösche die ersten 3 Zeichen eines StringBuilder (ohne delete())
        StringBuilder sb6 = new StringBuilder("Programmieren");
        char[] chars6 = new char[sb6.length() - 3];
        for (int i = 3, j = 0; i < sb6.length(); i++, j++) {
            chars6[j] = sb6.charAt(i);
        }
        sb6 = new StringBuilder(new String(chars6));
        System.out.println(sb6); // grammieren

        // 7. Wandle einen String in ein char-Array um (direkt, ohne toCharArray())
        String s7 = "Java";
        char[] charArray = new char[s7.length()];
        for (int i = 0; i < s7.length(); i++) {
            charArray[i] = s7.charAt(i);
        }
        System.out.println(java.util.Arrays.toString(charArray)); // [J, a, v, a]

        // 8. Gib das dritte Zeichen eines Strings aus (ohne charAt())
        String s8 = "Hallo";
        char thirdChar = s8.toCharArray()[2];
        System.out.println(thirdChar); // l

        // 9. Vergleiche zwei Strings, ohne equals()
        String s9a = "Test";
        String s9b = "Test";
        boolean areEqual = true;
        if (s9a.length() == s9b.length()) {
            for (int i = 0; i < s9a.length(); i++) {
                if (s9a.charAt(i) != s9b.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        System.out.println(areEqual); // true

        // 10. Ersetze das letzte Zeichen eines StringBuilder mit einem anderen Zeichen
        // (ohne setCharAt())
        StringBuilder sb10 = new StringBuilder("Code!");
        char c10 = '?';
        char[] chars10 = sb10.toString().toCharArray();
        chars10[chars10.length - 1] = c10;
        sb10 = new StringBuilder(new String(chars10));
        System.out.println(sb10); // Code?

        int i = 3;
        int j = i.addOne();


    }

    public int addOne () {
        return  + 1;
    }
}