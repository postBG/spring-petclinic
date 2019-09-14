package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

// Proxy
public class CashPerf implements Payment {
    private Payment payment;

    public CashPerf(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay(int amount) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        payment.pay(amount);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
