import java.util.*;
/*
 Java Program for Sorting first half in Ascending order and second half in Descending order
Example
Input: arr [6] = [1, 90, 34, 89, 7, 9]
Output: 1 7 9 90 89 34
 */
public class AsenDesen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);


        for (int i = 0; i < n / 2; i++)
            System.out.print(a[i]+" ");


        for (int j = n - 1; j >= n / 2; j--)
            System.out.print(a[j]+" ");
    }
}
/*
Enter array size :
4
3 6 1 9
1 3 9 6
 */