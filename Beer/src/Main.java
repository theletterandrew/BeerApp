import java.util.Scanner;



public class Main {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();
        Person person = new Person(zipCode);

        if(person.canBuy){
            System.out.println("YES! You can still buy beer!");
        }
        else{
            System.out.println("Sorry, you cannot legally buy beer right now.");
        }
    }
}
