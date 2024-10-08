//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        String str = "Hello dunya";
//        System.out.printf("%s\n", str);
//        Main m1 = new Main();

        /*
            Car car = new Car(1000, 2000, Color.RED);
            car.showInfos();
        */

        Pet p = new Pet("Husky");
        System.out.println(p);
        System.out.println(p.toString());

        int x = 10;


        /**
         *
         * integer'i string'e cevirmeyi cozdum.
         String str = Integer.toString(x);
         System.out.println(str);
         */


//        if (x instanceof String) {
//            System.out.println("truecast");
//        }
    }
}
