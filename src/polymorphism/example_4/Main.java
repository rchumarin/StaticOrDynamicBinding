package polymorphism.example_4;

public class Main {
    public static void main(String args[]) {
        ASuper aSubInstance = new ASub();
        BSuper bSubInstance = new BSub();

        aSubInstance.method(bSubInstance);
        aSubInstance.method(null);
        aSubInstance.method(new BSub());
    }
}

class ASuper {
    public void method(BSuper b) {
        System.out.println("1");
    }

    public void method(BSub b) {
        System.out.println("2");
    }
}

class ASub extends ASuper {
    public void method(BSuper b) {
        System.out.println("3");
    }

    public void method(BSub b) {
        System.out.println("4");
    }
}

class BSuper {}

class BSub extends BSuper {}

/*
Вывод:
    3
    4
    4
*/
