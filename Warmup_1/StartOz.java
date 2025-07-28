package Warmup_1;

public class StartOz {
    public String startOz(String str) {
        String f="",s="";
        if(str.length() >= 2){
            if(str.substring(0,1).equals("o")){
                f = "o";
            }
            if(str.charAt(1) == 'z'){
                s = "z";
            }
            return f+s;
        }
        else if(str.length() == 1){
            return "o";
        }
        return f+s;
    }
}
