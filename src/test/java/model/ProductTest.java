package model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rebeca on 29.03.2017.
 */
public class ProductTest {
    private Product product;

    public ProductTest() {

    }

    @Before
    public void setUp() throws Exception {
        this.product = new Product(1,"Paine","alimente",56);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCode() throws Exception {
        Assert.assertEquals("eroare in getCode",1,this.product.getCode());
        this.product.setCode(0);
        Assert.assertEquals("eroare in getCode",0,this.product.getCode());
    }

    @Test
    public void setCode() throws Exception {
        product.setCode(2);
        assertEquals("eroare in setCode",2,product.getCode());
        product.setCode(3);
        assertEquals("eroare in setCode",3,product.getCode());
    }

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("eroare in getName","Paine",this.product.getName());
        this.product.setName("Rochie");
        Assert.assertEquals("eroare in getName","Rochie",this.product.getName());
    }

    @Test
    public void setName() throws Exception {
        product.setName("Pantaloni");
        assertEquals("eroare in setName","Pantaloni",product.getName());
    }

    @Test
    public void getCategory() throws Exception {
        Assert.assertEquals("eroare in getCategory","alimente",this.product.getCategory());
        this.product.setCategory("imbracaminte");
        Assert.assertEquals("eroare in getCategory","imbracaminte",this.product.getCategory());
    }

    @Test
    public void setCategory() throws Exception {
        product.setCategory("incaltaminte");
        assertEquals("eroare in setCategory","incaltaminte",product.getCategory());
    }

    @Test
    public void getQuantity() throws Exception {
        Assert.assertEquals("eroare in getQuantity",56,this.product.getQuantity());
        this.product.setQuantity(55);
        Assert.assertEquals("eroare in getQuantity",55,this.product.getQuantity());
    }

    @Test
    public void setQuantity() throws Exception {
        product.setQuantity(999);
        assertEquals("eroare in setQuantity",999,product.getQuantity());
    }

    @Test
    public void getSupplier() throws Exception {
        product.setSupplier("Velpitar");
        Assert.assertEquals("eroare in getSupplier","Velpitar",this.product.getSupplier());
    }

    @Test
    public void setSupplier() throws Exception {
        product.setSupplier("Samsung");
        Assert.assertEquals("eroare in setSupplier", "Samsung", this.product.getSupplier());
    }
}