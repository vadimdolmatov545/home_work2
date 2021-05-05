package home_work1;

    /*
    1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp,
    и прописать в нем метод main().
     */

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Здарова!");
        printThreeWords();
        checkSumSign(1,2);
        System.out.println(newsum(5,6));
        test2();
    }

    private static void test2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + "=" + j + " ");
            }

                System.out.println();
        }


    }







    private static int newsum(int a,int b) {
        return a + b;
    }

    /*
    2. Создайте метод printThreeWords(), который при вызове должен
    отпечатать в столбец три слова: Orange, Banana, Apple.
     */

    public static void printThreeWords () {
        String a =  "_Orange\n " + "_Banana\n" + "_Apple" ;
        System.out.println(a);

    }

    public static void checkSumSign(int a ,int b ) {
        int sum = a + b;
        if (sum >=0 ){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

}
