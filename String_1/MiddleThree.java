package String_1;

public class MiddleThree {
    public String middleThree(String str) {
        int st = (str.length() / 2) - 1, en = (str.length() / 2) + 2;
        return str.substring(st,en);
    }
}
