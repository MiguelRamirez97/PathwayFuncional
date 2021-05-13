package org.example.carrito;

import java.util.Collection;

public class CarritoDeLaCompra {
    private Collection<Integer> precios;
    public CarritoDeLaCompra(Collection<Integer> precios) {
        this.precios = precios;
    }
    public int calcularPrecioTotalRefMethod() {
        return this.precios.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int contarNumeroProductos() {
        return precios.size();
    }

    public long calcularDescuentoTotalLambda(int cantidadConDescuento){
        Long numeroDeDescuentos = this.precios.stream()
                .filter(precio -> precio.intValue() >=
                        cantidadConDescuento)
                .count();
        return (cantidadConDescuento*5/100)*numeroDeDescuentos;
    }

    public boolean detectarErrorAnyMatchParallel() { return this.precios.parallelStream().anyMatch(precio -> precio.intValue() < 0);
    }
    public boolean detectarErrorFindAnyParallel() {
        return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
                .findAny()
                .isPresent();
    }
    public boolean detectarErrorFindFirstParallel() {
        return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
                .findFirst()
                .isPresent();
    }

}
