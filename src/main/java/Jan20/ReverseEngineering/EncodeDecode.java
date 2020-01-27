package Jan20.ReverseEngineering;



public class EncodeDecode {
    public static void main(String[] args) {

        String results = encode("PRAVEEN");
        System.out.println("Encoded " + results);
        String decode = decode(results);
        System.out.println("Decode" + results);

    }

    /**
     * public String encode(String s) {
     *    StringBuffer encrypted = new StringBuffer();
     *    for (int i = 0; i < s.length(); i++) {
     *       char c = s.charAt(i);
     *       c += c + i;
     *       encrypted.append(c);
     *    }
     *    return encrypted.reverse().toString();
     * }
     */

    /**
     * @param str
     * @return
     */
     public static String encode(String str){

         StringBuffer strBuff = new StringBuffer();
         for(int i =0; i < str.length(); i++){
             char c = str.charAt(i);
             c += c + i;
             strBuff.append(c);
         }
         System.out.println("Before Encryption : " + strBuff.toString());
         System.out.println("After Encryption : " + strBuff.reverse().toString());

         return strBuff.reverse().toString();
     }

     /*
     * Solution:
     * public String decode(String input) {
     *    StringBuffer s = new StringBuffer(input).reverse();
     *    StringBuffer decrypted = new StringBuffer();
     *    for (int i = 0; i < s.length(); i++) {
     *       char c = s.charAt(i);
     *       c -= i;
     *       c /= 2;
     *       decrypted.append(c);
     *    }
     *    return decrypted.toString();
     * }
     */

     public static String decode(String input){
         StringBuffer strBuff = new StringBuffer((CharSequence) input).reverse();
         StringBuffer decrypeSB = new StringBuffer();

         for(int i=0; i< strBuff.length(); i++){
             char c = strBuff.charAt(i);

             c -= i;
             c /= 2;
             decrypeSB.append(c);
         }

         return decrypeSB.toString();
     }

}
