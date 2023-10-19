public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(s));
    }
    public static int firstNonRepeatingCharacter(String string) { //O(n^2) approach
        int n = string.length();
        for(int i=0;i<n;i++){
            boolean val = false;
            for(int j=0;j<n;j++){
                if(i!=j && string.charAt(i) == string.charAt(j)){
                    val = true;
                    break; // Exit the inner loop as soon as a repeated character is found
                }
            }
            if(!val){
                return i;
            }
        }
        return -1;
    }
    //O(n) best approach
//    public int firstNonRepeatingCharacter(String string) {
//        Map<Character, Integer> map = new HashMap<>();
//        for(char c: string.toCharArray()){
//            map.put(c, map.getOrDefault(c,0)+1);// counting the frequencies of each character in string
//        }
//        for(int i=0;i<string.length();i++){
//            if(map.get(string.charAt(i)) == 1){ // if frequency is 1, it means it's not repeated
//                return i;
//            }
//        }
//        return -1;
//    }
}
