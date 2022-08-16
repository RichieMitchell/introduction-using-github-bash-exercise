import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        //Initialize array
        int storage=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=sc.nextInt();
//creates an array in the memory of length 10
       // storage=storage+sc.nextInt();





       // if(sc.nextInt==10)
       // if(n==10) {
            int[] array = new int[100000000];
      //  }

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=sc.nextInt();
        }
       // System.out.println("Array elements are: ");
// accessing array elements using the for loop
      //  for (int i=0; i<n; i++)
      //  {
       //     System.out.println(array[i]);
     //   }


        //REVERSAL HERE-------
       // int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {

            if(array[i]!=0)
            {

                System.out.print(array[i] + " ");
            }



           // System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length-1; i >= 0; i--) {

            if(array[i]!=0)
            {

                System.out.print(array[i] + " ");
            }


          //  System.out.print(array[i] + " ");
        }
    }
}