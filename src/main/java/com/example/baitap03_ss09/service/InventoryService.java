package com.example.baitap03_ss09.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    public void updateStock(String productId, int qty) {

        log.info(
                "Bắt đầu cập nhật kho cho SP: {}, SL: {}",
                productId,
                qty
        );
    }
}