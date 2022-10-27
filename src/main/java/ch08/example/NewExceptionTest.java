package ch08.example;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 다시 설치");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.gc(); // Garbage Collection 수행 해 메모리 늘려줌
            System.out.println("다시 설치");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치 공간 부족");
        if (!enoughMemory())
            throw new MemoryException("메모리 부족");
    }

    static void copyFiles() {

    }

    static void deleteTempFiles() {

    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
