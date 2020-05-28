class interest2
{
    int p, t;
    double r, ans;
    void init( int principle, int time, double rate)
    {
        p = principle;
        t = time;
        r = rate;
    }
    void calc()
    {
        ans = ( p*r*t)/100;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        interest2 obg = new interest2 ();
        {
            obg.init (2000, 5, 2.5);
            obg.calc();
            obg.display();
        }
    }
}
        
       