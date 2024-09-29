/*
  Java program to count numbers of even and odd elements in an array
 */
import java.util.*;
public class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int countO=0;
        int countE=0;
        for( int i=0;i<n;i++){
            if(a[i]%2==0){
                countE++;
            }
            else{
                countO++;
            }
        }
        System.out.println("Even numbers in array : "+countE);
        System.out.println("oDD numbers in array : "+countO);
    }
}
/*
Enter array size :
6
1 8 2 9 3 7
Even numbers in array : 2
oDD numbers in array : 4
 */