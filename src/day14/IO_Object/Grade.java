package day14.IO_Object;

import java.io.Serializable;
/*
Serializable 인터페이스는 객체를 직렬화(Serialization)할 수 있도록 지원하는 인터페이스입니다.
직렬화는 객체를 바이트 스트림으로 변환하여 저장하거나 네트워크를 통해 전송하는 프로세스를 의미합니다.
이를 통해 객체의 상태를 영속적으로 저장하거나, 다른 시스템 간에 객체를 전송할 수 있습니다.
 */
public class Grade implements Serializable {
    private String subject; //과목
    private int score; //점수

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ObjectGrade{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
