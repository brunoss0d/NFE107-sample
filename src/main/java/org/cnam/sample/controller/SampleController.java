package org.cnam.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/get/{id}")
    @ResponseBody
    public String getSample(@PathVariable("id") long id) {
        String response = "Hello " + id;

        return response;
    }
}
