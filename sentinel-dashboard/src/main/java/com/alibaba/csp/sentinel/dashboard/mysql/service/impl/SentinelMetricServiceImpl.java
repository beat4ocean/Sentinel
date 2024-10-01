package com.alibaba.csp.sentinel.dashboard.mysql.service.impl;

import com.alibaba.csp.sentinel.dashboard.mysql.entity.SentinelMetricEntity;
import com.alibaba.csp.sentinel.dashboard.mysql.mapper.SentinelMetricMapper;
import com.alibaba.csp.sentinel.dashboard.mysql.service.ISentinelMetricService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SentinelMetricServiceImpl extends ServiceImpl<SentinelMetricMapper, SentinelMetricEntity> implements ISentinelMetricService {}
