package challenges;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        word1.toLowerCase();
        word2.toLowerCase();
        char [] brokenword1 = word1.toCharArray();
        char [] brokenword2 = word2.toCharArray();
        if (brokenword1.length == brokenword2.length)
        {
            if (brokenword1 == brokenword2)
                return true;

            for (int i = 0; i<brokenword1.length; i++)
           {
                char letter = brokenword1[i];
               for (int j = 0; j<brokenword2.length; j++)
               {
                   char letter2 = brokenword2[j];
                   if (letter == letter2);
                   {
                       brokenword2[j] = '*';
                       break;
                   }

               }
           }
        }

        for (int k = 0; k<brokenword2.length; k++)
        {
            if (brokenword2[k]!= '*')
                return false;
        }

            return false;
    }
}
