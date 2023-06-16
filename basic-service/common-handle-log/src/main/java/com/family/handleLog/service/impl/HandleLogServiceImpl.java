package com.family.handleLog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.family.handleLog.mapper.HandleLogMapper;
import com.family.handleLog.service.HandleLogService;
import com.family.model.basic.HandleLog;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author family
 * @since 2023-06-01
 */
@Service
public class HandleLogServiceImpl extends ServiceImpl<HandleLogMapper, HandleLog> implements HandleLogService {
}
