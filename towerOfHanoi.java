public class towerOfHanoi {

    public static void hanoi(int n, String a, String b, String c){
        if(n == 1){
            System.out.println('transferred disk'+n+'from'+a+'to'+c);
            return;

        }
        hanoi(n-1, a, c, b);
        System.out.println('transferred disk'+n+'from'+a+'to'+c);
        hanoi(n-1, b, a, c);
    }
    public static void main(String[] args){

        int n = 2;
        hanoi(n,"s", "h", "d");
    }
}
