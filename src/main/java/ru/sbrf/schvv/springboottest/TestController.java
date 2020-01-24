package ru.sbrf.schvv.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/now")
    public Today getTodayDate(@RequestParam(value = "format", defaultValue = "HH:mm:ss dd.MM.y") String format) {
        return new Today(format);
    }

    @GetMapping("/test")
    public Date getTestValue() {
        return new Today("dd.MM.y").getDateNow();
    }
//
//    @GetMapping("/date")
//    public Today getDate(@RequestParam(value = "format", defaultValue = "dd.MM.y") String format) {
//        return new Today(format, "HH:mm:ss");
//    }
}
