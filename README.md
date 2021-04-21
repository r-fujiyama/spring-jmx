# Jolokia URL

## CountMBean

- CountMBean.plus
    - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=countMBean,type=CountMBean/plus
- CountMBean.minus
    - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=countMBean,type=CountMBean/minus
- CountMBean.getCount
    - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=countMBean,type=CountMBean/getCount
- CountMBean.setCount
    - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=countMBean,type=CountMBean/setCount/0

## AddressMBean
- AddressMBean.getAddress
  - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=Address/getAddress
- AddressMBean.setAddress
  - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=Address/setAddress/Tokyo,Chiyoda-ku,Kokyogaien
- AddressMBean.deleteAddress
  - http://localhost:8081/actuator/jolokia/exec/spring_jmx.model:name=Address/deleteAddress

