package DinamycProgramming;
import java.util.Scanner;
public class Praktikum01 {

     private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }

    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke : ");
        int n = scanner.nextInt();
        
        return n;
    }
    

    public static void main(String[] args) {
        String identitas = "Nashywa Syavira Nur Arliza / X RPL3 / 30";
        
        tampilJudul(identitas);
        int n = tampilInput();
    }
    
}
