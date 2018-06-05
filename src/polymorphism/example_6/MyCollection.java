package polymorphism.example_6;

import java.util.Collection;
import java.util.HashSet;

public class MyCollection {

    public static void main(String args[])  {
        Collection c = new HashSet();
        MyCollection myCollection = new MyCollection();
        myCollection.sort(c);

    }

    //overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }


    //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }

}

/*
Вывод:
    Inside Collection sort method
*/