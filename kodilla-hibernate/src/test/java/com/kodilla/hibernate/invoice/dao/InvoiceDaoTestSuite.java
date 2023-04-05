package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("P1");
        Product product2 = new Product("P2");
        Product product3 = new Product("P3");
        Item item1 = new Item(new BigDecimal(1),1,new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2),2,new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3),3,new BigDecimal(3));
        Invoice invoice = new Invoice("A1");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        //When
        invoiceDao.save(invoice);
        //Then
    }
}
