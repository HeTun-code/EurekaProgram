package com.milu.application.java.fign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name="testSever",path = "/test")
public interface ItestFeignService {

    @RequestMapping(value="/testService",method = RequestMethod.POST)
    String testC(TestDTO s);
}
