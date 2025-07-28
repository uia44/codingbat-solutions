package Warmup_1;

public class Close10 {
    public int close10(int a, int b) {
        int c,d;
        c = Math.abs(10 - a);
        d = Math.abs(10 - b);
        if(c<d){
            return a;
        }
        else if(d<c){
            return b;
        }
        else{
            return 0;
        }

    }

}
