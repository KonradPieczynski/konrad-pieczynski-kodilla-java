package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("P1");
        Product product2 = new Product("P2");
        Product product3 = new Product("P3");
        Product product4 = new Product("P4");
        Item item1 = new Item(new BigDecimal(1),1,new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2),2,new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3),3,new BigDecimal(3));
        Item item4 = new Item(new BigDecimal(4),4,new BigDecimal(4));
        Invoice invoice1 = new Invoice("A1");
        Invoice invoice2 = new Invoice("B1");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        //When
//        productDao.saveAll(Arrays.asList(product1,product2,product3,product4));
        invoiceDao.saveAll(Arrays.asList(invoice1,invoice2));
        int id1 = invoice1.getId();
        int id2 = invoice2.getId();
        //Then
        assertNotEquals(0, id1);
        assertNotEquals(0, id2);
        //CleanUp
//        itemDao.deleteAll();
//        productDao.deleteAll();
//        invoiceDao.deleteAll();
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);

    }
    @Test
    void findProducts(){
        Product product1 = productDao.findByNameContains("P1");
        Product product5 = productDao.findByNameContains("P5");
        if (product1 != null) System.out.println("P1 id:" + product1.getId());
        if (product5 != null) System.out.println("P5 id:" + product5.getId());
    }
}
