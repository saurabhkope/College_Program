// Q1. Write a program create class as MyDate with dd,mm,yy as data members. Write
// parameterized constructor. Display the date in dd-mm-yy format. (Use this keyword)

class MyDate {
    private int dd;
    private int mm;
    private int yy;

    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public void displayDate() {
        System.out.println("Date: " + dd + "-" + mm + "-" + yy);
    }
}

public class MyDateExample1 {
    public static void main(String[] args) {
        MyDate date = new MyDate(28, 10, 23);
        date.displayDate();
    }
}
