import java.time.MonthDay;
import java.util.Scanner;

public class cprstart1of14 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        while(a>0){
            int month=cin.nextInt();
            int date=cin.nextInt();
            switch(month){
                case 1:
                count(date,11);
                break;
                case 2:
                count(date,22);
                break;
                case 3:
                week((6+date)%7);
                break;
                case 4:
                count(date,4);
                break;
                case 5:
                count(date,9);
                break;
                case 6:
                count(date,6);
                break;
                case 7:
                count(date,11);
                break;
                case 8:
                count(date,8);
                break;
                case 9:
                count(date,5);
                break;
                case 10:
                count(date,10);
                break;
                case 11:
                count(date,7);
                break;
                case 12:
                count(date,12);
                break;
            }
        }
    }
public static void count(int date,int count){
    if(date==count){
        System.out.println("Monday");
    }else if(date>count){
        week((date - count) % 7);
    }else if(date<11){
        week(((Math.abs(count-date)%7)+5)%7);
    }
}
public static void week(int a){
        switch(a){
            case 0:
            System.out.println("Monday");
            break;
            case 1:
            System.out.println("Tuseday");
            break;
            case 2:
            System.out.println("Wednesday");
            break;
            case 3:
            System.out.println("Thursday");
            break;
            case 4:
            System.out.println("Friday");
            break;
            case 5:
            System.out.println("Saturday");
            break;
            case 6:
            System.out.println("Sunday");
            break;
    }
}
}