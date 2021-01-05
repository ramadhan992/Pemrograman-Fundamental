import java.util.Scanner;
class namaBulan {
  public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
        String[] namaBulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };
        System.out.print("");
        int nomorBulan = input.nextInt();
        try{
       String hasil = namaBulan[nomorBulan-1];
       System.out.println(hasil);
        }catch 
        (ArrayIndexOutOfBoundsException e){
         System.out.println("nomor tidak valid");
     }
    
  }
}