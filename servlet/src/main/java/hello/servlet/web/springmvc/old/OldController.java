package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//"/springmvc/old-controller"라는 이름의 스프링 빈으로 등록
//빈의 이름으로 URL 매핑
@Component("/springmvc/old-controller")
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        //InternalResourceViewResolver
        return new ModelAndView("new-form");
    }

    //HandlerMapping = BeanNameUrlHandlerMapping
    //HandlerAdapter = SimpleControllerHandlerAdapter
}
