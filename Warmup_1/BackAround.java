package Warmup_1;

public class BackAround {
    public String backAround(String str) {
        String front;
        if (str.length() == 1){
            front = str;
        }
        else{
            front = String.valueOf(str.charAt(str.length() - 1));
        }
        return front + str + front;
    }
}
