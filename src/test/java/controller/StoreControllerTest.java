package controller;

import model.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rebeca on 29.03.2017.
 */
public class StoreControllerTest {
    Product product1;
    Product product2;
    Product product3;
    Product product4;
    StoreController storeController;

    @Before
    public void setUp() throws Exception {
        product1 = new Product(1, "Mere", "Fructe", 20);
        product2 = new Product(2, "Pere", "Fructe", 10);
        product3 = new Product(3, "Cartofi", "Legume", 30);
        product4 = new Product(4, "Mere", "Fructe", 20);

        storeController = new StoreController();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addProduct() throws Exception {
    }

    @Test
    public void getProductsCategory() throws Exception {
        Assert.assertEquals("Error in StoreController getProductsCategory",0, storeController.getProductsCategory("Fructe").size());
        storeController.addProduct(product1);
        storeController.addProduct(product2);
        storeController.addProduct(product3);
        Assert.assertEquals("Error in StoreController getProductsCategory",2, storeController.getProductsCategory("Fructe").size());
        Assert.assertEquals("Error in StoreController getProductsCategory",1, storeController.getProductsCategory("Legume").size());
    }

    @Test
    public void stockSituationProduct() throws Exception {
        storeController.addProduct(product1);
        Assert.assertEquals("Error in StoreController stockSituationProduct",1, storeController.stockSituationProduct("Mere").size());
        storeController.addProduct(product4);
        Assert.assertEquals("Error in StoreController stockSituationProduct",2, storeController.stockSituationProduct("Mere").size());
    }

    @Test
    public void stockSituation() throws Exception {
        storeController.addProduct(product1);
        storeController.addProduct(product3);
        Assert.assertEquals("Error in StoreController stockSituation",2, storeController.stockSituation().size());
        Assert.assertEquals("Error in StoreController stockSituation",product1, storeController.stockSituation().get(0));
        Assert.assertEquals("Error in StoreController stockSituation",product3, storeController.stockSituation().get(1));
    }


}