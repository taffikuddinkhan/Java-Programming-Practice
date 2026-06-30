public class VowelsAndConstants {

    public static void countVowelAndConstant(String s){
        String formatted = s.toLowerCase();
        int vowel = 0;
        int constants = 0;
        for(char ch : formatted.toCharArray()){
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                vowel++;
            }
            else{
                constants++;
            }
        }
        System.out.println("vowel : " + vowel + " constants : " + constants);
    }

    public static void main(String[] args) {
        countVowelAndConstant("MADAM");
    }
}
