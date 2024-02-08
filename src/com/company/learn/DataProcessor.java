package com.company.learn;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataProcessor {

    public static void main(String[] args) {

        List<Item> items = List.of(
                new Item(1, "111130", "1", 62656.29, "NEW"),
                new Item(2, "111131", "2", 12345.67, "NEW")
        );

        List<Payment> payments = List.of(
                new Payment("209180220564", 1, "209180220051", 3519.59),
                new Payment("209180230510", 1, "209180230001", 8569.66),
                new Payment("209181111111", 1, "209180111111", 1000),
                new Payment("209180240567", 2, "209180240002", 9876.54),
                new Payment("209182222222", 2, "209180222222", 1000)
        );

        Map<Integer, List<Payment>> paymentsByItemId = payments.stream()
                .collect(Collectors.groupingBy(Payment::getItemId));

        items.forEach(item -> item.setPayments(paymentsByItemId.getOrDefault(item.getId(), payments)));

        items.forEach(System.out::println);
    }

    static class Item {
        private final int id;
        private final String classCode;
        private final String levelCode;
        private final double amount;
        private final String status;
        private List<Payment> payments;

        public Item(int id, String classCode, String levelCode, double amount, String status) {
            this.id = id;
            this.classCode = classCode;
            this.levelCode = levelCode;
            this.amount = amount;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setPayments(List<Payment> payments) {
            this.payments = payments;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", classCode='" + classCode + '\'' +
                    ", levelCode='" + levelCode + '\'' +
                    ", amount=" + amount +
                    ", status='" + status + '\'' +
                    ", payments=" + payments +
                    '}';
        }
    }

    static class Payment {
        private final String paymentRefId;
        private final int itemId;
        private final String offbalPaymentRefId;
        private final double paymentRefAmt;

        public Payment(String paymentRefId, int itemId, String offbalPaymentRefId, double paymentRefAmt) {
            this.paymentRefId = paymentRefId;
            this.itemId = itemId;
            this.offbalPaymentRefId = offbalPaymentRefId;
            this.paymentRefAmt = paymentRefAmt;
        }

        public int getItemId() {
            return itemId;
        }

        @Override
        public String toString() {
            return "TaxBPayment{" +
                    "paymentRefId='" + paymentRefId + '\'' +
                    ", itemId=" + itemId +
                    ", offbalPaymentRefId='" + offbalPaymentRefId + '\'' +
                    ", paymentRefAmt=" + paymentRefAmt +
                    '}';
        }
    }
}
