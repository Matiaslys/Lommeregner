import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // her henter jeg mit data fra min java fil der hedder lommeregner
        Lommeregner tal = new Lommeregner();

        // jeg laver en scanner som tjekker hvad brugeren skriver i programmet
        Scanner scan = new Scanner(System.in);

        //her printer jeg en kommentar der siger at man skal give sit første nummer
        System.out.print("First number");

        //denne linje gør at man kan skrive det første nummer
        int First = scan.nextInt();

        //her printer jeg en kommentar der siger at man skal give sit andet nummer
        System.out.print("second number");

        // denne linje gør at man kan skrive det andet nummer
        int Second = scan.nextInt();

        System.out.println("What operation do you want to run 1: add 2: minus 3: multiply 4: division or 5: the secret operation.");
        int operation = scan.nextInt();
        // her har jeg lavet et if statement der gør at man ikke kan skriver andet end 1,2,3,4 eller 5
        if( operation > 5||operation < 1 ){
            System.out.println("choose another number, it must be 1,2,3,4 or 5.");
        }
        // hvis man skriver 1,2,3,4 eller 5 så sker dette og man får det resultat man søger.
        else{
            // her laver jeg et switch statement der gør at hvis man skriver et af de tal der er ved siden af case så sker det der er blevet skrevet i casen
        switch (operation) {
            case 1:
                System.out.println("your result is: " + tal.sum(First, Second));
                break;
            case 2:
                System.out.println("your result is: " + tal.minus(First, Second));
                break;
            case 3:
                System.out.println("your result is: " + tal.multiplicere(First, Second));
                break;
            case 4:
                System.out.println("your result is: " + tal.dele(First, Second));
                break;
            case 5:
                System.out.println("your result is: " + tal.secret(First, Second));
                break;
            }
        }
    }
}
