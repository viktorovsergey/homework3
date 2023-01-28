import javax.annotation.processing.SupportedOptions;

public class Main {
    public static void main(String[] args) {
     /* Задача 1
        переменной dog значение 8.0;
        переменной cat значение 3.6;
        переменной paper значение 763789
        Выведите значения каждой переменной в консоль.
        * */
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763_789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println(" ");
          /* Задача 2
        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        Выведите в консоль новые значения переменных.
        * */
        dog = dog + 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println(" ");
         /* Задача 3
          dog уменьшить на 3.5;
         cat уменьшить на 1.6;
          paper уменьшить на 7639.
          Выведите в консоль новые значения переменных
        * */
        System.out.println("dog = " + (dog - 3.5));
        System.out.println("cat = " + (cat - 1.6));
        System.out.println("paper = " + (paper - 7_639));
        System.out.println(" ");
        /*
        * Инициализируйте (присвойте значение) переменную friend значением 19.
          Увеличьте значение переменной на 2, после чего поделите значение на 7.
           После каждой операции выводите значение переменной в консоль. */
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        /*
        Инициализируйте переменную frog значением 3.5.
        Увеличьте переменную в 10 раз и поделите на 3.5.
        Добавьте к последнему значению переменной 4.
        После каждой операции выводите значение переменной в консоль.
        * */

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();


    }
}