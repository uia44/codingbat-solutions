package Warmup_1;

public class Front22 {
    public String front22(String str) {
        String f2;
        if (str.length()<2){
            f2 = str;
        }
        else{
            f2 = str.substring(0,2);
        }
        return f2 + str + f2;
    }
}
