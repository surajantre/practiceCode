// class prac {
//     public static void pattern(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//         for(int i=n; i>=0; i--){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //System.out.println();
//     }
//     public static void main(String[] args){
//         pattern(4);
        
//     }
// }




// import java.util.*;
// class prac{
//     public static int binerySearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;

//         while(start <= end){
//             int mid = (start+end)/2;

//             if(arr[mid]==key){
//                 return mid;
//             }
//             if(arr[mid]<key){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
//         int key = 9;
//         System.out.println(binerySearch(arr, key));

//     }
// }













// public class prac{
//     public static int binarySearch(int[] arr,int key){
//         int start=0;
//         int end=arr.length-1;

//          while(start<=end){
//             int mid = (start+end)/2;

//             if(arr[mid]==key){
//                 return mid ;
//             }
//             if (arr[mid]<key){
//                 start= mid+1;
//             }else{
//                 end = mid -1;
//             }
//          }
//          return -1;
//     }
//     public static void main(String[] args){
//         int arr[] ={1,2,3,4,5,6,7,8,9,0};
//         int key = 8;
//         System.out.println(binarySearch(arr, key));
/     }
// }



// import java.util.*;
// public class prac{
//     public static int binarySearch(int[] arr,int key){
//         int start = 0;
//         int last = arr.length-1;

//         while(start<=last){
//             int mid = (start+last)/2;

//             if (arr[mid]==key){
//                 return mid;

//             }
//             if (arr[mid] <key){
//                 start=mid+1;
//             }else{
//                 last=mid-1;
//             }
//         }
//       return -1;
//     }
//     public static void main(String[] args){
//         int arr[] ={2,3,4,5,6,7,8,9};
//         int key = 9;
//         System.out.println(binarySearch(arr, key));
 
//     }
// }