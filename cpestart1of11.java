

import java.util.*;
import java.util.Arrays;
public class cpestart1of11{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
        String a=cin.nextLine();
        String b=cin.nextLine();
        int[] tab1=new int[26];
        int[] tab2=new int[26] ;
        Arrays.fill(tab1,0);
        Arrays.fill(tab2,0);

        for(int i=0;i<a.length();i++){
            int d=a.charAt(i);
            if(d>=97&&d<=122){
            tab1[d-97]++;
            }
        }
        for(int i=0;i<b.length();i++){
            int d=b.charAt(i);
            if(d>=97&&d<=122){
            tab2[d-97]++;
            }
        }

        for(int i=0;i<=26;i++){
            int min=Math.min(tab1[i], tab2[i]);
            for(int j=0;j<min;j++){
                System.out.print((char)(i+97));
            } 
        }
        System.out.println();
        }
        cin.close();
    }
}
       
