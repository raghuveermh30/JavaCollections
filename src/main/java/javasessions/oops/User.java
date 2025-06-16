package javasessions.oops;

public class User {

    String name;
    int age;
    String city;

    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "Veena";
        u1.age = 25;
        u1.city = "Pune";

        User u2 = new User();
        u2.name = "Piyush";
        u2.age = 28;
        u2.city = "BLR";

        User u3 = new User();
        u3.name = "Raghu";
        u3.age = 29;
        u3.city = "CLK";

        System.out.println(u1.name + " " + u1.age + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.city);

        System.out.println("**************");

       /* u1=u2;
        System.out.println(u1.name + " " + u1.age + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.city);

        System.out.println("**************");

        u2=u3;
        System.out.println(u1.name + " " + u1.age + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.city);

        System.out.println("**************");
        u3=u1;
        System.out.println(u1.name + " " + u1.age + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.city);*/

        System.out.println("**************");


        u1 = u2 = u3;
        System.out.println(u1.name + " " + u1.age + " " + u1.city);
        System.out.println(u2.name + " " + u2.age + " " + u2.city);
        System.out.println(u3.name + " " + u3.age + " " + u3.city);

        /**
         * Try using 4 objects using pen and paper
         * u1=u2;
         * u2=u3;
         * u3=u4;
         * u4=u1;
         */

    }
}
