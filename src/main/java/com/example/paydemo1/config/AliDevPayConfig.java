package com.example.paydemo1.config;

import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class AliDevPayConfig implements Serializable {

    // 这个是支付完成后的跳转路径 可以是一个页面地址等
    public static String returnUrl = "http://www.baidu.com";
    //服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
// 这个是支付成功失败以后的通知接口会返回相应的参数
    public static String notifyUrl = "http://47.97.74.33:8080/cms/alipay/notify";

    /**支付宝分配给开发者的应用ID*/
    public static String aliPayAppId = "2021000117678755";
    /**
     * 商户id
     */
    public static String uid = "2088102180918899";
    /**支付宝网关*/
    public static String aliPayGateWay = "https://openapi.alipaydev.com/gateway.do";
    public static  String mcloud_api_domain = "http://mcloudmonitor.com/gateway.do";
    /**私钥*/
//    public static String aliPayPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCtPPBOHRZyOPH2Qn4IAWmY+qrJaYSs5PZwRtAxm7oPcgChnacGr8uTZKtZtNFMwoI1RXqutWAWjMhVNHv9JcAdZbL7LsXO8AuP09YcFpGGXEWFoze3RGeN4Oiy1JhC21nkZONXn2RlmR44dHNLvH3p213MjR6omV16qG0SqFyCQ6m3DPVvXn+aclw+0vZPa6wvjKFn57WdgFrrwHSKMvuPoz5qW4Yv7wu4isXyOowczyfX0DERVvcdYdaIPUOEBEN6EcKbVq8/FC1zMq79REBU/iVtVjWunRe6FMq+jbzNsVvZdwm2FEG2hcnw+GmvZUMIstUf3dm3yZiMqULPCGf/AgMBAAECggEAdingx4czrkmFUTHdgVxlSMGCCMv+gWfTaJYEoDHWYX6jS5mbOgZi13CNKC0brj3mTqvLmKuClR8F7ohUIkHDnsmloYsvxY0adcpKevIx5PG/Qf4onMr9z1qfnotAKCoyUIU4RKYl9t7QLDXSBtDVGdRVUJbZWKrzhhyn+Vf5cafOyyQEgMAonAYqkLweZilyFO5TGlgLKJsKXhQjltZrPxVebQ9PowIz47NvQVOBya+WGTAkyN1Bri10ZLxr62VGhUjUGKcRL0qVxtaXpafARcW5HU1U/aJlkX9stHZwRlLsxdN5MV1DwlKInX9shYHOHheCsohlB7ZaZYmwrVulEQKBgQD1cmknrwkiYgocPq7NhQ89IddmWgduqkTE9FbaDXtM7YrvTIPGJDCE5d71R+sw8GG36M0OQxitdB72mbv6md+FxqmAtlD6d0L5V0mJfRErW4W48NhCI03XIWUcy3JrtqVF1N7qlB7D5IkW3DBqFVHf2iO97oMczhhsQsVnrH0VmwKBgQC0r7zyS6DwV1Pb8q3n1dmWD/wg4PuV35PC/uZ5CXiYWOcbaZZM1+3QQ56F/qZugwsb7aXbl7lL67hZ70GcQJPC8YBHebrBK9q/8C29TkPigzY0jWgM4rFbcb/raRKP3Oy1T4itIUH1/nuWwZT2AoT8lLRbLmeUeDCvg3GsbrhvbQKBgQCxhkvKOQ5pQPHBFhFGcsvf0l9CFzGy+BH/Rh6fXgrlTBYmGHhi0oAJT12gmKDiZ6q14vqVKzBpHEjc4bqVeb+yuUqV3sfZMHNPdrOobr4BVxPz/Lbdtz0wsWW5muiqQZNuW5XToshRtTT2RNH7mGn8d4FMeXt5VRNTEkRHRPm/qwKBgEXtGS+gCznYYhDmG110io+jwgyrZVI8Q4Aci+9dtfknttEKDOvSSSvnb2smAR0Vw+/cCesxDboPELpleLvS1hyEwANpXdgyc6cCeYEgz+7SnuC5tQH/nWnpXL/rWw6oDkeg7yEplNBx2zyd0Ftg4DysBByhmd6AoT7bnNuBwgkFAoGAVYXQYh+YgM5mKaagBZOWqwhkP4Pr8Oo44G5RaswP/O7R4ulgQ48BsaPifngek+tDTetX3nlZjogb1YtIEEJNJ1SSPsvEZGzR0cwgysp+wRjER5O+M2rvNWc3G+a4wM864eYuCq1n73xL9FqXYIJXjRlmLobejYiOqYa02bRIpQc=";
//    public static String aliPayPrivateKey="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC+dw1BJwdI83S1de36e/e06tPU/0DWb+/wey8ajuVPbX0lQzI8604jucR+6tQ2E0LbmWgs1ba0PVMh5ZCh9VO1+LW4tTWGrfU5u0u7mdm6fztinyeYbGmINFx9JsZIdGVOXbv6GTwqNcQl7WBFrI+fyo50mQnlSSC1oym6A1x8tfeni6kJpZySjlCFYcV1f1JQPBHMsbmTMIWT1WjnTL5MPEj++4cf3bLxJ6YI1Z8WBeSmvfOJdSJ0gO4esEh5qIio2xieTHVJJNasSXgG/fHwged4NCY/fVZTM7N9UaqrPYqrHV8SHlgCut8xrPqWEjOlQhTAeAF2Wkh1DjZ/59u/AgMBAAECggEBAISzc8OqCpRUM0Nep/D2QE6HshFbynPdR6IYYWgymSfu09uLZsw08ZtIidQXjsUiRFm2F3Ptbr9DXtFmHZAJ2koVv56yelmciBeyHADYH2+lx91dn/u9xQVF3g7AXjQLDK499oM448dQ8JmwOnwwz1x4hypLmi5q9eQ3ixHz15N3DK/WAR93MAi8n5bkxW4V+vbz1NJ04L8L2F/1MqXG608S5JcXqYP2lob4ABs0UnYhWlKNcveM0fKKdznmjdQMzdU3Cidl4AKZRKZJ3fI8UJm5KS4n7Pqy4tORBK2eE6n86xWoK2dXUlwxic3wT+kUDGdV3EbBHjCqK8YskNhIc9kCgYEA6SMnUobutNKLTDrHyv6+NHjCfQbxp8VBCv4UqaEVqLFWZrSWghGxSDj84vL3qlHsHViKRquDZhSmTohTIT21izTBOPrzNh2s5SowIhZFz4cfvr6OlOlKmzx0u1luzGvl+km0AJT54ON1HX4D3023tiIfV/NKLm1RBEf/pP+/ZPsCgYEA0SSfcqccQHZx2yuROYnH2BjGf5sueOi27dEzj1xohEih1W3mPco9EMa3+TLT9idmKkAJEXtaxBCHycNllNarT6gL3FyFZstMTmwURvyy8CYbOcoputUxSue4H1IYvWGtxngZjdsH8OHKsuXa8DSXNkMit54atNWIVJK8MQHkQQ0CgYEA1L8kmhXR7SaYwTZ+rcqrjbyJVoioqz3A7iQQfP8ngapauxyeoBE/IzYF56Bqy304p0rt3DGVlejQHqgenB3w9hhtHu86VC7eYL2P8Ps8N3YKTQkdmdwOHf0cVP72sgrgcfciEMniAQvwCrq9E+Ca/dTDn4G/NwDAxtRhAJP1d1MCgYAlD0VFzsDd118zhBPWy0hjTXiXEgt5F1ua5pApXimTDz/GDxRWbKjHeT8OZGhU3QRohjJVK7OYvIkjQoGUjzmKAvAfGzH0Vh/uYY5yScL3dPksE1uzpKV4bXkd67FAlbdyTMPSdDaDA6+kZcCXAeqtjdXwDY8T7iabPeklEf29XQKBgDeuigxNNFxZdJ3ziovPYyCMYx87WcPgsbe5+RebvkveAoIPwcCGjRJAzaqExhrd3fOM/Nd3hEVZ2Anc/IT0pmOZmFNMVPivGgwaX6CnB9EYOryxRtEAoOLHciB5xJFG0ag2K/6P5EhVg0kN9EVCy3TkCgxgrEnfzjJEaRKrWpXc";
    public static String aliPayPrivateKey="MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDdXszblLrG+y4A7itpdoRMlDOgztPzV7elA3+1iexRs2C9lsToXkAYNpdwsv5N6wj9o7SxyoeVETm4I/Z04gyeRb+kZ+db6arqVWPen4XgZ74dccCcjNkrS7VsJEdk3KnSfGxloXkNgyJcgHB+Ph+F7R6OarB1I9EoUGlsUeRavfS6NOGgRKs1Keik5rLuDr/XlTHjRCO+4diFH8NHo7bNiMlFNj1IpAitudJoqZdjYq+HQ4GUJnjY3ej4wlCTIEtl/v00+hEBsI8cvtzkk7JNppUFAbP1Ie7prr9W6pfW5Adz8f8CD+qePmHF+FUgQjpV+P4KZ4/pO8wwUlygTVknAgMBAAECggEBAMMQZynSW+c8rGPrett6sMeeDARWXFPgZpWEiMNaHqA7lTJaqXYsnwP3DukjAI1+XzTJTU8hLOnA/QByyBhknEPXKDDh0e+e7pmA1vjzzo9YOyFM/DG2tyK8msgJC9Qn0YkFVKsVZ0rt05h5ISdM7JAhyrwp7QW7ovGIMe1eF/+QIKFdI6bgiiT6HxGoyo1fknhPILZ6PwjyiSPPm+lxeIQetuRWeh0lDtUSfstMuo8sBZSt9UaSRB5ZJ9aIUyCXBVnq7pecDOkn2BiDT5iRQs3e5MZdXkhddirqh5Yt44iplERCkkZBbOG0oNY4xfopOe1ZgPOvTntzcxq+LM/ryRkCgYEA/lbgwzZcLKUAmU1685IukTtTrD35eKmy/yezHaq/c8aGzIU84J5WrrY5jCNA0tQkHq8TOIS4qCvaOFnhjJrRrl8N2Z8bJf07uB9GkOebdFTnB78JkWNUk5Igx9PMwxpNeX87XtcecYzm2yVMhXF5IVkZ7NApBBB7S8uRc9PsKL0CgYEA3tDQtkUK7f4aOo5lFXN1ZrXRenw0/2SGvcgLBUxmf5n0m8hgmqBrl+LUIjtgBs+SvF+K8cSmrshy6rvgt99rcPjzQXYXo94Bfz8iQJQGJq9F4swvlrXVpORtUxlJNFukkCM8+luA3+vNGpDLP8HwhQn+2JGc22yUKRJqCKqmobMCgYEAwhjPAmsTwMZTRKsKb6NZgmACJOpO3jSzc2F6oeNSpCoXaTEtGkX75O0P0dB9ged/gSMeyf0PZtfAe0ysgj8MUcQcr71qXH16+7JyidcWnZrFjPXPeXKScuQLvDP4idQi19uvFVuZ0hIzg35dfWDxje+Ph1f8VSu2zEsYP4q1KQkCgYEAsIl35AI+D6R1eZGaq21IRnGmIErK3tLyIumdObx3tX/wm4EecUTLGpNAikLK6XqLAy8b8kRh4De3PR5QhL7C7MaCTYpYXqAmRYBrDgl5+iqCz5gB2IIHXNcTe3ScWJyHfSA+TwoyyLeWUQcJ0mFBxNbPkR2FzyBvHz+UvXsf/RsCgYEA6URX6ho7XVbDwklYGSsnEDnfNwXDuks0WzUxt6k39dpaSp6MkP44HDnOb3DmZt/crSCShjCqlFUGuKbxOZ2XXGb7BAHH4vAJuEZh9LxtELX0ZaLT2bfVimj+JCvpRp0eXVnWs6pPoDF7fzpm9mePXJ5L6tJWAtZNZAowM3NbldU=";
    /**支付宝公钥 注意是支付宝公钥 不是应用公钥*/
//    public static String aliPayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAix4U83rjS6rT8w8njXFEU+SAYH/zCCRQc98PpUDEBBx3qY7CaJPL0QPETs1WyufqZYRSKbW0Ml9wTA/SXgOp3bJn5v78vhe2LSFtmr0gCyNJXtSDrz91XgR/oK3T5j0yy8NgOMBjdjnI2a6cpqrt3YXkc02hhJTfG+3o6f+gGw6wtU7CC0BTGoH//lk+prNerjeFQLZd7hB0ANlC5JdSfDBHtr/+gPcL7ap84nEJA1TSOCnQP8h2UYd5MAwqwyqitK3B9hEUCWI7Mp3VgI+CAGVXXnUzL74hUK26yrTczucX9bEPUUAyrlxWIUZ3OsX07KwpL1PLnKH/HYJStFG8TQIDAQAB";
//    public static String aliPayPublicKey ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    public static String aliPayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3V7M25S6xvsuAO4raXaETJQzoM7T81e3pQN/tYnsUbNgvZbE6F5AGDaXcLL+TesI/aO0scqHlRE5uCP2dOIMnkW/pGfnW+mq6lVj3p+F4Ge+HXHAnIzZK0u1bCRHZNyp0nxsZaF5DYMiXIBwfj4fhe0ejmqwdSPRKFBpbFHkWr30ujThoESrNSnopOay7g6/15Ux40QjvuHYhR/DR6O2zYjJRTY9SKQIrbnSaKmXY2Kvh0OBlCZ42N3o+MJQkyBLZf79NPoRAbCPHL7c5JOyTaaVBQGz9SHu6a6/VuqX1uQHc/H/Ag/qnj5hxfhVIEI6Vfj+CmeP6TvMMFJcoE1ZJwIDAQAB";
    public static String FORMAT = "JSON";

    /**请求使用的编码格式，如utf-8,gbk,gb2312等*/
    public static String CHARSET = "utf-8";

    /**商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2*/
    public static String SIGN_TYPE = "RSA2";

}