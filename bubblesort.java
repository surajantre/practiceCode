// class bubblesort{
//     public static void bubble(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }
//     public static void print(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static int  binarysearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;

//         if (start <= end ){
//             int mid = (start+end)/2;

//             if (arr[mid] == key){
//                 return mid;
//             }
//             if(key> arr[mid] ){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
/             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[] = {32,53,5,23,12,35,7};
//         int key = 12;
//         bubble(arr);
//         print(arr);
//         System.out.println(binarysearch(arr, key)); 
//     }
// }





// class bubblesort{
//     public static void bubble(int arr[]){
//         for (int i=0;i<arr.length-1;i++) {
//             for (int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>=arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }

//             }

//         }
//     }
//     public static void print(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr [] = {23,54,65,86,43,12,};
//         bubble(arr);
//         print(arr);
//     }
// }

