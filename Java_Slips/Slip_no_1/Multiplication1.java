// Q1. Write a program to accept a number from user and generate multiplication table of a
// number.
import java.util.*;
public class Multiplication1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num +" * "+i+" = "+ (num*i));
        }
    }
}