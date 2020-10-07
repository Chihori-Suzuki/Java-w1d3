import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        int day = 0;
        String strMonth = "";

        switch(month){
            case 1:
                strMonth = "January";
                day = 31;
                break;
            case 2:
                strMonth = "February";
                if(year % 4 == 0){
                    if(year % 100 != 0){
                        day = 29;
                    }else if(year % 400 == 0){
                        day = 29;
                    }else{
                        day = 28;
                    }
                }else{
                    day = 28;
                }
                break;
            case 3:
                strMonth = "March";
                day = 31;
                break;
            case 4:
                strMonth = "April";
                day = 30;
                break;
            case 5:
                strMonth = "May";
                day = 31;
                break;
            case 6:
                strMonth = "June";
                day = 30;
                break;
            case 7:
                strMonth = "July";
                day = 31;
                break;
            case 8:
                strMonth = "August";
                day = 31;
                break;
            case 9:
                strMonth = "September";
                day = 30;
                break;
            case 10:
                strMonth = "October";
                day = 31;
                break;
            case 11:
                strMonth = "November";
                day = 30;
                break;
            case 12:
                strMonth = "December";
                day = 31;
                break;

        }
        System.out.println( strMonth + " " + year +  " had " + day + " days");
    }
}
