package String_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int mid = str.length()/2 - 1;
        return str.substring(mid, mid+2);
    }
}
