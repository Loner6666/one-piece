package com.example.service.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.sdk.bean.Person;
import com.example.sdk.common.ResultObject;
import com.example.service.dao.PersonDao;
import com.example.service.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description： person Service层（业务处理）
 * @Author：GuoFeng
 * @CreateTime：2020-09-29
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public ResultObject getAll() {
        try {
            log.info("查询所有成员，开始————>");
            List<Person> personList = this.personDao.getAll();
            log.info("查询所有成员，结束————>{}", JSON.toJSONString(personList));
            return ResultObject.successData(personList);
        } catch (Exception e) {
            log.error("查询所有成员，异常：{},{}", e.getMessage(), e);
            return ResultObject.error("查询失败！");
        }
    }

    @Override
    public ResultObject getPerson(int id) {
        try {
            log.info("根据id查询成员，开始————>{}", JSON.toJSONString(id));
            Person person = this.personDao.selectByPrimaryKey(id);
            log.info("根据id查询成员，结束————>{}", JSON.toJSONString(person));
            return ResultObject.successData(person);
        } catch (Exception e) {
            log.error("根据id查询成员，异常：{},{}", e.getMessage(), e);
            return ResultObject.error("查询失败！");
        }
    }

}
