import java.util.Scanner;

public class Vapiwala_MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /// My 3 different stories(uncompleted with blanks)
        String story1 = "I was assigned a mission of the utmost importance. I had to sneak into a secret laboratory and find the (adjective) (plural_noun). The mission's success depended entirely on me, (name). I packed my bag, making sure to include (number) rope ladders, and slipped out into the night. I found the laboratory, but the security was intense. Several alarms (plural_verb) around the building, so I knew I had to be careful. A single (brainrot) (noun) (verb) at me from a nearby window. I held my breath and tiptoed past, knowing my cover would be blown if I made a sound.";
        String story2 = "It was an (adjective) morning when (name) grabbed a (noun), (verb) out the door, and found their boss (brainrot) with (plural_noun); they (verb), yelled “(brainrot) forever!”, and everyone started to (plural_verb).";
        String story3 = "I caught Grandma in the garage with a (noun), wearing a (adjective) cape, trying to (verb) while (brainrot) over (plural_noun); she winked and said, “Dont tell (name), or Ill unleash (number) (plural_verb).";

        //string collection section
    
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
 
        /// This is were all the functions are ran and the words are substituted

        story1 = wordReplacement(story1, "(adjective)", adjective);
        story1 = wordReplacement(story1, "(verb)", verb);
        story1 = wordReplacement(story1, "(noun)", noun);
        story1 = wordReplacement(story1, "(brainrot)", brainRot);
        story1 = wordReplacement(story1, "(plural_noun)", plularNoun);
        story1 = wordReplacement(story1, "(plural_verb)", plularVerb);
        story1 = wordReplacement(story1, "(number)", number);
        story1 = wordReplacement(story1, "(name)", name);

        story2 = wordReplacement(story2, "(adjective)", adjective);
        story2 = wordReplacement(story2, "(verb)", verb);
        story2 = wordReplacement(story2, "(noun)", noun);
        story2 = wordReplacement(story2, "(brainrot)", brainRot);
        story2 = wordReplacement(story2, "(plural_noun)", plularNoun);
        story2 = wordReplacement(story2, "(plural_verb)", plularVerb);
        story2 = wordReplacement(story2, "(number)", number);
        story2 = wordReplacement(story2, "(name)", name);
                
        story3 = wordReplacement(story3, "(adjective)", adjective);
        story3 = wordReplacement(story3, "(verb)", verb);
        story3 = wordReplacement(story3, "(noun)", noun);
        story3 = wordReplacement(story3, "(brainrot)", brainRot);
        story3 = wordReplacement(story3, "(plural_noun)", plularNoun);
        story3 = wordReplacement(story3, "(plural_verb)", plularVerb);
        story3 = wordReplacement(story3, "(number)", number);
        story3 = wordReplacement(story3, "(name)", name);
        
        /// Print completed stories
        System.out.println("------------------- Your 1st madlib Story ------------------");
        System.out.println(story1);
        System.out.println("------------------- Your 2nd madlib Story ------------------");
        System.out.println(story2);
        System.out.println("------------------- Your 3rd madlib Story ------------------");
        System.out.println(story3);
     

    }
        /// Function to perform word substitutions
    private static String wordReplacement(String finalStory, String preReplace, String postReplace) {
        int start = finalStory.indexOf(preReplace);
        while (start != -1) { ///I used AI to add this while start line only, I didnt have a while loop but that caused an error when i tested more than 1 story, the rest of the code is original

            int end = start + preReplace.length();
            finalStory = finalStory.substring(0, start) + postReplace + finalStory.substring(end);
            start = finalStory.indexOf(preReplace);
        }
        return finalStory;
    }
    
}