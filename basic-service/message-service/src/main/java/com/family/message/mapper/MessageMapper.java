package com.family.message.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.family.model.basic.Message;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author family
 * @since 2023-06-05
 */
@Mapper
public interface MessageMapper extends BaseMapper<Message> {

}
