package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it,
 * then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 *
 * Examples:
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 *
 */
public class PigLatin {
    public static String pigIt(String str) {

        String[] splitWords = str.split(" ");

        String convertedString =Arrays.stream(splitWords).map((spiltString)->{

            if(spiltString!=null&&(spiltString.equals("")||(!(spiltString.matches("^[a-zA-Z]*$"))))){
                return spiltString;
            }

            String initialString1 = "";
            String finalString1 = "";
            initialString1 = spiltString.substring(1);
            finalString1 = initialString1 + spiltString.substring(0,1) + "ay";
            return finalString1;
        }).collect(Collectors.joining(" "));


     return convertedString;
    }

    public static void main(String[] args) {
        System.out.println(PigLatin.pigIt("Pig latin is cool []!"));
    }
}
