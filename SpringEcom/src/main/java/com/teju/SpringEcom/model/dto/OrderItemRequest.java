package com.teju.SpringEcom.model.dto;


public record OrderItemRequest(
        int productId,
        int quantity
) {}
