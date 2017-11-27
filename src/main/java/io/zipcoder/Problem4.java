package io.zipcoder;

import java.util.*;

public class Problem4 {

    public String isPalindromePermutation(String input) {
        if (countOfOddLetters(input) == 0) {
            return isPalindromePermutationEvenLength(input);
        }
        else {
            return isPalindromePermutationOddLength(input);
        }
    }

    public String isPalindromePermutationEvenLength(String input) {
        if (input.length()%2==0) {
            Integer countOfOddLetters = countOfOddLetters(input);
            if (countOfOddLetters==0) {
                return "YES";
            }
        }
        return "NO";
    }

    public String isPalindromePermutationOddLength(String input) {
        if (!(input.length()%2==0)) {
            Integer countOfOddLetters = countOfOddLetters(input);
            if (countOfOddLetters==1) {
                return "YES";
            }
        }
        return "NO";
    }

    public Integer countOfOddLetters(String input) {
        Integer countOfOddLetters = 0;
        for (Integer aLetterCount : mapOfLetters(input).values()) {
            if (!(aLetterCount%2==0)) {
                countOfOddLetters++;
            }
        }
        return countOfOddLetters;
    }

    public Map<String, Integer> mapOfLetters(String input) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String aLetter :input.split("")) {
            if (frequencyMap.containsKey(aLetter)) {
                frequencyMap.put(aLetter, frequencyMap.get(aLetter)+1);
            }
            else {
                frequencyMap.put(aLetter, 1);
            }
        }
        return frequencyMap;
    }
}
