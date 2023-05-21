// public class priflixarrays {
//     public static void pri(int arr[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int preflix[] = new int [arr.length];

//         preflix[0]=arr[0];
//         for (int i=0;i<arr.length;i++){
//             preflix[i]=preflix[i-1]-arr[i];
//         }
//         for (int i=0;i<arr.length;i++){
//             int start = i;
//             for (int j=0;j<arr.length;j++){
//                 int end = j;
//                  currsum = start==0?preflix [end]:preflix [end]-preflix [start-1];
//                  if(maxsum < currsum){
//                     maxsum = currsum;
//                  }
//             }
//         }
//        System.out.println("maxsum is " + maxsum);

 
//     }
//     public static void main(String[] args) {
//          int arr[] = {2,3,4,5,6,7};
//          pri(arr);

//     }
// }
