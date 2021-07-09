package hello.springmvc.basic;

import lombok.Data;

//getter, setter, toString.. 자동으로 적용해줌
@Data
public class HelloData {

    private String username;
    private int age;
}
