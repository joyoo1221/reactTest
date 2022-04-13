package com.example.reacttest.controller;

import com.example.reacttest.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test") //리소스를 test로 지정해서 들어오기
public class TestController {
    @GetMapping
    public String testController() {
        return "hello world";
    }

    @GetMapping("/{id}")
    public String testControlllerWithPathVariables(@PathVariable(required = false) int id) {
        return "hello world! id : " + id;
    }

    @GetMapping("/testRequestParam")
    public String testControlllerWithPathParam(@RequestParam(required = false) int id) {
        return "hello world! id : " + id;
    }

    @GetMapping("/testRequestBody")
    public String testControlllerWithPathBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
        return "hello world! id : " + testRequestBodyDTO.getId() + "message : " + testRequestBodyDTO.getMessage();
    }
}
