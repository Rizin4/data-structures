import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter limit: ");
        int limit=sc.nextInt();

        int[] arr = new int[limit];
        System.out.println("Enter the values: ");
        for (int i = 0; i < limit; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value to find: ");
        int key = sc.nextInt();

        int last = limit-1;
        int first=0;

        BSearch(arr,key,last,first);
    }

    public static void BSearch(int arr[], int key, int last, int first){
        while (first<=last) {
            int mid = (first+last)/2;
            if (arr[mid]==key) {
                System.out.println("Element is found");
                break;
            }
            else if(arr[mid]<key){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        if(first>last){
            System.out.println("Element is not found");
        }
    }
    
}
