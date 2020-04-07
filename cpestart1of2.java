

import java.util.*;
public class cpestart1of2 {
    public static void main(String[] args) {
        try{     
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){     
            long a=in.nextLong();
            long b=in.nextLong();        
            System.out.println(Math.abs(a-b));
            }
           in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
}