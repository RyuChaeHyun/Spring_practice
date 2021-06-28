package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    //싱글톤이어서 static 없어도 된다
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository(){
        //싱글톤이어서 막아둠
   }

   public Member save(Member member){
       member.setId(++sequence);
       store.put(member.getId(), member);
       return member;
   }

   public Member findById(Long id){
       return store.get(id);
   }

    //Arraylist에 값을 넣거나 조작해도 store에 있는 값
    // 변경되게 하지 않기 위해 new Arraylist 를 만든다.
   public List<Member> findAll(){
        return new ArrayList<>(store.values());
   }

   public void clearStore(){
       store.clear();
   }
}
