package com.family.model.base;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Date 2023-05-30 20:34
 * @AUTHOR family
 **/
@Data
public class BaseEntity implements Serializable {

    private String id;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    //0可用，1不可用
    @TableLogic
    @TableField("is_deleted")
    private int isDeleted;
}
