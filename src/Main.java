public class Main {
    public static void main(String[] args)
    {
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
    }
}