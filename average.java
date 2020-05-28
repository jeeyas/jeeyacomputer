class average
{
    int m, p, h;
    double ans;
    void init ()
    {
        m = 70;
        p = 90;
        h = 100;
    }
    void calc()
    {
        ans = (m*p*h)/3;
    }
    void display ()
    {
        System.out.println(ans);
    }
}