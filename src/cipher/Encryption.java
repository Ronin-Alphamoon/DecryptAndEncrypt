package cipher;

import java.util.*;

/**
 * @author Ronin-Alphamoon 
 */

public class Encryption {
    
    static Scanner scanner = new Scanner(System.in);
    
    final static String SPECIAL_CHARACTERS = "\n \t,.?!:;'`~\"[]{}()<>@#$%^&*|/+-=\\_";
    final static String UPPER_ALAPHABETS = "ABCDEFGHIKLMNOPQRSTVXYZ";         
    final static String LOWER_ALAPHABETS = UPPER_ALAPHABETS.toLowerCase();
    final static String NUMBERS = "0123456789";
    
    static String strPlainText;
    static String strEncryptedText;
    
    public static void Encryption(){
                        
        final char[] ALL_CHARACTERS_ARRAY = (UPPER_ALAPHABETS + LOWER_ALAPHABETS + 
                                              NUMBERS + SPECIAL_CHARACTERS).toCharArray();
        
        System.out.println(ALL_CHARACTERS_ARRAY);
        
    }
    
    
    
}
