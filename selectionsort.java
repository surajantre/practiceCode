// public class selectionsort {
//     public static void selection(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             int minpos=i;
//             for(int j=i+1; j<arr.length; j++){
//               if(arr[minpos]>arr[j]){
//                     minpos = j;

//                 }
/             }
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;

//         }
//     }

//     public static void print (int arr[]){
//         for (int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr [] = {21,34,56,6,7,87,9};
//         selection(arr);
//         print(arr);

//     }
// }

// class selectionsort{
//     public static void selection(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int minpos = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos = j;
//                 }
                 
//             }
//             int temp = arr[minpos];
//             arr [minpos]= arr[i];
//             arr[i]= temp;

//         }
//     }
//     public static void print (int arr[]){
//         for (int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {12,34,4,566,57,7,5468};
//         selection(arr);
//         print(arr);
//     }

// }