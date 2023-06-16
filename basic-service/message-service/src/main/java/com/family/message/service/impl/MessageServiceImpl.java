package com.family.message.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.family.message.mapper.MessageMapper;
import com.family.message.service.MessageService;
import com.family.model.basic.Message;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author family
 * @since 2023-06-05
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
