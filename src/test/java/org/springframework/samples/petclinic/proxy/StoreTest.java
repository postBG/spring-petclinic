package org.springframework.samples.petclinic.proxy;

import org.junit.Test;

public class StoreTest {
    @Test
    public void testPay() {
        Payment cashPerf = new PaymentPerf(new Cash());
        Store store = new Store(cashPerf);
        store.buySomething(100);
    }
}
