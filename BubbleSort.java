import java.util.*;
class BubbleSort{
    public static void bubble(int a[])
    {
        int n= a.length;
        for(int i= 0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                
            }
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n; i++)
            a[i]=sc.nextInt();
        bubble(a);
        System.out.println("Sorted array");
          for (int i=0; i<n; i++){
              System.out.println(a[i]);
          }
    }
}

//output
enter array size
5
Enter array elements:
12
45
23
1
3
Sorted array
1
3
12
23
45
