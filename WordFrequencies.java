import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int numElements;

      numElements = scnr.nextInt();

      String [] input = new String[numElements];
      int [] frequency = new int [numElements];
      int i;
      int j;
      int count;
      
      for (i=0; i<numElements; ++i) {
         input[i]= scnr.next();
      } 

      for (i=0; i<numElements; ++i) {
         count = 0;
         for (j=0; j<numElements; ++j){
            if (input[i].equals(input[j])) {
               count = count + 1;
            }
         }
         frequency[i] = count;

      }

      for (i=0; i<numElements; ++i) {
         System.out.println(input[i] + " - " + frequency[i]);
      }
   }
}