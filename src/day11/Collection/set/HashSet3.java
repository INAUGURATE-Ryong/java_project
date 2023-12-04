package day11.Collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
//import java.lang.*; // 자동임포트

class Person{ // extends Object{ 가 내부적으로 생략
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // toString hashcode, equals는 toString 처럼 생략이 가능.
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+"\n";
    }

    @Override  // toString 처럼 hashcode와 equals를 불러와서 재정의를 한 것. 아까 String 타입의 특징 때문에 set을 써도 중복값들도
              // 담기게 되는데, 그것을 방지하기 위해서 재정의
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person temp = (Person) obj;
            return name.equals(temp.name) && age == temp.age;
        }
        return false;
    }
}

public class HashSet3 {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(new String("happy"));
        set.add(new String("happy"));
        set.add(new String("virus"));
        set.add(new Double(12.34));
        set.add(new Double(12.));
        set.add(new Double(12.34));

        Person ps = new Person("aaa",10);
        set.add(ps);
        set.add(new Person("David",10));
        set.add(new Person("David",33));
        set.add(new Person("David",10));
        set.add(new Person("David",22));
        System.out.println(set);  // 중복값들도 다 나옴, String 타입의 특성 때문
//        A a = new A();
//        B b = new B();
//        A bb = new B();
//        System.out.println(b instanceof A); // true
//        System.out.println(b instanceof B); // true
//        System.out.println(a instanceof A); // true
//        System.out.println(a instanceof B); // false a라는 객체가 B라는 애로 생성이 되냐

    }
}

//class A{
//    String name;
//}
//class B extends A{}
