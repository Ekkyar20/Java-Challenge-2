import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        int nilai;

        Scanner skor = new Scanner(System.in);
        System.out.print("masukkan skor anda:");
        nilai = skor.nextInt();

        if(nilai>=100) {
            System.out.println("Nilai salah");
        } else if(nilai>=91) {
            System.out.println("Nilai anda; A");
        }else if(nilai>=76) {
            System.out.println("Nilai anda; B");    
        }else if(nilai>=51) {
            System.out.println("Nilai anda; C");  
        }else if(nilai>=26) {
            System.out.println("Nilai anda; D");    
        }else if(nilai>=0) {
            System.out.println("Nilai anda; E");
        }
         
        

    }

}