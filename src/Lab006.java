public class Lab006 {
    public int m;
    public int n;

    public boolean Lab006(int m,int n){
        this.m = m;
        this.n = n;
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
        }

}
