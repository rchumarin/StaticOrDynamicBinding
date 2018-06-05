package polymorphism.example_5;

public class Root {
    private void prt() {
        System.out.println("Root");
    }

    public static void main(String[] args) {
        Root root = new Branch();
        root.prt();

        Branch branch = (Branch) root;
        branch.prt();
    }
}

class Branch extends Root {
    final void prt() {
        System.out.println("Branch");
    }
}

/*
http://pr0java.blogspot.com/2015/07/blog-post_66.html
Вывод:
    Root
    Branch
 */
