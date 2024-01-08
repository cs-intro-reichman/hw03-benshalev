/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(str.length());
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String ans = "" + (char)(s.charAt(0));
        int i = 1;
        while (i < s.length()){
             if (ans.indexOf((char)(s.charAt(i))) == -1 || s.charAt(i)== ' '){
                
                ans = ans + (char)(s.charAt(i));
                
            } 
                i++;
           } 
            
            return ans;
        }
       
    }