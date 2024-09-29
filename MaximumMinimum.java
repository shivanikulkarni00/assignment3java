import java.util.*;
public class MaximumMinimum {

    static void maxMin(int a[], int n){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }

            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2){
                min2=a[i];
            }
        }
        System.out.println("2nd Maximum number is "+max2);
        System.out.println("2nd Minimum number is "+min2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        maxMin(a,n);
    }
}
/*
Enter Size of array :
4
78 56 34 90
2nd Maximum number is 78
2nd Minimum number is 56

 */