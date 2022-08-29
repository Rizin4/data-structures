import java.util.Scanner;

public class linearS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit=sc.nextInt();

        int[] arr=new int[limit];
        System.out.println("Enter the values: ");
        for(int i=0;i<limit;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value to search: ");
        int key=sc.nextInt();
        int i;
        for (i = 0; i < limit; i++) {
            if (key==arr[i]) {
                System.out.println("Value is present");
                break;
            } 
            }
            if(i==limit){
                System.out.println("Value is not present");
            }
        }
    }
    

