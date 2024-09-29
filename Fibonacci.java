import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int fibo;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            //System.out.println()
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.println(fibo);
        }
    }
}
/*
Enter The Number :
13
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
 */