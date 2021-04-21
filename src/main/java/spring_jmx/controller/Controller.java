package spring_jmx.controller;

import spring_jmx.model.AddressMBean;
import spring_jmx.model.CountMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CountMBean countMBean;
    @Autowired
    AddressMBean addressMBean;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int getCount() {
        return countMBean.getCount();
    }

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public String getAddress() {
        return addressMBean.getAddress();
    }

}
