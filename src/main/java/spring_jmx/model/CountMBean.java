package spring_jmx.model;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ManagedResource
public class CountMBean {

    private int count;

    @PostConstruct
    public void MBean() {
        count = 0;
    }

    @ManagedAttribute
    public int getCount() {
        return count;
    }

    @ManagedAttribute
    public void setCount(int count) {
        this.count = count;
    }

    @ManagedOperation
    public void plus() {
        count++;
    }

    @ManagedOperation
    public void minus() {
        count--;
    }

}
