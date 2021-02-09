import java.io.*;
import java.*;
public class HelloWorld{

     public static void main(String []args){
        String s= "my name is dipankar kundu ";
        String str[] = new String[20];
        str = s.split(" ");
        System.out.println("length of str "+str.length);
        String finalStr = "";
        for(int i = 0; i < str.length; i++)
        {
            if(i%2 != 0)
            {
                StringBuilder sb = new StringBuilder(str[i]); 
                String temp= sb.reverse().toString();
                finalStr = finalStr + temp +" ";
            }else{
                finalStr = finalStr + str[i] +" ";
            }
        }
        System.out.println(finalStr);
    }
}
