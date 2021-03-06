package Map;

public class Member {

    private int MemberId;
    private String name;

    public Member(int MemberId, String name) {
        this.MemberId = MemberId;
        this.name = name;
    }


    public int getMemberId() {
        return MemberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override

    public String toString() {
        return name + " 회원님의 아이디는 " + MemberId + " 입니다.";
    }
}
