package com.home.springcloud.controller;

import com.home.springcloud.bean.ProductInfo;
import com.home.springcloud.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/16 0:28
 * @description：
 */
@RestController
@Slf4j
public class ClientController {

   @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;


    @GetMapping("/get")
    public String getMsg(){
     /*   RestTemplate restTemplate = new RestTemplate();
        String res = restTemplate.getForObject("http://PRODUCT/s", String.class);
        log.info("【获取数据】,res={}",res);*/
        String res = productClient.get();
        log.info("【获取数据】,res={}",res);
        return res;
    }

    @GetMapping("/getProductInfo")
    public String getProductInfo(){
        List<ProductInfo> order = productClient.getProductInfosForOrder(Arrays.asList("1", "2"));
        log.info("order={}",order);
        return "ok";
    }


}