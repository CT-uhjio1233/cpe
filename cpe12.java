
import java.util.Scanner;
import java.util.Vector;

public class cpe12{
	
public static void main(String[] args){
    Scanner cin=new Scanner(System.in);
    Vector<String> v=new Vector<String>();
    int max=0;
    int cases=0;
    while(cin.hasNextLine()){
        String a=cin.nextLine();
        if(max<a.length())max=a.length();
        v.add(a);
        cases++;
    }
    int count=0;
    for(int i=0;i<max;i++){
        for(int j=cases-1;j>=0;j--){
            if(i<v.get(j).length()){
                while(count>0){
                    System.out.print(" ");
                    count--;
                }
                System.out.print(v.get(j).charAt(i));
                count=0;
            }else{
                count++;
            }
        }
        System.out.println();
    }
    cin.close();
}
}