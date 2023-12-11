package day16.NetworkTcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx {
    public static void main(String[] args) throws IOException, MalformedURLException {
        URL google  =new URL("https://www.en-core.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream())); //웹상에서 통로 연결
        //System.in : 표준 입력 - 키보드로부터

        String inputLine;
        while ((inputLine = br.readLine() )!=null){
            System.out.println(inputLine);  // url의 HTML코드 등 뼈대 출력됨.
        }
        br.close();
    }
}
