// Q1. Write a program to accept the 'n' different numbers from user and store it in array. Also print
// the sum of elements of the array

import java.util.*;

 class arrsum1
 {
   int arr[];
    
    void arrinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  elements: ");
        int n = scanner.nextInt();
        
       arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }
   
   int sum() 
   {
     int add=0;
     for(int i=0;i<arr.length;i++)
     {
      add += arr[i];
      }
      
    System.out.println("addition of array elements:" +add);
  return add;
   }
   
   
  
     
   
 public static void main(String args[])
   { 
    arrsum1 obj=new arrsum1();
    obj.arrinput();
    obj.sum();
    
    System.out.println("elements in array:");
    for(int i=0;i<obj.arr.length;i++)
     {
       System.out.print(obj.arr[i] + " ");
     }
   
   
    }
    }