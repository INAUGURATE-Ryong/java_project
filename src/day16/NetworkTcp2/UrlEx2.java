package day16.NetworkTcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx2 {
    public static void main(String[] args) throws IOException, MalformedURLException {
        URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&sxsrf=AM9HkKkLijIBv9HeFqqydj8cgqUgY7JVpQ%3A1702275285266&ei=1ah2ZdvoD8_L1e8P7Z2egA8&ved=0ahUKEwibp8DN3YaDAxXPZfUHHe2OB_AQ4dUDCBA&uact=5&oq=kim+yuna&gs_lp=Egxnd3Mtd2l6LXNlcnAiCGtpbSB5dW5hMgoQLhiABBiKBRhDMgUQABiABDIFEC4YgAQyBRAuGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMhkQLhiABBiKBRhDGJcFGNwEGN4EGN8E2AECSN0JUOkGWOkGcAF4AJABAJgBc6ABc6oBAzAuMbgBA8gBAPgBAcICChAAGIAEGA0YsAPCAhAQLhgNGIAEGMgDGLAD2AEBwgIQEC4YgAQYDRjIAxiwA9gBAeIDBBgBIEGIBgGQBgy6BgQIARgIugYGCAIQARgU&sclient=gws-wiz-serp");
        https:
//www.google.com/  // 호스트이름
//         search?// 검색
//         q=kim+yuna //  키 벨류값
//         &sca_esv=589698990//  키 벨류값
//         &sxsrf=AM9HkKkLijIBv9HeFqqydj8cgqUgY7JVpQ%3A1702275285266&ei=1ah2ZdvoD8_L1e8P7Z2egA8&ved=0ahUKEwibp8DN3YaDAxXPZfUHHe2OB_AQ4dUDCBA&uact=5&oq=kim+yuna&gs_lp=Egxnd3Mtd2l6LXNlcnAiCGtpbSB5dW5hMgoQLhiABBiKBRhDMgUQABiABDIFEC4YgAQyBRAuGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMhkQLhiABBiKBRhDGJcFGNwEGN4EGN8E2AECSN0JUOkGWOkGcAF4AJABAJgBc6ABc6oBAzAuMbgBA8gBAPgBAcICChAAGIAEGA0YsAPCAhAQLhgNGIAEGMgDGLAD2AEBwgIQEC4YgAQYDRjIAxiwA9gBAeIDBBgBIEGIBgGQBgy6BgQIARgIugYGCAIQARgU&sclient=gws-wiz-serp
        // URL이 가지고 있는 함수들 사용

        System.out.println("프로토콜 : " +url.getProtocol());
        System.out.println("호스트와 포트 : " +url.getAuthority());
        System.out.println("호스트 : " +url.getHost());
        System.out.println("포트 : " +url.getPort());
        System.out.println("경로 : " +url.getPath());
        System.out.println("질의 : " +url.getQuery());
        System.out.println("파일명 : " +url.getFile());
        System.out.println("참조 : " +url.getRef());

    }
}
