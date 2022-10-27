package ch08.example;

public class TryWithResourceEx {
    public static void main(String[] args) {
        // try 괄호 안에 객체 생성 문장을 넣으면
        // try 블럭을 벗어나는 순간 자동으로 close()가 호출됨
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false); // 예외 발생 x
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) { // 발생
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); // 예외 발생
        } catch (WorkException e) { // 발생
            e.printStackTrace();
        } catch (CloseException e) { // 발생
            e.printStackTrace();
        }
        // ch08.example.WorkException: WorkException
        //	at ch08.example.CloseableResource.exceptionWork(TryWithResourceEx.java:29)
        //	at ch08.example.TryWithResourceEx.main(TryWithResourceEx.java:15)
        //	Suppressed: ch08.example.CloseException: CloseException
        //		at ch08.example.CloseableResource.close(TryWithResourceEx.java:35)
        //		at ch08.example.TryWithResourceEx.main(TryWithResourceEx.java:14)

        // 예외가 여러개 발생함
        // exceptionWork에서 발생한 예외 내용 출력되고 close에서 발생한 예외는 suppressed 머리말과 함께 출력됨
        // 두 예외가 동시에 발생할 수 없기 때문에 실제 발생한 예외를 WorkException으로 하고 CloseException은 억제된 예외로 다룸
        // 억제된 예외에 대한 정보는 실제 발생한 예외에 저장됨
        // Throwable에는 억제된 예외와 관련된 메서드 정의되어 있음
        // Throwable은 Exception의 조상 클래스임
        // 만약 기본 try-catch 문을 사용했다면 WorkException은 무시되고 CloseException만 출력되었을 것
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ") 호출");

        if (exception)
            throw new WorkException("WorkException");
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close() 호출");
        throw new CloseException("CloseException");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}
