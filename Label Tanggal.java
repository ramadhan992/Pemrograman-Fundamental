import java.util.Scanner;
class LabelTanggal{
  public static void main(String[] args) {
        String[] Bulan = {
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
        Scanner input = new Scanner(System.in);
        System.out.print("");
          int tanggal = input.nextInt();
        System.out.print("");
          int bulan = input.nextInt();
        System.out.print("");
          int tahun = input.nextInt();
        System.out.printf(tanggal  +  Bulan[bulan-1] + tahun);
     
    
 }
 
}