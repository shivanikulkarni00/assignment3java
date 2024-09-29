/*
Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is
 completely divisible by sum of its digits.
Example: Suppose a number 24. Calculate the sum of digits of the number
(2 + 4) = 6 .Check whether the number
entered by user is completely divisible by    sum of its digits or not.
 */
import java.util.*;
public class six {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int copy=n;
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(copy%sum==0){
            System.out.println("Harshad number!");
        }
        else{
            System.out.println("Not harsad number!");
        }
    }
}
/*
Enter number :
24
Harshad number!

 */