public class boldThinQuest {
    public String bTQuest (char letter)
    {
        boolean isBold=true;
        char[] thinLet = {'e','i'};
        char[] boldLet={'a','o'};
        for (char a :thinLet)
        {
            if(letter ==a){
                return "This character is thin";

            }
        }
        for (char a:boldLet)
        {
            if (letter==a)
                return "This character is bold";
        }
        return "This is not vowel ";
    }

}
