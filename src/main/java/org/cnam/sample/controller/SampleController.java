package org.cnam.sample.controller;

import org.cnam.sample.dto.SampleCreateRequest;
import org.cnam.sample.dto.SampleCreateResponse;
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

    /* a effectuer dans Postman
    POST 127.0.0.1:8085/sample/create
    {
	    "data": "johnnyboy"
    }
     */


    @PostMapping("/create")
    @ResponseBody
    public SampleCreateResponse createNewSample(@RequestBody SampleCreateRequest sampleRequest) {
//       Sample sample = sampleService.createNewSample(newSampleDto.data);

        return new SampleCreateResponse(5, sampleRequest.data);
    }
}
