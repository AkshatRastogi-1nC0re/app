package com.willowood.akshatrastogi.willowoodagri;

public class first_words_seperator {

        public static String firstWords(String input, int words) {
            for (int i = 0; i < input.length(); i++) {
                // When a space is encountered, reduce words remaining by 1.
                if (input.charAt(i) == ' ') {
                    words--;
                }
                // If no more words remaining, return a substring.
                if (words == 0) {
                    return input.substring(0, i);
                }
            }
            // Error case.
            return "";
        }

    }
