package com.alibaba.csp.sentinel.dashboard.mysql.mapper;

import com.alibaba.csp.sentinel.dashboard.mysql.entity.SentinelMetricEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface SentinelMetricMapper extends BaseMapper<SentinelMetricEntity> {}
