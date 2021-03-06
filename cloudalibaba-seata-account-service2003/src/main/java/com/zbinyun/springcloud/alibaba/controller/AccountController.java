package com.zbinyun.springcloud.alibaba.controller;

import com.zbinyun.springcloud.alibaba.service.AccountService;
import com.zbinyun.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping(value="/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Integer userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"账户更新成功");
    }
}
