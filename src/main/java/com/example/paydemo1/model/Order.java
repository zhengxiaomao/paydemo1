package com.example.paydemo1.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Order {


    private String orderId;
    private String createTime;
    private String totalMoney;

}
