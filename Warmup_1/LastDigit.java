package Warmup_1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int lda,ldb;
        lda = a % 10;
        ldb = b % 10;
        return lda == ldb;
    }
}
