// import java.util.*;
// public class arrays {
    
//     public static void main(String args[]){
//         int array[]=new int [100];
//         Scanner sc = new Scanner(System.in);

//          array[0]=sc.nextInt();
//          array[1]=sc.nextInt();
//          array[2]=sc.nextInt();

//          System.out.println("phy:"+array[0]);
//          System.out.println("chem:"+array[1]);
//          System.out.println("bio:"+array[2]);

//     }
// }

// import java.util.*;
// class arrays{
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){  
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String[] args){
//         int marks[]={90,93,84,0};
//         update(marks);

//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" ");

//         }
//         System.out.println();
//     }
// }
// import java.util.*;
// public class arrays{
//     public static void main(String[] args){
//         int arr[]= new int[100];
//         Scanner sc = new Scanner (System.in);
//         arr[0]= sc.nextInt();
//         arr[1]= sc.nextInt();
//         arr[2]= sc.nextInt();

//         System.out.println("phy"+arr[0]);
//         System.out.println("phy"+arr[1]);
//         System.out.println("phy"+arr[2]);
//     }
// }

// public class arrays{
//     public static void update(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             arr[i] = arr[i]+1;
//         }
//     }
//     public static void main(String[] args){
//         int arr[]={43,55,39};

//         update(arr);

//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();

//     }
//}

               // Lenear Search
// class arrays{
//     public static int linearSearch(int arr[], int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
            
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args){
//         int arr[] ={90,91,93,99};

//         int key = 90;

//         int index = linearSearch(arr, key);

//         if(index==-1){
//             System.out.println("key not found");
//         }else{
//             System.out.println("key at index "+index);
//         }


//     }

// }

// class arrays{
//     public static int linearSearch(int arr[], int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[]={91,93,94,59,69};
//         int key = 94;

//         int index = linearSearch(arr, key);

//         if(index==-1){
//             System.out.println("key is not found");
//         }else{
//             System.out.println("key at index "+index);
//         }

//     }
// }







// import java.util.*;
// class arrays{
//     public static int linearSearch(int arr[], int key){
//         for(int i=0; i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args){
//         int arr[] = {90,12,3,44,687,34,24};
//         int key = 34;

//         int index = linearSearch(arr, key);

//         if (index == -1){
//             System.out.println("key is not found");

//         }else{
//             System.out.println("key: " + index);
//         }

//     }

// }



// public class arrays{
//     public static int maxvalue(int arr[]){
//         int larger = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++){
//             if (larger < arr[i]){
//                 larger = arr[i];
//             }
//         }
//         return larger;

//     }
//     public static void main(String[] args){
//         int arr[] = {32,54,75,78,98};
//         System.out.println("large valuue is"+ maxvalue(arr));

//     }
// }
// class arrays{
//     public static int minvalue(int arr[]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i <arr.length; i++){
//             if(smallest>arr[i]){
//                 smallest=arr[i];
//             }
//         }
//         return smallest;

//     }
//     public static void main(String[] args){
//         int arr[] = {12,7};
//         System.out.println("minvalue"+minvalue(arr));

//     }
// }

// class arrays{
//     public static int minvalue(int[] arr){
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i < arr.length;i++){
//             if(smallest>arr[i]){
//                 smallest=arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String[] args){
//         int arr[] = {12,7,34,56,7,87,97};
//         System.out.println(minvalue(arr));
//     }
// }



// class arrays{
//     public static int mixvalue(int arr[]){
//         int larger = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if (larger<arr[i]){
//                 larger = arr[i];
//             }
//         }
//         return larger;
//     }
//     public static void main(String[] args){
//         int arr[]= {12,7,34,56,7,87,97};
//         System.out.println(mixvalue(arr));

//     }
// }