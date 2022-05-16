package Map;

public class Member {

    private int MemberId;
    private String name;

    public Member(int MemberId, String name) {
        this.MemberId = MemberId;
        this.name = name;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
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
}
