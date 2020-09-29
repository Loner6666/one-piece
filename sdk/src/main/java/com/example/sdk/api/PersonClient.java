package com.example.sdk.api;

import com.example.sdk.common.ResultObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description： person 的 api 层
 * @Author：GuoFeng
 * @CreateTime：2020-09-29
 */
@RequestMapping("/person")
public interface PersonClient {

    /**
     * 查询所有成员
     *
     * @return ResultObject
     */
    @GetMapping("/getAll")
    ResultObject getAll();

    /**
     * 根据id查询成员
     *
     * @param id 主键
     * @return ResultObject
     */
    @GetMapping("/{id}")
    ResultObject getPerson(@PathVariable int id);

}
