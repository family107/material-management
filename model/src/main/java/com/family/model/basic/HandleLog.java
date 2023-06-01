package com.family.model.basic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.family.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author family
 * @since 2023-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HandleLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userId;

    private Long ipAddress;

    private String message;

}
