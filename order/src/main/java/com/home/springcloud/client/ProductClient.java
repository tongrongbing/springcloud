package com.home.springcloud.client;

import com.home.springcloud.bean.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author：tongrongbing
 * @date：created in 2020/5/16 18:40
 * @description：name=对于的是调用是哪个服务的spring.application.name的值
 */
@FeignClient(name = "product")
public interface ProductClient {

    @PostMapping("/product/productInfosForOrder")
    public List<ProductInfo> getProductInfosForOrder(@RequestBody List<String> productIds);

    @GetMapping("/msg")
    public String get();
}
