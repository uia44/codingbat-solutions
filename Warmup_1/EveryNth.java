package Warmup_1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String nstr = "";
        for (int i=0; i<str.length(); i+=n){
            nstr += str.substring(i,i+1);
        }
        return nstr;
    }
}
