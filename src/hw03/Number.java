package hw03;

public class Number {
    public Number(){
        //
    }
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean numberInInterval(int n) {
        if (100 >= n && n >= 25) {
            return true;
        }
        return false;
    }
}
