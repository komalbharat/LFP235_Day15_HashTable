public class UC2_SearchFreq_Index {
    public static void Index(){
        String searchableString = "don’t be evil.being evil is bad";
        String keyword = "be";

        int index = searchableString.indexOf(keyword);
        while (index >=0){
            System.out.println("Index : "+index);
            index = searchableString.indexOf(keyword, index+keyword.length())   ;
        }
    }
    public static void main(String[] args) {
        Index();
    }
}
