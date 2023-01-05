import java.util.*;

public class UC3_DeleteAoidableword {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(20, "komal");
        hashtable.put(30,"hi");
        hashtable.put(50,"how");
        hashtable.put(60,"are");
        hashtable.put(70,"you");
        System.out.printf(" initial table is "+hashtable);
        String returned_value = hashtable.remove(20);
        System.out.println("Returned value is: " + returned_value);
        System.out.println("New table is: " + hashtable);
    }


}
