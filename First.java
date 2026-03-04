import java.util.*;

public class First {
    public static void main(String[] argc){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age > 18){
        System.out.println("ADULT");
    }else{
        System.out.println("not adult");
    }
    sc.close();
}
}