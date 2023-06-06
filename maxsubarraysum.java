// public class maxsubarraysum {
//     public static void maxsum(int arr[]){
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++) {
//             int start = i;
//             for(int j=0;j<arr.length;j++) {
//                 int end = j;
//                  currsum = 0;
//                  for(int k = start;k<end;k++) {
//                     currsum = arr[k];
//                  }
//                  System.out.println();

            
//             if(currsum>maxsum){
//                 maxsum = currsum;
/             }
//         }
//     }
//     System.out.print("maxsum = " + maxsum);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,-6,-8,9};
//         maxsum(arr);
//     }
// }


// class maxsubarraysum{
//     public static void max(int[] arr){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++){
//             int start =i;
//             for(int j=start;j<arr.length;j++){
//                 int  end = j;
//                 currsum = 0;
//                 for(int k=start;k<end ; k++){
//                     currsum = arr[k];
//                 }
//                 System.out.println();
//                 if(maxsum<currsum){
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.print("maxsum = "+ maxsum);
// /     }
// /     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         max(arr);
//     }
// }