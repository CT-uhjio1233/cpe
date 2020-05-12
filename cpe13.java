
import java.util.Scanner;

public class cpe13{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int x=0;
        while(cin.hasNext()){
            String a=cin.nextLine();
            if(a=="end-of-file"){
                break;
            }
           
            for(int i=0;i<a.length();i++){
                ;
                if(a.charAt(i)=='"'&&x%2==0){
                    System.out.print("``");
                    x++;
                }else if(a.charAt(i)=='"'&&x%2==1){
                    System.out.print("\'\'");
                    x++;
                }else{
                    System.out.print(a.charAt(i));
                }
            }
            System.out.println();
        } cin.close();
    }
}