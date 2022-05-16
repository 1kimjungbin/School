package Map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashmap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashmap() {
        hashMap =  new HashMap<Integer, Member>();
    }

    public void addMember(Member Member) {
        hashMap.put(Member.getMemberId(), Member);
    }

    public boolean removeMember(int MemberId) {
        if(hashMap.containsKey(MemberId)) {
            hashMap.remove(MemberId);
            return true;
        }
        System.out.println(MemberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
