import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter your name");
        String name = "(Name) ".concat(scanner.nextLine());
        System.out.println("Enter an adjective");
        String adjective = "(Adjective) ".concat(scanner.nextLine());
        System.out.println("Enter a noun");
        String noun = "(Noun) ".concat(scanner.nextLine());
        System.out.println("Enter a verb");
        String verb = "(Verb) ".concat(scanner.nextLine());
        System.out.println("Enter some silly brainrot");
        String brainRot = "(Brainrot) ".concat(scanner.nextLine());
        System.out.println("Enter a plural verb");
        String plularVerb = "(Plular Verb) ".concat(scanner.nextLine());
        System.out.println("Enter a plural noun");
        String plularNoun = "(Plular Noun) ".concat(scanner.nextLine());
        System.out.println("Enter a random number");
        String number = "(Number) ".concat(scanner.nextLine());
 
        // scanner.nextLine();

        String allInput = name + adjective + noun + verb + brainRot + plularVerb + plularNoun;

        System.out.println("\n -------------- Your MadLib Story -------------------- \n");
        System.out.print("I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the " + adjective + " " + plularNoun + ".");
        System.out.println("The mission's success depended entirely on me, " + name + ".");
        System.out.println("I packed my bag, making sure to include" + number + " rope ladders, and slipped out into the night.");
        System.out.println("I found the laboratory, but the security was intense. Several alarms " + plularVerb + " around the building, so I knew I had to be careful.");
        System.out.println(" A single " + brainRot + " " + noun + " " + verb + " at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.");
    }
}
