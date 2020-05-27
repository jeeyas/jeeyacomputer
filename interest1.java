class interest1
{
    int principle, t;
    double r, ans;
    void init ( int p)
    {
        principle = p;
        t = 2;
        r = 3.5;
    }
    void calc()
    {
        ans = ( principle * r * t)/100;
    }
    void display ()
    {
    System.out.println (ans);
}
}
