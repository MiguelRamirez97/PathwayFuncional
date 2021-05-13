package org.example.carrito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarritoDeLaCompraTest {
    private final Integer TOTAL_SIZE = 20000000;
    private final Integer NUMBER_ADD = 1000000;

    @Test
    public void shouldReturnTheCountOfAllItems() throws
            Exception {
        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertEquals(30,
                carritoDeLaCompra.contarNumeroProductos());
    }@Test
    public void shouldCalculateTotalPriceRefMethod() throws
            Exception {
        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertEquals(300,
                carritoDeLaCompra.calcularPrecioTotalRefMethod());
    }@Test
    public void shouldCalculateTotalDiscountLambda() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(20,100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotalLambda(100));
    }
    @Test
    public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatchParallel(){
        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        carritoDeLaCompra.detectarErrorAnyMatchParallel();
    }
    @Test
    public void
    shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAnyParallel(){
        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertTrue(carritoDeLaCompra.detectarErrorFindAnyParallel());
    }
    @Test
    public void
    shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindFirstParallel(){
        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertTrue(carritoDeLaCompra.detectarErrorFindFirstParallel());
    }



}
