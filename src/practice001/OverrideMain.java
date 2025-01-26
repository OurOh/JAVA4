package practice001;

public class OverrideMain {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.method();

        Child child = new Child();
        child.method();

        Parent parent2 = new Child();
        parent2.method();

    }

}
