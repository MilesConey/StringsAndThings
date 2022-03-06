package io.zipcoder;


import java.util.ArrayList;
import java.util.List;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int count = 0; // initialized counter
        String[] yzWords = input.split(" "); // this splits each word in the string into multiple strings (elements)
        for (String word : yzWords) { //equivalent to saying String word = yzWords[i]
            if (word.charAt(word.length() - 1) == 'y' || word.charAt(word.length() - 1) == 'z') { //This functions inside out, meaning that (word.length() - 1) is counting the actual length of the word and subtracting one. Then word.charAt(word.length() - 1) is taking the length and using it in word.charAt as the index, to check if the last character in word is y or z.
                count++; // if y or z add to counter
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        return base.replace(remove, ""); // used .replace method. This allows one to replace one string (remove) with new "empty string" and then returns that to base. All instance of the values of remove have been replaced with empty string essentially removing them from base.
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int is = 0;
        int not = 0;
        for (int i = 0; i <= input.length(); i++) {
            if (input.startsWith("is", i)) {
                is++;
            } else if (input.startsWith("not", i)) {
                not++;
            }
        } return is == not;
    }
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') { // checks the character of each index within input, to see if input == to 'g". If it is, it also checks if character at the next index is also g. If both are, it returns true
                return true;
            }
        } return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) { // checks the character of each index within input, to see if input == to 'g". If it is, it also checks if character at the next index is also g. If both are, it returns true
                counter++;
            }
        } return counter;
    }
}
