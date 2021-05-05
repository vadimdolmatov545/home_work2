package home_work1;


/*
    1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp,
    и прописать в нем метод main().
     */

public class HomeWorkApp1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(1, 2);
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
