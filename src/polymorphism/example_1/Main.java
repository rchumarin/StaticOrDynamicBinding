package polymorphism.example_1;

public class Main {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        // Динамическое связывание на основе объекта
        int premium = current.premium();

        // Статическое связывание на основе класса
        String category = current.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}

class Insurance {
    public static final int LOW = 100;

    public int premium() {
        return LOW;
    }

    public static String category() {
        return "Insurance";
    }

}

class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    public int premium() {
        return HIGH;
    }

    public static String category() {
        return "Car Insurance";
    }

}

/*
https://javarush.ru/groups/posts/439-razlichija-mezhdu-rannim-i-pozdnim-svjazihvaniem-v-java
Приватные, статические и final-методы связываются при помощи статического связывания,
а виртуальные – динамического. Аналогично, лучший пример статического связывания – перегрузка методов,
а переопределение – динамического.
Вывод:
    premium : 200
    category : Insurance
*/
