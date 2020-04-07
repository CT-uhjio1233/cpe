
import java.util.Scanner;
import java.util.Vector;

public class cpestart1of13{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        
        while(cin.hasNext()){
            String a=cin.nextLine();
            if(a.equals("end-of-file")){
                break;
            }else{
                 System.out.println(a.replaceAll("\"","\'\'"));
            }   
        }
        cin.close();
    }
}