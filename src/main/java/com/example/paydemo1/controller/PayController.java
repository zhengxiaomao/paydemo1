package com.example.paydemo1.controller;

import com.example.paydemo1.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

@RequestMapping("/cms/alipay")
@RestController
public class PayController  {

    @Autowired
    private PayService payService;


    @RequestMapping(value = "/pay")
    public String aliPay(@RequestParam("id")String id,
                         @RequestParam("type")String type,@RequestParam("money")String money) throws IOException {
        return payService.aliPay(id,type,money);
    }


    @RequestMapping ("/notify")
    public void payNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
        payService.alipayNotify(request,response);

    }




}
