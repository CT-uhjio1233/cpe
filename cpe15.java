import java.util.Scanner;


public class cpe15 {
public static void main(String[] args){
    Scanner cin=new Scanner(System.in);
   
   
        String e=cin.nextLine();
        int[] arr=new int[e.length()];
        while(cin.hasNext()){
            int i=0;
            String in=cin.next(); 
            arr[i]=Integer.parseInt(in);
            i++;
        } 
        System.out.println(arr);
    
}
}
