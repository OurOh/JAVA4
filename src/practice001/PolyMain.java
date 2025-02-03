package practice001;

public class PolyMain {

    public static void main(String[] args) {

        Parent parent = new Parent();
       //parent.parentMethod();

        Child child = new Child();
        //child.childMethod();

        //부모 변수가 자식 인스턴스를 참조한다.
        Parent parent2 = new Child();
        //parent2.parentMethod();


    }
}
