package day13.Text;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
	public static void main(String[] args) {
			String pattern = "50#F|60#D|70#C|80#B|90#A" ;
//			String pattern = "90#A|80#B|70#C60#D|50#F";   오류 낮은 값부터 써야한다.
			int[] score = { 100, 95, 70, 55, 60, 70 };
			
			ChoiceFormat  form = new ChoiceFormat(pattern);
			for(int i=0; i < score.length; i++) {
				System.out.println(score[i] + " : " + form.format(score[i]));
			}
	}
}
