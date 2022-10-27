package ch08.example;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);

    }
    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f) {
        try {
            f.createNewFile(); // 파일 생성
        } catch(Exception e) {

        }
    }
}
