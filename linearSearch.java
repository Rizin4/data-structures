import java.util.Scanner;

public class linearSearch {

    public static int LSearch(int limit, int arr[], int key){
        
        for (int i = 0; i < limit; i++) {
            if(arr[i]==key)
                return(i);
        }
        return(-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Array limit: ");
        int limit=sc.nextInt();

        int[] arr=new int[limit];
        System.out.println("Enter values to array: ");
        for (int i = 0; i < limit; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to find: ");
        int key=sc.nextInt();

        int value=LSearch(limit,arr,key);
        if (value==-1) {
            System.out.println("value is not found");
        }
        else
            System.out.println("Value is present");
    }
    
}
