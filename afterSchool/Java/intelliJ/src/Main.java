/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu1();
    }

        public static void Menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(I)ntro (C)ourse (E)xit");
        String str = sc.nextLine();

        if (str.equals("e") || str.equals("E")) {
            System.out.println("안녕히 가세요");
            Exit();
        } else if (str.equals("i") || str.equals("I")) {
            Intro();
        } else if (str.equals("c") || str.equals("C")) {
            Courses();
        }

    }
        public static void Intro () {
        System.out.println("안녕하세요!\n"+
                "다양한 강좌를 통해 함께 공부합시다!");
        Menu1();
    }
        public static void Courses () {
        System.out.println("다음과 같은 코스가 존재합니다.\n" +
        "(P)ython  (J)ava  (i)os  (B)ack");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("p") || str.equals("P")) {
            Python();
        } else if(str.equals("j") || str.equals("J")) {
            Java();
        } else if(str.equals("i") || str.equals("I")) {
            Ios();
        } else if(str.equals("b") || str.equals("B")) {
            Return();
        }
    }
        public static void Python () {
        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배운다.\n" +
                "강사: 김인공\n" +
                "추천 선수과목: 컴퓨터일반");
        Courses();
    }
        public static void Java () {
        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배운다.\n" +
                "강사: 이자바\n" +
                "추천 선수과목: Python");
            Courses();
    }
        public static void Ios () {
        System.out.println("Swift 언어를 통해 iOS 개발을 시작할 수 있다.\n" +
                "강사: 박애플\n" +
                "추천 선수과목: Python, Java");
            Courses();
    }
        public static void Return () {
        Menu1();
    }
        public static boolean Exit () {
            return false;

        }
}
*/