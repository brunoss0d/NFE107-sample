package org.cnam.sample.controller;

import org.cnam.sample.dto.SampleRequest;
import org.cnam.sample.dto.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/create")
    @ResponseBody
    public SampleResponse createNewSample(@RequestBody SampleRequest sampleRequest) {
//        Sample sample = sampleService.createNewSample(newSampleDto.data);

        return new SampleResponse(5, sampleRequest.data);
    }
}
