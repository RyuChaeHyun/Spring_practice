package hello.springmvc.basic;

import lombok.Data;

@Data
//getter, setter, toString.. 자동으로 적용해줌
public class HelloData {

    private String username;
    private int age;
}
