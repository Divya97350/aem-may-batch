package com.adobe.aem.may.batch.core.services;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = EmployeeImpl.class,immediate = true,enabled = true)
@Designate(ocd = EmployeeConfiguration.class)
public class EmployeeImpl {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeImpl.class);
      public String name;
      public double salary;
      public int id;

    @Activate
    public void activation(EmployeeConfiguration config){

        LOG.info("activation() is started");
        updation(config);
    }

    @Deactivate
    public void deactivation(EmployeeConfiguration config){

        LOG.info("De-activation() is started");
        updation(config);

    }

    @Modified 
    public void updation(EmployeeConfiguration config){
        this.name=config.name();
        this.id=config.id();
        this.salary=config.salary();        
        LOG.info("name{},id{},salary{}",name,id,salary);

    }
}
