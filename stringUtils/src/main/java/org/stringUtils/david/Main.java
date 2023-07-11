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
}