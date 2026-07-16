package top.productivitytools.learning.cloudsql.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
    import top.productivitytools.learning.cloudsql.services.CounterService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/counter")
public class CounterController {

    private final CounterService counterService;

    @GetMapping("/get")
    public String Hello() {
        Integer r = counterService.incrementCounter(1);
        return r.toString();
    }
}
