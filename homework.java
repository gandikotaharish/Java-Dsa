public class homework {

    public static int calpow(int x, int n){
        if(x == 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }
       if(n % 2 == 0){
        return calpow(x, n/2) * calpow(x, n/2);
       }
       else{
        return calpow(x, n/2) * calpow(x, n/2) * x;
       }
    }

    public static void main(String[] args) {
        int x = 2, n = 3;

        System.out.println(calpow(x, n));
    }
}