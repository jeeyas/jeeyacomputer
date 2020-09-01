class marks
{
    int term1;
    int term2;
     int term3;
     double ans;
    void init(int n1, int n2, int n3)
    {
        int term1 = n1;
        int term2 = n2;
        int term3 = n3;
    }
    void calc()
    {
        double ans = (((( 30 / 100)*term1) + ((30 / 100)*term2) + (( 40 /100)*term3)))*100/500;
}
void display()
{
    System.out.println(ans);
}
public static void main ()
{
marks obj = new marks();
obj.init(413, 423, 430);
obj.calc();
obj.display();
}
}
 