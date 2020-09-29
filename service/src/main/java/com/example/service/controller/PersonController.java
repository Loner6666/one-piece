package com.example.service.controller;

import com.example.sdk.api.PersonClient;
import com.example.sdk.common.ResultObject;
import com.example.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： person 的 控制层
 * @Author：GuoFeng
 * @CreateTime：2020-09-29
 */
@RestController
public class PersonController implements PersonClient {

    @Autowired
    private PersonService personService;

    @Override
    public ResultObject getAll() {
        return this.personService.getAll();
    }

    @Override
    public ResultObject getPerson(int id) {
        return this.personService.getPerson(id);
    }

}
