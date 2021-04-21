package spring_jmx.model;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
@ManagedResource(objectName = "jmx.model:name=Address", description = "住所管理")
public class AddressMBean {

    private String state;
    private String city;
    private String line;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @ManagedOperation(description = "住所を取得します")
    public String getAddress() {
        return new StringJoiner(",").add(this.state).add(this.city).add(this.line).toString();
    }

    @ManagedOperation(description = "住所を設定します")
    public void setAddress(String address) {
        String[] addressList = address.split(",");
        this.state = addressList[0];
        this.city = addressList[1];
        this.line = addressList[2];
    }

    @ManagedOperation(description = "住所を削除します")
    public void deleteAddress() {
        this.state = "";
        this.city = "";
        this.line = "";
    }

}
