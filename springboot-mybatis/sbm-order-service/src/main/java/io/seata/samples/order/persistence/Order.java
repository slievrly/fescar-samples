package io.seata.samples.order.persistence;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Order {
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private BigDecimal money;

}