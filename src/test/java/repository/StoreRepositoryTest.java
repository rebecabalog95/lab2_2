package repository;

import model.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rebeca on 29.03.2017.
 */
public class StoreRepositoryTest {
    private StoreRepository repository;
    private Product product1;
    private Product product2;
    private Product product3;

    @Before
    public void setUp() throws Exception {
        repository = new StoreRepository();
        product1 = new Product(1,"Lapte","aliment",20);
        product2 = new Product(2,"Rochie","imbracaminte",90);
        product3 = new Product(3,"Pantofi","incaltaminte",89);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllProducts() throws Exception {
        Assert.assertEquals("eroare in getAllProducts",0,this.repository.getAllProducts().size());
        repository.addNewProduct(product1);
        Assert.assertEquals("eroare in getAllProducts",1,this.repository.getAllProducts().size());

    }

    @Test
    public void addNewProduct() throws Exception {
        //modificare
        assertEquals("eroare in addNewProduct",0,repository.getAllProducts().size());
        //assertEquals("eroare in addNewProduct",1,repository.getAllProducts().size());
        repository.addNewProduct(product1);
        assertEquals("eroare in addNewProduct",product1,repository.getAllProducts().get(0));
        repository.addNewProduct(product2);
        repository.addNewProduct(product3);
    }

    @Test
    public void getProductsCategory() throws Exception {
        repository.addNewProduct(product1);
        Assert.assertEquals("eroare in getProductsCategory",product1,repository.getProductsCategory("aliment").get(0));
    }

    @Test
    public void stockSituationProduct() throws Exception {
        repository.addNewProduct(product1);
        Assert.assertEquals("eroare in stockSituationProduct",product1,repository.stockSituationProduct("Lapte").get(0));
    }

    @Test
    public void stockSituation() throws Exception {
        Assert.assertEquals("eroare in stockSituation",0,this.repository.stockSituation().size());
        repository.addNewProduct(product1);
        Assert.assertEquals("eroare in stockSituation",1,this.repository.stockSituation().size());
    }
}