package day12.quiz;

import day11.QuizTeacher.Customer;

import java.util.*;

public class VideoManager extends Video {
    HashMap<Integer, Video> map = new HashMap<>();
    private static int currentKey = 1;

    public VideoManager() {
    }

    public VideoManager(String title, String category, char lend, String lendName, String lendDate) {
        super(title, category, lend, lendName, lendDate);
        Video v = new Video(title, category, lend, lendName, lendDate);
        map.put(VideoManager.currentKey++, v);

    }

    public void VideoAdd() { // 추가2
        Scanner sc = new Scanner(System.in);
        System.out.print("비디오제목 >> ");
        title = sc.next();
        System.out.print("장르 >> ");
        category = sc.next();
        System.out.print("대여여부(Y/N)  >> ");
        lend = sc.next().toUpperCase().charAt(0);
        if(lend=='Y'){
            System.out.print("대여자  >> ");
            lendName = sc.next();
            System.out.print("대여일자  >> ");
            lendDate = sc.next();
        }


        Video v = new Video(title, category, lend, lendName, lendDate);
        map.put(VideoManager.currentKey++, v);

    }

    public void VideoRmv(int i) { // 삭제
        System.out.println("\n\n* 삭제된 고객");
        map.get(i).display();
        System.out.println("--------------");
        map.remove(i);
    }

    public void VideoCh(int i, String title, String category, char lend, String lendName, String lendDate) { // 수정
        Video v = new Video(title, category, lend, lendName, lendDate);
        map.put(i, v); // 교체
    }

    public void display() {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry) it.next();
            Video video = (Video) map.getValue();
            System.out.println("비디오 코드 : " + map.getKey());
            System.out.println("비디오 제목 : " + video.title);
            System.out.println("비디오 장르 : " + video.category);
            System.out.println("대여 여부 : " + video.lend);
            if (video.lend == 'Y') {
                System.out.println("대여자 : " + video.lendName);
                System.out.println("대여일자 : " + video.lendDate);
            }

        }
    }
}