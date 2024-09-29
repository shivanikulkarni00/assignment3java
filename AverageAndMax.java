
import java.util.*;
public class AverageAndMax {

    static void sum(int a[], int n){
        int add=0;
        int average=0;
        for(int i=0;i<n;i++){
            add=add+a[i];
        }
        System.out.println("Sum is : "+add);
        average=add/n;
        System.out.println("Average is : "+average);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sum(a,n);

    }

}
/*

Enter the size of array :
6
1 2 3 4 5 6
Sum is : 21
Average is : 3

 */