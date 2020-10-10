package com.example.sdk.vo;

import com.example.sdk.bean.Person;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description： 分页查询实体
 * @Author：GuoFeng
 * @CreateTime：2020-10-10
 */
@Data
public class PersonVo extends Person implements Serializable {

    private static final long serialVersionUID = 8949177681919189441L;
    /**
     * 分页起始条
     */
    private Integer pageNum;
    /**
     * 每页显示条数
     */
    private Integer pageSize;
    /**
     * 总条数
     */
    private Integer pageTotal;

}
