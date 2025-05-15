import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int reRun;
        do{
            System.out.print("Enter the Year: ");
        int year = sc.nextInt();
           if(year%4==0){
            System.out.println("It is an Leap Year");
        }
        else if(year%400==0){
            System.out.println("It is an Leap Year");
        }
        else{
            System.out.println("It is not an Leap Year");
        }
            System.out.println("-----------------------------------");
           System.out.println("Do you want to Run again?\n(YES=1/NO=0)");
           reRun = sc.nextInt();
       }while(reRun==1);

    }
}
