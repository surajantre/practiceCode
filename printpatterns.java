// public class printpatterns {
//     public static void main(String[] args){
//         for(int i=1; i<=4; i++){
//             System.out.println("* * * *");
//         }
//     }
// }

// import java.util.*;

// public class printpatterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;

//         while(i <= n){
//              sum = sum + i;
//              i = i+1;
//         }
//         System.out.println(sum);

//     }

// }

import java.util.Scanner;
public class printpatterns{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc. nextInt();
        int sum = 0;

        int i = 0;
        while (i <=n){
            sum += i;
            i++;
        }
        System.out.println(sum);

    }

}