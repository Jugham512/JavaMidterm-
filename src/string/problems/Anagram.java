package string.problems;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Anagram {


    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first word Dude :");
        String word1 = sc.next();
        System.out.println("Enter your Second word Buddy :");
        String word2 = sc.next();
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
         Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram = true;
        if(word1.length()==word2.length()){
            for (int i = 0; i<word1.length();i++){
                if (ch1[i]!= ch2[i]){
                    isAnagram = false;
                    break;
                }

                }
            if (isAnagram){
                System.out.println("ANAGRAM Bro !");
            }else {
                System.out.println("Not ANAGRAM Bro !");
            }
            }else {
            System.out.println("Not ANAGRAM Bro !");
        }
        }



    }


















