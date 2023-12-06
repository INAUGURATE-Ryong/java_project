package day13.generic;

public class GenericEx<T> {
    T[] v; // 맴버변수

    public void set(T[] v){
        this.v =v;
    }

    public void print(){
        for (T item : v ) {
            System.out.println(item);
        }
    }
}
