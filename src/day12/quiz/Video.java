package day12.quiz;

public class Video {
    protected String title;
    protected String category;
    protected char lend;
    protected String lendName;
    protected String lendDate;

    public Video() {
    }

    public Video(String title, String category, char lend, String lendName, String lendDate) {
        this.title = title;
        this.category = category;
        this.lend = lend;
        this.lendName = lendName;
        this.lendDate = lendDate;
    }



    public void display(){
        System.out.println("비디오 제목 : " + title);
        System.out.println("장르 : " + category);
        System.out.println("대여여부 : " + lend);
        System.out.println("대여자(고객명) : " + lendName);
        System.out.println("대여일자(오늘날짜 입력) : " + lendDate);

    }


}
