class area
{
    double r, pi, ar;
    void init()
    {
        r= 10.5;
        pi= 3.14;
    }
    void calc()
    {
        ar = pi*r*r;
    }
    void display()
    {
        System.out.println(ar);
    }
}