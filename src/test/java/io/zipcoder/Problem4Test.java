package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {
    Problem4 problem4 = new Problem4();
    String input = "aabcbaa";

    @Test
    public void mapOfLettersTest() {
        Integer expected = 4;
        Integer actual = problem4.mapOfLetters(input).get("a");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromePermutationTest() {
        String expected = "YES";
        String actual = problem4.isPalindromePermutationOddLength(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPalindromePermutationOddTest_aaabbbb() {
        String input = "aaabbbb";
        String expected = "YES";
        String actual = problem4.isPalindromePermutationOddLength(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPalindromePermutationTest_cdefghmnopqrstuvw() {
        String input = "cdefghmnopqrstuvw";
        String expected = "NO";
        String actual = problem4.isPalindromePermutation(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPalindromePermutationTest_cdcdcdcdeeeef() {
        String input = "cdcdcdcdeeeef";
        String expected = "YES";
        String actual = problem4.isPalindromePermutation(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isPalindromePermutationEvenLengthTest() {
        String input = "aabbbbaa";
        String expected = "YES";
        String actual = problem4.isPalindromePermutationEvenLength(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countOfOddLettersTest() {
        String input = "cdcdcdcdeeeef";
        Integer expected = 1;
        Integer actual = problem4.countOfOddLetters(input);
        Assert.assertEquals(expected,actual);
    }
}
