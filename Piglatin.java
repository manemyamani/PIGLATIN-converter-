package Strings;
import java.util.*;
public class Piglatin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== 'A' || s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                s1.append(s.substring(i));
                break;

            }
            s2.append(s.charAt(i));           
        }
        s1.append(s2).append("AY");
        System.out.printf("the piglatin word for the given input is = %s",s1);
        sc.close();
    }
    
}
