package ru.kogut.less1.packbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean2")
@Scope("prototype")
public class Bean2 {
    public Beans bean;

    @Autowired
    public Bean1 bean1;

    public Bean2(Beans bean) {
        this.bean = bean;
    }

    public Bean2() {
        this.bean = bean;
    }

    public Beans getBean() {
        return bean;
    }

    public void setBean(Beans bean) {
        this.bean = bean;
    }

    public Bean1 getBean1() {
        return bean1;
    }

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }

    @Override
    public String toString() {
        return bean.toString();
    }
}
