package day13.generic;

import java.util.Date;

public class MainEntry {
    public static void main(String[] args) {
        GenericEx<String> t1 = new GenericEx<String>();
        String str[] = {"abc","kbs","dirooo"};
        t1.set(str);
        t1.print();
        System.out.println("=============================");

        GenericEx<Integer> t2 = new GenericEx<Integer>();
        Integer[] num  = {1,2,3,4,5,6,7,8};
        t2.set(num);
        t2.print();
        System.out.println("=============================");

        GenericEx<Double> t3 = new GenericEx<Double>();
        Double[] dou = {12.3,22.3,0.22,0.55};
        t3.set(dou);
        t3.print();
        System.out.println("=============================");

        GenericEx<Object> t4 = new GenericEx<Object>();
        Object[] obj = {"12.34",2,new Date(), 5.5,"text","내가 만든 객체( new Point )"};
        t4.set(obj);
        t3.print();
    }

    /* 제너릭 기본형
    class GenericEX<T,U>{
        T x,z;
        U y;
        public void SetX(T x){
            this.x = x;
        }
        public T getX(){
            return x;
        }

    }
     */
}
