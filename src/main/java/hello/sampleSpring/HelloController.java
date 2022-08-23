package hello.sampleSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // @ResponseBody 사용하면 view Resolver 사용x, HTTP BODY에 문자 내용 직접 반환(HTML BODY TAG 아님)
    }

    @GetMapping("hello-api")
    @ResponseBody // @ResponseBody를 사용하고, 객체를 반환하면 객체가 JSON으로 변환됨
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // HTTP BODY에 문자 내용 직접 반환, viewResolver 대신 HttpMessageConverter 동작
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
