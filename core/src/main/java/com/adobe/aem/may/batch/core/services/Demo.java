package com.adobe.aem.may.batch.core.services;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,enabled = true,name = "DemoService")
public class Demo {

    private static final Logger LOG=LoggerFactory.getLogger(Demo.class);
    @Reference
    DemoService demoservice;

    @Activate
    public void activateContent()
    {
       LOG.info("msg is coming from the activate()");
       
    }
  
    @Deactivate
    public void Deactivate()
    {
       LOG.info("msg is coming from the deactivate()");
    }

    @Modified
    public void update()
    {
       LOG.info("msg is coming from the modified()");
    }

}