import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Home work if.");
        System.out.println("Задача 1. ");
        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Если возраст человека равен "+age+ " ,то он  несовершеннолетний, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен "+age+ " ,то он совершеннолетний.");
        }
        System.out.println("Задача 2. ");
        System.out.println("Введите температуру воздуха: ");
        int temp = in.nextInt();

        if (temp < 5) {
            System.out.println("На улице "+temp+ " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице  "+temp+ " градусов6,можно идти без шапки.");
        }
        System.out.println("Задача 3. ");
        System.out.println("Введите скорость машины: ");
        int speed = in.nextInt();

        if (speed <=60) {
            System.out.println("Если скорость "+speed+ " , то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость "+speed+ " ,то придется заплатить штраф.");
        }
        System.out.println("Задача 4. ");
        System.out.println("Введите возраст для определения учереждения: ");
        age = in.nextInt();

        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен "+age+ " , то ему можно ходить в детский сад.");
        } else  if (age >=7 && age <=17) {
            System.out.println("Если возраст человека равен "+age+ " , то ему нужно ходить в школу.");
        } else  if (age >=18 && age <=24) {
        System.out.println("Если возраст человека равен "+age+ " , то его место в университете.");
        } else  if (age >24 ) {
            System.out.println("Если возраст человека равен "+age+ " , то ему пора ходить на работу.");
        } else  {
            System.out.println("Если возраст человека равен "+age+ " , то он еще очень юн, пусть будет с мамой.");
        }
        System.out.println("Задача 5. ");
        System.out.println("Введите возраст ребенка для аттракциона: ");
        age = in.nextInt();

        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+age+ " , то он не может кататься на аттракционе.");
        } else  if (age >=5 && age <=14) {
            System.out.println("Если возраст ребенка равен "+age+ " , то он может кататься только в сопровождении взрослого");
        } else  {
            System.out.println("Если возраст ребенка равен "+age+ " , то он может кататься без сопровождения .");
        }
        System.out.println("Задача 6. ");
        System.out.println("Введите номер пассажира: ");
        int numPassenger = in.nextInt();

        if (numPassenger <=60) {
            System.out.println("Это "+numPassenger+ " пассажир, в вагоне займет сидячее место.");
        } else  if (numPassenger > 60 && numPassenger <=102) {
            System.out.println("Это"+numPassenger+ " пассажир, в вагоне займет стоячее место.");
        } else  {
            System.out.println("Это "+numPassenger+ " пассажир, вагон полностью забит.");
        }
        System.out.println("Задача 7. Нахождение максимального числа. ");
        System.out.println("Введите первое число: ");
        int x1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int x2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int x3 = in.nextInt();
        if ( x1 >= x2 && x1 >= x3) {
            System.out.println("Первое число "+x1+ " больше остальных");
        } else  if ( x2 > x1 && x2 >= x3) {
            System.out.println("Второе число "+x2+ " больше остальных.");
        } else  {
            System.out.println("Третье число "+x3+ " больше остальных.");
        }
    }
}