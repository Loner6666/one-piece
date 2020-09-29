package com.example.sdk.api;

import com.example.sdk.common.ResultObject;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description： person 的 api 层
 * @Author：GuoFeng
 * @CreateTime：2020-09-29
 */
public interface PersonClient {

    /**
     * 查询所有成员
     *
     * @return ResultObject
     */
    @GetMapping("/getAll")
    ResultObject getAll();

}
