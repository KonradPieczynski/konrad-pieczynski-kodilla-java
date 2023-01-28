package com.kodilla.stream.invoice.simple;

import java.util.Objects;

public final class SimpleItem {

    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(SimpleProduct product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
    public double getValue() {
        return product.getProductPrice() * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleItem that = (SimpleItem) o;

        if (Double.compare(that.quantity, quantity) != 0) return false;
        return Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = product != null ? product.hashCode() : 0;
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SimpleItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}