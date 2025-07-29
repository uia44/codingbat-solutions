package String_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String l = str.substring(str.length()-2);
        return l+l+l;
    }
}
