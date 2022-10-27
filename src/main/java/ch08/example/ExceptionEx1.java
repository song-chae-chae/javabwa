package ch08.example;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            // try {} catch (Exception e) // error -> 변수 e 중복됨
        } // try-catch 의 끝
        
        try {
            
        } catch (Exception e) {
            
        } // try-catch 의 끝
        
    }
}
