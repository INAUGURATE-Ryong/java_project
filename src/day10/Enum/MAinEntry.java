package day10.Enum;

public class MAinEntry {
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.FRIDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WENDESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest sixthDAy = new EnumTest(Day.SATURDAY);
        sixthDAy.tellItLikeItIs();
    }
}
