package javasessions;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        // ++ and --
        //1. Post Increment
        int p = 1;
        int q = p++;

        System.out.println(p);//2
        System.out.println(q);//1

       /* int c = -98;
        int d = c++;
        System.out.println(c); //-97
        System.out.println(d);//-98*/

        //2. Pre-Increment

        int f = 1;
        int g = ++f;
        System.out.println(f); //2
        System.out.println(g); //2

        int r = -100;
        int t = ++r;
        System.out.println(r); //-99
        System.out.println(t); //-99

        int h = -48;
        int l = ++h;
        System.out.println(h); //-47
        System.out.println(l); //-47

        //3. Post Decrement
        int m = 2;
        int n = m--;
        System.out.println(m); //1
        System.out.println(n); //2

        int total = 10;
        System.out.println(total++); //10
        System.out.println(total);//11

        int fee = 100;
        System.out.println(fee--);//100
        System.out.println(fee); //99

        //4. Pre Decrement
        int v = 2;
        int z = --v;
        System.out.println(v);//1
        System.out.println(z);//1

        int num = 10;
        System.out.println(--num); //9
        System.out.println(num); //9

        System.out.println("*******");

      /*  int i =11;
        int j = i++ + ++i; //11+13
        System.out.println(j);//24
        System.out.println(i); //13*/

        System.out.println("*******");
        int a = 11;
        int b = 22;
        int c;
        c = a + b + a++ + b++ + ++a + ++b; // 11+22+11+22+13+24
        System.out.println(c); //103
        System.out.println(a);//13
        System.out.println(b);//24

        System.out.println("*******");
        int i = 0;
        int j = i++ - --i + ++i - i--; //0-0+1-1
        System.out.println(i); //0
        System.out.println(j); //0

        System.out.println("*******");
        int m1 = 0, n1 = 0;
        int p1 = --m * --n * n-- * m--;
        //-1*-1*-1*-1
        System.out.println(m1);//-2
        System.out.println(p1); //1
        System.out.println(n1);//-2

        //int a = 11++ //invalid syntax

        int ch = 'A'; //65
        System.out.println(ch++); //65
        System.out.println(ch); //66

        char ch1 = 'A';//65
        System.out.println(ch1++); //A
        System.out.println(ch1); //B

        char ch2 = 'a';
        System.out.println(ch2++);
        System.out.println(ch2);

        char v1 = 'b';
        System.out.println(v1++); //b
        System.out.println(v1); //c
        System.out.println((byte) v1); //99

        char v2 = 'z';
        System.out.println(v2++); //z
        System.out.println(v2); //{

    }
}
