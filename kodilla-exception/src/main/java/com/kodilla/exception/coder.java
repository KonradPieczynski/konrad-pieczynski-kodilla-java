import java.util.*;
import java.io.*;

class Main {

    public static String SearchingChallenge(String str) {
        // code goes here
        str = "-1";
        String[] words = str.split(" ");
        int maxWordNr = 0;
        int maxLettersInWord = 0;
        for (int j = 0; j < words.length; j++){
            int count = 1;
            int max = 0;
            char maxChar = 0;
            char[] word = words[j].toCharArray();
            for (int i = 1; i < word.length; i++){
                if (word[i]==word[i-1])
                {
                    count++;
                }
                else{
                    if (count > max){
                        max=count;
                        maxChar = word[i-1];
                    }
                    count = 1;
                }
            }
            if (max > maxLettersInWord)
            {
                maxWordNr = j;
                maxLettersInWord = max;
            }
        }
        str = words[maxWordNr];
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}