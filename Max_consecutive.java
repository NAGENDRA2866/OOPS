//  maximum consective numbers in a given string

import java.util.Scanner;

public class Max_consecutive {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String Word = sc.nextLine();

        int max_c = 1;
        int current_c = 1;

        for (int i = 1;i<Word.length();i++)
        {
            if (Word.charAt(i) == Word.charAt(i-1))
            {
                current_c++;
            }
            else
            {
                current_c = 1;
            }
            if (current_c > max_c) 
            {
                max_c = current_c;
            }
        }
        System.out.println(max_c);
    }
}
