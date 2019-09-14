package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

// Proxy
public class PaymentPerf implements Payment {
    private Payment payment;

    public PaymentPerf(Payment payment) {
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
