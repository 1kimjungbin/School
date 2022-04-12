package Example;

public class FinalExam {

    // final variable.
    // 한번 정한 값 변경 불가
    // 선언과 동시에 초기화 또는 생성자에서 값을 넣어주어야 함.

    // case1 오류 발생 -> 초기화 필요
    public final int finalVar1;

    // case2 오류 발생 X (초기화 진행)
    public final int finalVar2 = 10;

    // case3 생성자에서 초기화
    public final int finalVar3;

    public FinalExam() {
        this.finalVar3 = 10;
    }
    
    // case4 생성자가 아닌 곳 (일반 메소드) 에서 초기화 - > 오류 발생
    public final int finalVar4;
    
    private void setVar4() {
        finalVar4 = 10;
    }

    //static variable

}
