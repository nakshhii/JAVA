import java.util.Scanner;
 class aad {
    int a,b;
    aad(int x , int y)
    {
       a= x;
       b = y;
    }
    void output()
    {
        int c = a+ b;
        System.out.println(c);
    }
    public static void main(String[]args)
    {
        int m ,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        m = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        n = sc.nextInt();
        aad aa = new aad(m,n);    
        aa.output();
    }
    
}
