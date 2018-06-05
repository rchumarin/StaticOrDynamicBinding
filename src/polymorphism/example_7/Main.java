package polymorphism.example_7;

public class Main {

    public boolean equals( Main other ) {
        System.out.println( "Inside of Main.equals" );
        return false;
    }

    public static void main( String [] args ) {
        Object t1 = new Main();
        Object t2 = new Main();
        Main t3 = new Main();
        Object o1 = new Object();

        int count = 0;
        System.out.println( count++ );// prints 0
        t1.equals( t2 ) ;
        System.out.println( count++ );// prints 1
        t1.equals( t3 );
        System.out.println( count++ );// prints 2
        t3.equals( o1 );
        System.out.println( count++ );// prints 3
        t3.equals(t3);
        System.out.println( count++ );// prints 4
        t3.equals(t2);
    }
}

/*
http://qaru.site/questions/65817/java-dynamic-binding-and-method-overriding
Вывод:
    0
    1
    2
    3
    Inside of Main.equals
    4
*/