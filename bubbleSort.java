import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int limit=sc.nextInt();
        int[] arr=new int[limit];
        System.out.println("Enter Elements:");
        for (int i = 0; i < limit; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before Sorting: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i]+" ");
            
        }

        int flag=0;
        for (int i = 0; i < limit-1; i++) {
            for (int j = 0; j < limit-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
                if(flag==0){
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("\nArray is sorted");
        }
        else{
            System.out.println("\nSorted array is: ");
            for (int i = 0; i < limit; i++) {

                System.out.print(arr[i]+" ");
            }
        }
    }
}
