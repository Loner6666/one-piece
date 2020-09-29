package com.example.service.dao;


import com.example.sdk.bean.Person;

import java.util.List;

/**
 * person Dao层（数据库访问）
 */
public interface PersonDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    /**
     * 根据id查询成员
     *
     * @param id
     * @return Person
     */
    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    /**
     * 用注解可以直接执行简单的SQL语句，查询所有成员
     *
     * @return list
     */
//    @Select("select * from person")
    List<Person> getAll();

}