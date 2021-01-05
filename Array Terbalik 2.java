import java.util.Scanner;

class ArrayTerbalik 2 {
  public static void main(String[] args) {
    
   Scanner input = new Scanner(System.in);
      System.out.print("");
      int jumlah = input.nextInt();
      int[] nilai = new int [jumlah];
      
      for (int i = 0; i < jumlah; i++) {
        System.out.println("");
        nilai[i] = input.nextInt();
     }
      for (int i = jumlah-1 ; i >= 0; i--) {
       System.out.println(nilai[i] + " ");
     }
     
   }
    
}