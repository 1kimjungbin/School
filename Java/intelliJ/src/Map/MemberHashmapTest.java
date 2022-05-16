package Map;

import java.util.HashMap;

public class MemberHashmapTest {
    public static void main(String[] args) {
        MemberHashmap memberHashmap = new MemberHashmap();

        Member memberLee =  new Member(1001, "이지원");
        Member memberSon =  new Member(1002, "손민국");
        Member memberPark =  new Member(1003, "박서원");
        Member memberHong =  new Member(1004, "홍길동");

        memberHashmap.addMember(memberLee);
        memberHashmap.addMember(memberSon);
        memberHashmap.addMember(memberPark);
        memberHashmap.addMember(memberHong);

        memberHashmap.showAllMember();
    }
}
