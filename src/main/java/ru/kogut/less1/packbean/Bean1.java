package ru.kogut.less1.packbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean1")
@Scope("prototype")
public class Bean1 {

   public Beans bean;

    public Bean1(Beans bean) {
        this.bean = bean;
    }

    public Bean1() {
    }

    public Beans getBean() {
        return bean;
    }

    public void setBean(Beans bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return bean.toString();
    }
}
