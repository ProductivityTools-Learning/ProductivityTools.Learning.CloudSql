package top.productivitytools.learning.cloudsql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debug")
public class DebugCongroller {
    
    @GetMapping("/hello")
    public String Hello() {
        return "Hello";
    }
}
