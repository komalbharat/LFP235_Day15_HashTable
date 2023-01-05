import java.util.Map;
import java.util.TreeMap;

public class UC2_FrequencyOfString {
    static void CountFrequency(String str){
        Map< String,Integer> mp = new TreeMap<>();
        //Splitting to find the word
        String arr[] =str.split("");
        for (int i=0;i<arr.length;i++){
            if (mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i]+1));
            }
            else {
                mp.put(arr[i],1);
            }
        }
        for (Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.printf(entry.getKey()+ "-"+entry.getValue());
        }
    }
    public static void main(String[] args) {
     String str = "Komal";
     CountFrequency(str);// function call
    }
}
