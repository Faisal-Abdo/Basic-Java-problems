import java.util.Scanner;

public class SecondQ {
    public static void main(String[] args){
    //System.out.println("Price:" + price);
        // printing days
        String dayName="";
       
        for (int day = 0; day <= 7; day++) {
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName="Tuesday";
                break;
            case 4:
                dayName="Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName="Friday";
                break;
            case 7:
                dayName="Saturday";
                break;
        };
            System.out.println(dayName);


        }

    }}
