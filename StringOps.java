/** StringOps.java
  * Written by: Emily Van Laarhoven
  * CS 230 Assignment 3 Task 1
  * Due: 9/26/16 11:59pm
  */

public class StringOps {
  
  /**
   * store string in array with each letter at a different index, iterate through the array 
   * to find the first instance of ch, get rid of it and break and move everything down one 
   * and then concatenate back to string
   */
  public static String removeChar (String s, char ch) {
    // instance vars
  String[] letters = new String[s.length()];
  String newString = "";
  //store word as array of letters (strings)
  for (int i=0;i<s.length();i++){
   letters[i]=s.substring(i,i+1);
  }  
  if (s.indexOf(ch)>=0){ //case if ch in s - remove first instance of ch
    for (int j=0;j<s.indexOf(ch);j++){ //get letters up to ch
      newString+=letters[j];
    }
    for (int k=s.indexOf(ch)+1;k<s.length();k++){ //get letters after ch
      newString+=letters[k];
    }
    return newString; //return s with ch removed
  }
  return s; //case if ch not in s: return s
  }

  //testAnagram NOT using Recursion
  public static void testAnagrams (String word1, String word2) {
    final String storeWord2 = word2; //store word2 so we can decrement it
    if (word1.equals(word2)){ //case where word1=word2
      System.out.println("a word cannot be considered an anagram of itself");
    }
    if (word1.length()==word2.length()) { //anagrams must have same length
      for (int i=0;i<word1.length();i++){
        String temp = removeChar(word2,word1.charAt(i));
        word2=temp;
        if (word2.equals("")) {
          System.out.println(word1+" and "+storeWord2+" are anagrams");
        }
      }
    } else {
      System.out.println("don't have same length - not anagrams");
    }
  }

//  //testAnagram trying to use Recursion - can't figure out
//  public static void testAnagrams(String word1, String word2) {
//    if (word2.equals("")) {
//      System.out.println("word1 "+word1+" and word2 "+word2+" are anagrams");
//    } else {
//      testAnagrams(word1.substring(1),removeChar(word2,word1.charAt(0)));
//    }
//  }
  
  public static void main (String[] args) {
    //testing removeChar
   System.out.println(removeChar("java",'a'));
   System.out.println(removeChar("java",'j'));
   System.out.println(removeChar("hello",'o'));
   System.out.println(removeChar("hello",'l'));
   System.out.println(removeChar("",'k'));
//testing testAnagrams
    testAnagrams("melon","lemon");
    testAnagrams("abcde","wzyx");
    testAnagrams("hello","hello");
    testAnagrams("hell","hello");
    testAnagrams("emily","mylie");
    }
  
  }