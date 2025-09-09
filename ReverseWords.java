import java.util.ArrayList;

class ReverseWords {
    public String reverseWords(String s) {
        ArrayList<String> str = new ArrayList<>();
        int len = s.length();
        String temp = "";
        for(int i=0; i<len;i++){
            if(s.charAt(i) == ' '){
                if(temp != ""){
                    str.add(temp);
                }
                temp = "";
            }
            if(s.charAt(i) != ' '){
                temp += s.charAt(i);
            }
        }
        if(temp != ""){
            str.add(temp);
        }
        System.out.print(str);
        StringBuilder sb = new StringBuilder();
        for(int i = str.size()-1;i>=0;i--){
            if(i != 0){
                sb.append(str.get(i) + " ");
            }
            if(i == 0){
                sb.append(str.get(i));
            }
        }
        return sb.toString();
    }
}