class interest
{
    int p, t;
    double r, ans;
    void init ()
    {
        p = 2000;
        t =2; 
        r= 3.5;
    }
    void clac()
    {
        ans = (p*r*t)/100;
    }
    void display()
    {
        System.out.println(ans);
    }
}