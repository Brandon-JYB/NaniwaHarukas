import java.util.Scanner;
public class NaniwaHarukas {
  public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int a1 = 0, d = 0, n = 0;
      
      
      System.out.print("WELCOME TO NANIWA HARUKAS!\n\n\n");
      do {
          System.out.print("\nEnter the first term(a1): ");
          a1 = input.nextInt();
        } while (a1>100 || a1<1);
      do {
          System.out.print("\nEnter the common difference(d): ");
          d = input.nextInt();
        } while (d>100 || d<1);
      do {
          System.out.print("\nEnter the number of terms(n): ");
          n = input.nextInt();
        } while (n>50 || n<1);
      
      
      int[] arr = new int [n+1];
      arr[0] = a1;
      
      
      System.out.print("\n\n\nArithmetic Sequence: ");
      
      for (int i = 1; i<n+1; i++){
          arr[i] = arr[0] + (i-1)*d;
          System.out.print(arr[i] + " ");
      }
      
      int sum = (n*(2*a1 + (n-1)*d))/2;
      
      System.out.println("\n\nSum of sequence: " + sum);
      
      if(sum == 60){
          System.out.println("\nWelcome to the Observation Deck.\n\n\"It's a beautiful sunset, isn't it?\"");
      }
      else if(sum != 60 && sum%5 == 0 && sum%3 == 0){
          System.out.println("\nWelcome to the Souvenir Shop.");
      }
      else if(sum != 60 && sum%3 == 0){
          System.out.println("\nWelcome to the Restaurant and Sky Garden.");
      }
  }
}