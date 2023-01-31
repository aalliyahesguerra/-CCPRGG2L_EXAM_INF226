public class recursionprac {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "aalliyah sunshine esguerra";
        System.out.println(fullName);
       removeLetter(fullName);
    }

    static void removeLetter(String fullName) {
            // Add code here
            String vowel1 = fullName.substring(1);
            System.out.println(vowel1);

            removeLetter2(fullName);

    }
    static void removeLetter2(String fullName) {
            String vowel2 = fullName.substring(2);
            System.out.println(vowel2);
            removeLetter3(fullName);
    }
    static void removeLetter3(String fullName) {
            String vowel3 = fullName.substring(2,4) + fullName.substring(5);
            System.out.println(vowel3);
            removeLetter4(fullName);
    }
    static void removeLetter4(String fullName) {
        String vowel4 = fullName.substring(2,4) + fullName.substring(5,6) + fullName.substring(7);
        System.out.println(vowel4);
       removeLetter5(fullName);
    }
     static void removeLetter5(String fullName) {
        String vowel5 = fullName.substring(2,4) + fullName.substring(5,6) + fullName.substring(7,10) 
        + fullName.substring(11);
        System.out.println(vowel5) ;
        removeLetter6(fullName);
    }
    static void removeLetter6(String fullName) {
    String vowel6 = fullName.substring(2,4) + fullName.substring(5,6) + fullName.substring(7,10) 
    + fullName.substring(11,14) + fullName.substring(15);
    System.out.println(vowel6);
    removeLetter7(fullName);

     }
     static void removeLetter7(String fullName) {
        String vowel7 = fullName.substring(2,4) + fullName.substring(5,6) + fullName.substring(7,10)
        + fullName.substring(11,14) + fullName.substring(15,16) + fullName.substring(17);
        System.out.println(vowel7);
     }

    }
