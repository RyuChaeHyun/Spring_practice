package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceImplTest {

    @Test
    void createOrder(){
        //생성자 주입 선택 테스트
        //수정자 주입일 경우 nullpointException이 발생
        // memberRepository, discountPolicy 모두 의존관계 주입이 누락되었기 떄문

        //생성자 주입은 주입 데이터를 누락 했을 때 컴파일 오류가 바로 발생
        // -> 바로 어떤 값을 필수로 주입해야 하는지 알 수 있음

        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}

