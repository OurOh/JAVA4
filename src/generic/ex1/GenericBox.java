package generic.ex1;

public class GenericBox<T> {
    // 나는 지금 결정 안할거야. T는 타입 매개변수
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }

}
