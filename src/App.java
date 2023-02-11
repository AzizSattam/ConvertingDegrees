import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("1: for converting to Celsius \n2: for converting to Fehrenheit");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        
        while (input != 1 && input != 2) {
            input = sc.nextInt();
            if (input != 1 && input != 2) {
                System.out.println("Wrong output! Please enter either 1 or 2.");
            }
        }

        System.out.println("Enter the degree you want to convert: ");
        double X = sc.nextDouble();


        if (input == 1){
            Celsius cel = new Celsius();
                cel.ConvertToCel(X);
            }
        else if (input == 2){
            Fahren fh = new Fahren();
            fh.convertToFeh(X);
            
        }
        
    }
}
