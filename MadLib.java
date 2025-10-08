import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String story1 = "I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the (adjective) (plural_noun). The mission's success depended entirely on me, (name). I packed my bag, making sure to include (number) rope ladders, and slipped out into the night. I found the laboratory, but the security was intense. Several alarms (plural_verb) around the building, so I knew I had to be careful. A single (brainrot) (noun) (verb) at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.";
        String story2 = "I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the (adjective) (plural_noun). The mission's success depended entirely on me, (name). I packed my bag, making sure to include (number) rope ladders, and slipped out into the night. I found the laboratory, but the security was intense. Several alarms (plural_verb) around the building, so I knew I had to be careful. A single (brainrot) (noun) (verb) at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.";
        String story3 = "I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the (adjective) (plural_noun). The mission's success depended entirely on me, (name). I packed my bag, making sure to include (number) rope ladders, and slipped out into the night. I found the laboratory, but the security was intense. Several alarms (plural_verb) around the building, so I knew I had to be careful. A single (brainrot) (noun) (verb) at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.";



    
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter an adjective");
        String adjective = scanner.nextLine();
        System.out.println("Enter a noun");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb");
        String verb = scanner.nextLine();
        System.out.println("Enter some silly brainrot");
        String brainRot = scanner.nextLine();
        System.out.println("Enter a plural verb");
        String plularVerb = scanner.nextLine();
        System.out.println("Enter a plural noun");
        String plularNoun = scanner.nextLine();
        System.out.println("Enter a random number");
        String number = scanner.nextLine();
 


        story1 = wordReplacement(story1, "(adjective)", adjective);
        story1 = wordReplacement(story1, "(verb)", verb);
        story1 = wordReplacement(story1, "(noun)", noun);
        story1 = wordReplacement(story1, "(brainrot)", brainRot);
        story1 = wordReplacement(story1, "(plural_noun)", plularNoun);
        story1 = wordReplacement(story1, "(plural_verb)", plularVerb);
        story1 = wordReplacement(story1, "(number)", number);
        story1 = wordReplacement(story1, "(name)", name);
        
        System.out.println("------------------- Your 1st madlib Story ------------------");
        System.out.println(story1);
     

    }

    private static String wordReplacement(String finalStory, String preReplace, String postReplace) {
        int start = finalStory.indexOf(preReplace);
        int end = start + preReplace.length();
        finalStory = finalStory.substring(0, start) + postReplace + finalStory.substring(end);
        start = finalStory.indexOf(preReplace);

        return finalStory;
    }
    
}