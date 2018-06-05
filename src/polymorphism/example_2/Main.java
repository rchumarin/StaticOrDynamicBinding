package polymorphism.example_2;

class A {
    void m1(A a) {
        System.out.print("A");
    }
}

class B extends A {
    void m1(B b) {
        System.out.print("B");
    }
}

class C extends B {
    void m1(B c) {
        System.out.print("C");
    }
}

public class Main {
    public static void main(String[] args) {
        A c1 = new C();
        c1.m1(new B());
    }
}

/*
https://ru.stackoverflow.com/questions/279518/Полиморфизм-в-java
Вывод:
      A
*/
