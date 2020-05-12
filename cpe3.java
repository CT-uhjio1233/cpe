

import java.util.*;
public class cpe3{
    public static void main(String[] args) {
        try{
            int a,b;
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
             a=in.nextInt();
            b=in.nextInt();
            while(!(a==0 && b==0)){
            int c=0,d=0;
            while(!(a==0&&b==0&&c==0)){
            c=(c+a%10+b%10)/10;
            d+=(c==1)?1:0;
            a=a/10;
            b=b/10; 
            }
             switch(d){
             case 0:
             System.out.println("No carry operation.");             
             break;
             case 1:
             System.out.println("1 carry operation.");
             break;
             default:System.out.println(d+ " carry operations.");break;
             
             } 
            }
            
            }
           
            in.close();
           
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};