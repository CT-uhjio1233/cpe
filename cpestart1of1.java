

import java.util.*;
public class cpestart1of1{
    public static void main(String[] args) {
        try{
            int a,b;
            Scanner in=new Scanner(System.in);
            a=in.nextInt();
            for(int i=0;i<a;i++){
            b=in.nextInt();
            int[] num=new int[b];
            for(int j=0;j<b;j++){       
            num[j]=in.nextInt();
            }
            Arrays.sort(num);
            int x=0;
            for(int c=0;c<b;c++){
            x+=(Math.abs(num[num.length/2]-num[c]));
            }         
            System.out.println(x);                   
            }        
            in.close();         
           
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
}