/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comm;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author mike
 */
public class SHA1 {
    
    private static String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i=0; i < b.length; i++) {
          result +=
                Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
}
    public static String convert (byte [] convertme) {
        
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        }
        catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        return byteArrayToHexString(md.digest(convertme));
}
    }
    
