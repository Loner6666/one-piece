package com.example.service.service;

import com.example.sdk.common.ResultObject;

/**
 * @Description： person 的 服务层
 * @Author：GuoFeng
 * @CreateTime：2020-09-29
 */
public interface PersonService {

    /**
     * 查询所有成员
     *
     * @return ResultObject
     */
    ResultObject getAll();

    /**
     * 根据id查询成员
     *
     * @param id 主键
     * @return ResultObject
     */
    ResultObject getPerson(int id);

}
