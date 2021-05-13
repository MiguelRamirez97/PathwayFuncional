package org.example.carrito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarritoDeLaCompraTest {
    @Test
    public void shouldReturnTheCountOfAllItems() throws
            Exception {
        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertEquals(30,
                carritoDeLaCompra.contarNumeroProductos());
    } @Test
    public void shouldCalculateTotalPrice() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assertions.assertEquals(300,
                carritoDeLaCompra.calcularPrecioTotal());
    }
}
