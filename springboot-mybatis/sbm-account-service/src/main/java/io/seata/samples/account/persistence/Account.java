package io.seata.samples.account.persistence;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Account {
    private Integer id;

    private String userId;

    private BigDecimal money;

}