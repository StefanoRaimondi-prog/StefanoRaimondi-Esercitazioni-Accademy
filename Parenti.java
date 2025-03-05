public class Parenti {
}

class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show();
        System.out.println("Child's show()");
    }
}

class Main {
    public static void main(String[] args) {
        final Parent obj = new Child();
        obj.show();
    }
}
