package org.stringUtils.david;

public class Main {
    public static void main(String[] args) {

        /*
        String reversedString = reverse("Hello World");
        System.out.println(reversedString);

        String name ="king";
        System.out.println(name.isEmpty());

        String phrase = "Hello world, I am learning Java";
        String test = reverseWords(phrase);
        System.out.println(test);


        String s = "Hello Hello Hello Hello";
        String target = "Hello";
        System.out.println(countOcurrences(s, target));


        String s = "hi guys, welcome to academia de codigo bootcamp Nice to have you here!";
        System.out.println(capitalize(s));
        */
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    //Problem with punctuation
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(reverse(word)).append(" ");
        }
        return reversedString.toString().trim();
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countOcurrences(String s, String target) {

        if (s == null || target == null || target.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        return count;

    }

    public static String capitalize(String s) {

        if (s == null || s.isEmpty()) {
            return null;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static boolean checkIfPalindrome(String s){

        if(s == null || s.isEmpty()){
            return false;
        }
        String reversedString = reverse(s);
        return s.equals(reversedString);
    }

    public String removeDuplicates(String s){
        if(s == null || s.isEmpty()){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            String currentChar = String.valueOf(s.charAt(i));
            if(!sb.toString().contains(currentChar)){
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public  String swapCharacters(String s, int index1, int index2){
        if(s == null || s.isEmpty()){
            return null;
        }
        char[] charArray = s.toCharArray();
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
        return String.valueOf(charArray);
    }

    public String encrypt(String s, int key){

        if(s == null || s.isEmpty()){
            return null;
        }
        
StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            char currentChar = s.charAt(i);
            int ascii = (int) currentChar;
            int encryptedAscii = ascii + key;
            char encryptedChar = (char) encryptedAscii;
            sb.append(encryptedChar);
        }
        return sb.toString();
    }


}