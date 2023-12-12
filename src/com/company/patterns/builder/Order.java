package com.company.patterns.builder;

import java.math.BigDecimal;

public class Order {
    private Long id;
    private String name;
    private Integer orderNumber;
    private String currency;
    private BigDecimal amount;

    private Order(OrderBuilder orderBuilder) {
        this.id = orderBuilder.id;
        this.name = orderBuilder.name;
        this.orderNumber = orderBuilder.orderNumber;
        this.currency = orderBuilder.currency;
        this.amount = orderBuilder.amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderNumber=" + orderNumber +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static class OrderBuilder {
        private Long id;
        private String name;
        private Integer orderNumber;
        private String currency;
        private BigDecimal amount;

        public OrderBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderBuilder name(String name) {
            this.name = name;
            return this;
        }

        public OrderBuilder orderNumber(Integer orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public OrderBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public OrderBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public static void main(String[] args) {
        Order order = Order.builder()
                .id(1L)
                .name("Example Order")
                .orderNumber(123)
                .currency("USD")
                .amount(new BigDecimal("100.50"))
                .build();

        System.out.println("Order: " + order);
    }
}
