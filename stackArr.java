import java.util.Scanner;

public class stackArr {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr= new int[80];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int p=50;
        while (p>0) {
            System.out.print("\n\n1.Push\n2.Pop\n3.Display\nEnter Choice: ");
            int ch=sc.nextInt();

            switch (ch) {
                case 1:
                    if(n==80){
                        System.out.println("Stack overflow");
                    }
                    else{
                        System.out.println("Enter the value to push: ");
                        int a=sc.nextInt();
                        arr[n]=a;
                        n++;
                    }
                    break;
                case 2:
                    if(n==0){
                        System.out.println("Stack underflow");
                    }
                    else{
                        n--;
                        System.out.println("Item Poped");
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i]+"  ");
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
