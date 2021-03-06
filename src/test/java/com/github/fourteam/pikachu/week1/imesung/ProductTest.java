package com.github.fourteam.pikachu.week1.imesung;

import com.github.fourteam.pikachu.week1.imesung.domain.customer.Customer;
import com.github.fourteam.pikachu.week1.imesung.domain.product.GeneralProduct;
import com.github.fourteam.pikachu.week1.imesung.domain.product.Product;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class ProductTest {
    List<Product> products = new ArrayList<>();

    @Before
    public void setUp() {
        products.add(GeneralProduct.builder()
                .prdCd(1111)
                .price(5000L)
                .build());

        products.add(GeneralProduct.builder()
                .prdCd(1112)
                .price(5000L)
                .build());

        products.add(GeneralProduct.builder()
                .prdCd(1113)
                .price(5000L)
                .build());

        products.add(GeneralProduct.builder()
                .prdCd(1114)
                .price(5000L)
                .build());

        products.add(GeneralProduct.builder()
                .prdCd(1114)
                .price(3000L)
                .build());
    }


    //2주차 요구사항 1. 상품에 대한 재고 체
    @Test
    public void 상품재고여부확인() {
        //given
        Product product = GeneralProduct.builder()
                .stock(3L)
                .supId("1001")
                .build();
        //when

        //then
        assertTrue(product.checkProduct());
    }


    //3주차 요구사항 2. 포인트로 구매 가능한 상품 목록이 10개 이상인지 조회
   @Test
    public void 구매가능상품목록() {
        //given
        /*Customer customer = Customer.builder()
                .point(4000L)
                .build();*/
        Customer customer = mock(Customer.class);

        //when
        //그냥 Customer 생성? mock 활용?
        //when(customer.getPoint()).thenReturn(4000L);
        //when(customer.chkPrdListInfo(products)).thenReturn(true);

        //then
        assertTrue(customer.chkPrdListInfo(products));

    }
}