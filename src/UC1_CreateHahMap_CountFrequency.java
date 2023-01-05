import java.util.*;
import java.io.*; //Java Input Output package
public class UC1_CreateHahMap_CountFrequency {

    static void FrequencyOFString(String inputString){ /// Creating a HashMap containing char
        HashMap<Character, Integer> frequencyCountMap = new HashMap<Character,Integer>();
        // Converting given string to char array
        char[] strArray = inputString.toCharArray();
        for(char c : strArray){
            if(frequencyCountMap.containsKey(c)){
                // If char is present in charCountMap,
                // incrementing it's count by 1
                frequencyCountMap.put(c , frequencyCountMap.get(c) +1);
            }
            else {
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                frequencyCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : frequencyCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // Driver Code
    }

    public static void main(String[] args) {
        String str = "hello i am here";
        FrequencyOFString(str);


    }
}
