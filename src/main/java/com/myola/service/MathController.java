package com.myola.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by olath_000 on 2016-11-29.
 */
@RestController
public class MathController {

    private static final SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @RequestMapping("/add")
    public Result add(Integer v1, Integer v2) throws UnknownHostException {
        final Result result = new Result();
        result.setResult(v1 + v2);
        result.setHost(InetAddress.getLocalHost().getHostName());
        result.setTimestamp(sfd.format(new Date()));
        return result;
    }
}