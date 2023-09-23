// public class countingsort {
//     public static void count(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0;i<arr.length;i++) {
//             largest = Math.max(largest,arr[i]);
//         }
//         int count [] = new int [largest+1];
//         for(int i = 0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         //sorting j=0;
//         for(int i = 0;i<arr.length;i++) {
//             while  ( count[i]>0){
//                 arr[i] = i;
//                 i++;
//                 count[i]--;

//             }
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,2,1,3,4,3,2,1,3,3,2,1};
//         count(arr);
        
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i] + " ");
//         }

//     }
// }
