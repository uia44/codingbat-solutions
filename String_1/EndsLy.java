package String_1;

public class EndsLy {
    public boolean endsLy(String str) {
        if(str.length()<2){
            return false;
        }
        return str.substring(str.length() -2).equals("ly");
    }
}
