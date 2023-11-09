// Q2. Define a class MyDate (day, month, year) with methods to accept and display MyDate object.
// Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException” ifthe date 
// is invalid. Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws InvalidDateException {
        this.day = day;
        this.month = month;
        this.year = year;
        checkValidDate();
    }

    public void displayDate() {
        System.out.println("Date: " + day + " " + month + " " + year);
    }

    private void checkValidDate() throws InvalidDateException {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > getDaysInMonth(month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + " " + month + " " + year);
        }
    }

    private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class DateValidation2 {
    public static void main(String[] args) {
        try {
            MyDate date = new MyDate(29, 2, 2020); // Valid date
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

        try {
            MyDate date2 = new MyDate(31, 6, 1990); // Invalid date
            date2.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
