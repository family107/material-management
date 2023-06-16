package com.family.model.basic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author family
 * @since 2023-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 审核者id
     */
    private String checkId;

    /**
     * 回复者id
     */
    private String returnId;

    /**
     * 回复状态
     */
    private Boolean returnStatus;

    /**
     * 审核状态
     */
    private Boolean checkStatus;

    /**
     * 留言信息
     */
    private String message;

    /**
     * 回复信息
     */
    private String returnMessage;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Boolean isDeleted;


}
