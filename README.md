# MadLib Game Thing In Java

## What does this program do?

- This MadLib program begins with prompting the user to enter types of words, ex: a verb, a noun, an adjective, etc.. After all the words are typed in by the user, the program will spit out 3 madlibs with the users words placecd in its reserved spot creating a users own unique silly madlib.

## Overall Structure 
- 3 story templates with the blank spaces filled in the the type of word surrounded by parenthesis, EX; (verb)
- Scanner takes user input for 8 variables for types of words to be filled into the template
- A bunch of function call statements to fill in input into the blank spaces on all 3 MadLib templates
- Lastly the wordReplacement() Function it self that takes in the the story templates as a paramater, the blank space, and the user input all as parameters. The function utlizes string indexing and subsring methods to find blanks and replace them with inputs.

## wordReplacement() Function
- The following function performs the word replacements in a given story by finding the blanks and replacing the word with the user inputted word, then returns the completed template after the word replacements.
   ### Line by Line breakdown
    - Line 73: Takes parameters: finalStory(The story template), preReplace(Blank space word), postReplace(word that replaces blank)
    - line 74: sets an integer variable named **start** that finds the numerican index of the word to be replaced, the blank space EX: (verb)
    -  Line 75: this while loop checks to make sure the index  of **start** exists
    -  line 77: sets an integer variable **end** which is equal to the index of the start variable + the length of the blank space; this line creates space to cut out the blank and replace it with the users word
    -  line 78: This is the main line where the magic happens the the word the user inputted actually gets swapped into the blank, splitting the story from everything before the blank space(**start** variable), using a substring method, adding the user inputted word, then adding everything after using another substring method and inputting the **end** variable
    -  line 79: repeats line 74 so it can be redone for another replacement
    -  line 81: returns the completed story
 
  ## execution of wordReplacement()
    - The run statements go by the folllowing format: story = wordReplacement(the story, "(blank)" , replacement);. Example: story2 = wordReplacement(story2, "(verb)", verb);
    - Every word has its own runstatement filled into the template variable
 
  ## Functionality Screenshot
