package projetmerlin;

public class Fraction {

    private int a,b;

    public Fraction(int a)
    {
        this.a = a;
        this.b = 1;
    }

    public Fraction(int a, int b) {
        this.a = a;
        if(b != 0)
            this.b = b;
        else
            this.b = 1;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getA()
    {
        return this.a;
    }

    public int getB()
    {
        return this.b;
    }

    public Fraction Mult(Fraction f)
    {
        this.a *= f.getA();
        this.b *= f.getB();
        return f;
    }

    public String toString() {
        if(b!=1)
            return a+"/"+b;
        else
            return a+"";
    }
}
