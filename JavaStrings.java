// "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

//This exercise is to test your understanding of Java Strings. A sample String declaration:
//String myString = "Hello World!"
//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

//Given two strings of lowercase English letters, A and B, perform the following operations:
//Sum the lengths of A and B.
//Determine if A is lexicographically larger than  B(i.e.: does B come before A in the dictionary?).
//Capitalize the first letter in A and B and print them on a single line, separated by a space.

//Input Format
//The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

//Output Format
//There are three lines of output:
//For the first line, sum the lengths of A and B.
//For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

//Sample Input 0
//hello
//java

//Sample Output 0
//9
//No
//Hello Java

//Explanation 0
//String A is "hello" and B is "java".
//A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
//When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.
//When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

    int len = (A.length()) + (B.length());
    System.out.println(len);
        
int value = A.compareTo(B);
if (value > 0){
System.out.println("Yes");}
else  {
System.out.println("No");}

    char flA = A.charAt(0);
    char flB = B.charAt(0);
    String output = Character.toUpperCase(flA) + A.substring(1, A.length())+  " " + Character.toUpperCase(flB) + B.substring(1, B.length()) ;
    System.out.println(output);

    }
}



