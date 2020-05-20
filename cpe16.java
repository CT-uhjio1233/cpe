import java.util.Scanner;

public class cpe16 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int round=cin.nextInt();
        while(round>0){
            int players=cin.nextInt();
            double winper=cin.nextDouble();
            int number=cin.nextInt();
            double losper=1-winper;

            double per1 = Math.pow(losper, number-1)*winper;
           

            double a=Math.pow(players,50);
            
            double per2=1-Math.pow(losper,a);
           

            double per3=1-Math.pow(losper,players);
           
            double answer=(per1*per2)/per3;

            double answer2=(double)(Math.round(answer*10000))/10000;
            
            String str=String.valueOf(answer2);
            while(str.length()<6){
                str=str+"0";
            }
            System.out.println(str);
            round--;
        }
    }    
}