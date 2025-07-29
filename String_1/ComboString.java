package String_1;

public class ComboString {
    public String comboString(String a, String b) {
        String l,s;
        if (a.length() > b.length()){
            l = a; s = b;
        }
        else{
            l = b; s = a;
        }
        return s + l + s;
    }
}
