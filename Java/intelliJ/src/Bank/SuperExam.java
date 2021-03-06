package Bank;

public class SuperExam {
    /*
    자식 클래스에서 super 키워드를 사용하는 경우
    1. 자식 클래스가 부모 클래스의 변수, 메소드를 사용할 때
    2. 자식 클래스가 부모 클래스의 생성자를 사용할 떄
     */

    /*
    2번
    자식 클래스의 인스턴스가 생성되기 위해서는 부모 클래스와 자식 클래스으ㅏ
    초기설정을 모두 해줘야 함.
    부모 클래스의 생성자는 super 키워드를 사용하여 부를 수 있음.

    1. 자식 클래스의 인스턴스 생성 시 부모 클래스의 생성자는 반드시 불림.
    2. 부모 클래스에 기본 생성자가 없는 경우, 즉, 파라미터가 없는 생성자가 없는 경우
        자식 클래스에서 반드시 직접 부모 클래스의 생성자 호출을 시켜줘야 함.
    3. 부모 클래스이 생성자를 호출할 때는 자식클래스의 생성자 맨 윗 줄에 적어야 한다.
     */
}
