class Calculators {
    public int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator {
    public Static void main(String[] args){
        Calculators obj=new Calculators();
        obj.add(10,20);
        obj.add(12,10,30);
        
    }
}

