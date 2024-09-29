
import java.util.*;
public class Reverse {

    static void reverse(int a[],int n,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Reverse array :");

        reverse(a,n,0,n-1);
    }
}
/*

Enter array size :
4
1 2 3 4
Reverse array :
4 3 2 1

 */