class average1
{
    int maths, physics, biology;
    double ans;
    void init ( int m)
    {
        maths = m;
        physics = 80;
        biology = 100;
    }
    void calc()
    {
        ans = ( maths*physics*biology)/3;
    }
    void display()
    {
        System.out.println( ans);
    }
}