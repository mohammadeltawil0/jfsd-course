public class MonthName {
    // public static void main(String[] args) {
    //     //Write a program to print month name of base of given month number
    //     int month = 21;
    //     String monthName="";
 
    //     if (month == 1) {
    //         monthName = "January";
    //     } else if (month == 2) {
    //         monthName = "February";
    //     } else if (month == 3) {
    //         monthName = "March";
    //     } else if (month == 4) {
    //         monthName = "April";
    //     } else if (month == 5) {
    //         monthName = "May";
    //     } else if (month == 6) {
    //         monthName = "June";
    //     } else if (month == 7) {
    //         monthName = "July";
    //     } else if (month == 8) {
    //         monthName = "August";
    //     } else if (month == 9) {
    //         monthName = "September";
    //     } else if (month == 10) {
    //         monthName = "October";
    //     } else if (month == 11) {
    //         monthName = "November";
    //     } else if (month == 12) {
    //         monthName = "December";
    //     } else {
    //         monthName = "Invalid Value";
    //     }

    //     System.out.println(monthName);
    // }

    public static void main(String[] args) {
        int month = 5;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;    
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Value");                
        }
        System.out.println("Done");
    }
}


