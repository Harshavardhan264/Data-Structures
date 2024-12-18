import java.util.*;
class Main{
   public static int ls(int arr[], int target){
      for (int i=0; i<arr.length-1; i++){
        if(arr[i]==target){
         return i;
        }
      }
      return -1;
   }
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter array Size");
     int size = sc.nextInt();
     int arr[] = new int[size];
     System.out.println("enter the array elements");
     for(int i=0; i<size; i++){
        arr[i]= sc.nextInt();
     }
     System.out.println("enter the target:");
     int target = sc.nextInt();
     int result = ls(arr , target);
     if(result!=-1){
         System.out.println("key found");
         }
     else {
       System.out.println("key not Found");
       }
  }
}  

//output

Enter array Size
5
enter the array elements
12
34
56
2
7
enter the target:
2
key found
