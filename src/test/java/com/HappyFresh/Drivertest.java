package com.HappyFresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Drivertest {

    @Test
    public void testTarikSaldoBerhasil() {

        // Membuat driver dummy
        Driver driver = new Driver("Triana", "triana", "123", 10000);

        // Set saldo awal
        driver.setSaldo(100000);

        // Simulasi tarik saldo
        int jumlahTarik = 50000;

        // Logic penarikan
        driver.setSaldo(driver.getSaldo() - jumlahTarik);

        // Assertion
        assertEquals(50000, driver.getSaldo());
    }
}