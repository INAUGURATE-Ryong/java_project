package day04.exam02;
// args 를 활용하는 이유는 scanner로 무한정 같은 값만 받는 상활일 때 고정값으로 지속적 받기 위해 활용하면 될듯
public class Input_test1 {
    public static void main(String[] args) {
        if(args.length <=0){
            System.out.println("데이터 입력하세요.");
            return; // 제어권 넘기기  에러 생기면서 종료하지 않고, 정상적으로 종료하기 위한 메세지 출력 argument에 값이 없으니..
        }
        String name = args[0];
        int su = Integer.parseInt(args[1]); // 문자를 int로 형변환 하는 함수

        System.out.println(name);
        System.out.println(su);  // args라는 배열에 값이 없어서 에러가 남.
        // 그래서 run with parameter  -> argument에 데이터를 넣어줘야 한다.

    }
}
