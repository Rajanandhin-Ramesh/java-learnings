package Functions;

public class Scoping {
    static void main(String[] args) {
        int a = 100;
        int b =101;
        func(a,b);
        System.out.println(a+" inside main "+b);
        System.out.println(a);
        System.out.println(b);
        {
            System.out.println(a);
            System.out.println(b);
            int c=102;
            System.out.println(c);
        }
        int c =103;
        System.out.println(c);
        for (int i=1;i<=10;i++){
            System.out.println(i);

        }

    }
    static void func(int a, int b)
    {
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
}
