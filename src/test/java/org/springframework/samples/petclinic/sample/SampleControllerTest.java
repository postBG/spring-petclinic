package org.springframework.samples.petclinic.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testDI() {
        SampleController bean = applicationContext.getBean(SampleController.class);
        assertThat(bean).isNotNull();
    }
}
