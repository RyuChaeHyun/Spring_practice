package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RespnseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseView1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseView2(Model model) {
        model.addAttribute("data", "hello!");
        return "response/hello"; //뷰의 논리적 이름
        //@ResponseBody 하면 response/hello라는 데이터가 그대로 입력된다.
    }

    //권장 x
    @RequestMapping("/response/hello")
    public void responseView3(Model model) {
        model.addAttribute("data", "hello!");
    }
}

