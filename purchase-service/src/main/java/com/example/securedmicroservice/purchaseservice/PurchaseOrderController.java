package com.example.securedmicroservice.purchaseservice;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Copyright (c) Group Lease Public Company Limited. All rights reserved. (http://www.grouplease.co.th/)
 * Author: Peeranut Ngaorungsri (peeranut.ng@grouplease.co.th) on 06/01/2018.
 */
@RestController
public class PurchaseOrderController {

  @RequestMapping("/purchaseOrder")
  public HttpEntity<PurchaseOrder> getPurchaseOrder(){
    PurchaseOrder purchaseOrder = new PurchaseOrder(BigDecimal.TEN);
    purchaseOrder.add(linkTo(methodOn(PurchaseOrderController.class).getPurchaseOrder()).withSelfRel());
    return new ResponseEntity<>(purchaseOrder, HttpStatus.OK);
  }
}
