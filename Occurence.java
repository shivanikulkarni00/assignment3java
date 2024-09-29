
import java.util.*;
public class Occurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int count;
        int ans=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                   // ans=a[i];
                    count++;
                }
            }
            System.out.print(a[i]+" "+count);
        }
    }
}
