// public class kadanes {
//     public static void kada(int arr[]){
//         int ms=Integer.MIN_VALUE;
//         int cs = 0;
//         for (int i=0;i<arr.length;i++){
//             cs = cs+arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("our max subarray sum is " + ms);
//     }
//     public static void main(String[] args) {
//         int arr[] ={2,3,4,5,6,7};
//         kada(arr);
//     }
// }



// class kadanes{
/     public static void kadan(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         int currsum = 0;

//         for(int i=0;i<arr.length;i++){
//             currsum += arr[i];
//             if(maxsum<0) {
//                 maxsum = 0;
//             }
//             maxsum=Math.max(maxsum, currsum);
//         }
//         System.out.println("our max sum is = "+maxsum);
//     }
//     public static void main(String[] args) {
//         int arr[] ={2,3,4,5,6,7,8,9,10,11,12};
//         kadan(arr);
//     }
    
// }