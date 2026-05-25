package com.example.baitap03_ss09.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    public void updateStock(String productId, int qty) {

        log.info(
                "Bắt đầu cập nhật kho cho sản phẩm. productId={}, qty={}",
                productId,
                qty
        );

        try {

            // Logic cập nhật kho
            // Ví dụ:
            // inventoryRepository.update(productId, qty);

            log.info(
                    "Cập nhật kho thành công. productId={}, qty={}",
                    productId,
                    qty
            );

        } catch (Exception e) {

            log.error(
                    "Lỗi khi cập nhật kho. productId={}, qty={}",
                    productId,
                    qty,
                    e
            );
        }
    }
}