package com.company;

public class ManipulateTheString {
    public static void main(String[] args) {
        String input = "Deep episodes of Deep Space Nine came on the television only after the news. Digital alarm clocks scare area children.";

        // We assume output same as input initially.
        String output = input;

        // Getting all words from input String.
        String[] words = input.split(" ");

        // We are try to match every word to its next word for merging.
        for (int i = 0; i < words.length - 1; i++) {

            String first = words[i];
            String second = words[i + 1];

            String mergedWord = "";
            String part = "";

            // This is a flag when both word have some common part according to our need, we
            // set as true other wise it is false.
            boolean isMatched = false;

            // we are trying to match whole or any part of 'first' word match by which 'second' word may starts.
            for (int c = 0; c < first.length(); c++)

            {
                part = first.substring(c);

                if (second.startsWith(part)) {
                    isMatched = true;
                    break;
                }

            }
            if (isMatched) {

                mergedWord = first + second.substring(part.length());

                output = output.replace(first + " " + second, mergedWord);
            }

        }
        System.out.println(output);

    }
}
