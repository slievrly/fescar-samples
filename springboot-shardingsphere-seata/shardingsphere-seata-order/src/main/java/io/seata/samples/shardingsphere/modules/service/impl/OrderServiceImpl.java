package io.seata.samples.shardingsphere.modules.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.seata.samples.shardingsphere.modules.entity.OrderEntity;
import io.seata.samples.shardingsphere.modules.mapper.OrderMapper;
import io.seata.samples.shardingsphere.modules.service.IOrderService;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements IOrderService {

    @Override
    public void insertOrder(OrderEntity orderEntity) {
        baseMapper.insert(orderEntity);
    }
}
