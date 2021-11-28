package day05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void addProductTest(){
        Store store=new Store();
        Product product1=new Product("zsemle",Type.BAKERY,10);
        Product product2=new Product("borda",Type.MEAT,1000);
        Product product3=new Product("pizza",Type.FROZEN,200);
        Product product4=new Product("ice cream",Type.FROZEN,150);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);


        List<ProductWithPiece> result =store.numberOfProductsType();

        assertEquals(3,result.size());
        assertEquals(2,result.get(2).getCount());
        assertEquals(Type.FROZEN,result.get(2).getType());
    }
}