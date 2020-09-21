import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {

        int[] c=new int[256];
        Arrays.fill(c,0);
        //int two=0;        
        for(int i=0;i<s.length();i++)
        {
                c[s.charAt(i)]+=1;
        }
        for(int k=0;k<256;k++)
            System.out.print(c[k]);
        int nor=0;
        for(int l=0;l<256;l++)
        {
            if(c[l]>0){
                nor=c[l];
                break;
            }
        }

        //int nor=c[s.charAt(0)];
        int max=0;
        for(int j=0;j<256;j++)
        {
            if(c[j]!=0 && c[j]!=nor && max<1)
                max++;
            else if(c[j]!=0 && c[j]!=nor)
                return "NO";

        } 

        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
