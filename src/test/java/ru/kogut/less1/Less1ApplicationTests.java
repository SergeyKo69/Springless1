package ru.kogut.less1;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kogut.less1.packbean.Bean1;
import ru.kogut.less1.packbean.Bean2;
import ru.kogut.less1.packbean.Beans;

public class Less1ApplicationTests {

    @Test
    public void test() {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final Bean1 bean1 = context.getBean(Bean1.class, Beans.BEAN1);
        Assert.assertNotNull(bean1);
        Assert.assertEquals(bean1.getBean(),Beans.BEAN1);
        final Bean2 bean2 = context.getBean(Bean2.class,Beans.BEAN2,bean1);
        Assert.assertNotNull(bean2);
        Assert.assertNotNull(bean2.getBean1());
        Assert.assertEquals(bean2.getBean(),Beans.BEAN2);
    }

}
