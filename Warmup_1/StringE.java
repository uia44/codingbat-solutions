package Warmup_1;

public class StringE {
    public boolean stringE(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                c++;
            }
        }
        return c <= 3 && c >= 1;
    }
}
