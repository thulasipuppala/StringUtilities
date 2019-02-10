
/**
 * An introduction to Strings and String methods.
 *
 * @author Wilhem Alcivar
 */
public class StringParser
{
    private static String s1;
    /**
     * Takes a String and returns that String with all characters uppercased.
     * E.G. cat would become CAT. dOnUt would become DONUT.
     *
     * @param s
     * @return String
     */
    public static String upperCaseString(String s)
    {
        return s.toUpperCase();
    }

    /**
     * Takes a String and returns that String with all characters lowercased.
     * E.G. MOUSE would become mouse. dOnUt would become donut.
     *
     * @param s
     * @return String
     */
    public static String lowerCaseString(String s) {
        return s.toLowerCase();
    }

    /**
     * Takes a String and returns the first character of that string.
     * E.G. cat would return c. Embark would return E.
     *
     * @param s
     * @return String
     */
    public static Character getFirstCharacter(String s) {
        return s.charAt(0);
    }

    /**
     * Takes a String and returns the character at index n of that string.
     * E.G. cat, 2 would return t. Embark, 4 would return r.
     *
     * @param s
     * @param n
     * @return String
     */
    public static Character getNthCharacter(String s, Integer n) {
        return s.charAt(n);
    }

    /**
     * Takes a String and returns that string with the first character uppercased.
     * E.G. cat would return Cat. cofFee would return CofFee.
     *
     * @param s
     * @return String
     */
    public static String upperCaseFirstCharacter(String s) {
        s1 = s.substring(0,1).toUpperCase() + s.substring(1);
        return s1;
    }

    /**
     * Takes a String and returns that string with the first character of each word in it uppercased
     * and then joined.
     * E.G. dog whistle would return DogWhistle. adjuNCT pRoFessOR would return AdjuctProfessor.
     *
     * @param s
     * @return String
     */
    public static String camelCaseString(String s) {
        //String s2 = "";
        s1 = s.toLowerCase();
        //s1 = s1.subString(0,1) + s1.subString(1);
        //StringBuffer bf = new StringBuffer(s1);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) == ' '){
                s=s1.substring(0,1).toUpperCase()+s1.substring(1,i);
                s1=s1.substring(i+1,i+2).toUpperCase()+s1.substring(i+2);
                return s+s1;
            }
            else{
            s=s1.substring(0,1).toUpperCase()+s1.substring(1);
        }
        }
        
        return null;
    }

    /**
     * Takes a String and returns that string with each character lowercased
     * and then joined with an underscore
     * E.G. dog whistle would return dog_whistle. adjuNCT pRoFessOR would return adjuct_professor.
     *
     * @param s
     * @return String
     */
    public static String snakeCaseString(String s) {
        
        StringBuffer bf = new StringBuffer(s.toLowerCase());
        for(int i=0;i<bf.length();i++)
        {
            if(bf.charAt(i) == ' ')
            {
                bf.insert(i,"_");
                bf.deleteCharAt(i+1);
                s= bf.toString();
                return s;
            }
        }    
        return s;
    }

    /**
     * Takes a String and returns the length of that string
     * E.G. cat would return 3. extra would return 5.
     *
     * @param s
     * @return String
     */
    public static Integer getLength(String s) {
        return s.length();
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return false. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqual(String s1, String s2) {
        return s1.equals(s2);
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return true. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqualIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}
