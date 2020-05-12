import java.util.Scanner;
import java.util.TreeSet;


public class cpe15 {
public static void main(String[] args){
    Scanner cin=new Scanner(System.in);
    while(cin.hasNext()){
        int n=cin.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=cin.nextInt();
        }
        TreeSet tree=new TreeSet();
        for(int i=0;i<n-1;i++){
            int x=Math.abs(arr[i]-arr[i+1]);
            if(x<n && x!=0)tree.add(x);
        }
        if(tree.size()==n-1){
            System.out.println("Jolly");
        }else{
            System.out.println("Not jolly");
        }
    }
    
}
}
