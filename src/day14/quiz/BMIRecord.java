package day14.quiz;

import java.io.Serializable;

/*
문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기
    추가 / 삭제 / 출력 / 수정  처리할것 (file 저장 함수 따로 만들수도 있고)
 몸무게, 키를 입력 받아서  BMI 계산하기
 BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) );
  남 : (신장cm - 100) X 0.9
  여 : (신장cm - 100) X 0.85
-
판정>
18.5 미만 저체중
18.5 ~ 22.9  정상
23.0 ~ 24.9  과체중
25.0  이상 비만
 */
public class BMIRecord implements Serializable {
    protected String name;
    protected double height;
    protected double weight;
    protected String gender;

    public BMIRecord(String name, double height, double weight, String gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public BMIRecord() {

    }

    public double calculateBMI() {
        double bmi;
        if ("남자".equals(gender)) {
            bmi = (height - 100) * 0.9;
        } else {
            bmi = (height - 100) * 0.85;
        }
        return bmi;
    }

    public String JudgmentBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "저체중 입니다.";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "정상 입니다.";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "과체중 입니다.";
        } else {
            return "비만 입니다.";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", BMI: " + calculateBMI() + ", 결과 : " + JudgmentBMI();
    }

    protected void display() {
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : "+ weight);
        System.out.println("성별 : " + gender);
        System.out.println("BMI : " + calculateBMI() );
    }
}
