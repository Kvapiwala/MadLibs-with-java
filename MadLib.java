import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){ 

    

    Scanner scanner = new Scanner(System.in); //Create scanner for user input

    System.out.println("Enter your name");
    name = scanner.nextLine();
    System.out.println("Enter an adjective");
    adjective = scanner.nextLine();
    System.out.println("Enter an a noun");
    noun = scanner.nextLine();
    System.out.println("Enter a verb");
    verb = scanner.nextLine();
    System.out.println("Enter some silly brainrot");
    brainrot = scanner.nextLine();
    System.out.println("Enter a plular verb");
    plularverb = scanner.nextLine();
    System.out.println("Enter a plular noun");
    plularnoun = scanner.nextLine();
    System.out.println("Enter a random number");
    number = scanner.nextInt();

    System.out.println("I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the" + adjective + plularnoun + " The mission's success depended entirely on me, 3." +  name + ".
I packed my bag, making sure to include " + number + " rope ladders, and slipped out into the night. I found the laboratory, but the security was intense. Several alarms " +  plularverb + " around the building, so I knew I had to be careful. A single " + brainrot + noun +  verb " at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.");
 }
}
