package com.example.securedmicroservice.purchaseservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Copyright (c) Group Lease Public Company Limited. All rights reserved. (http://www.grouplease.co.th/)
 * Author: Peeranut Ngaorungsri (peeranut.ng@grouplease.co.th) on 06/01/2018.
 */
public class PurchaseOrder extends ResourceSupport {
  private final BigDecimal amount;

  @JsonCreator
  public PurchaseOrder(@JsonProperty("amount") BigDecimal amount){
    this.amount = amount;
  }

  public BigDecimal getAmount() {
    return amount;
  }
}
