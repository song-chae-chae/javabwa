package ch05.example;

public class ArrayEx17 {
    public static void main(String[] args) {
        if (args.length != 3) { // JVM이 입력된 매개변수가 없을 때, null 대신 크기가 0인 배열 생성
            System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }
        System.out.println("결과 : " + result);
    }
}
