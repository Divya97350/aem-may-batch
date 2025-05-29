package com.adobe.aem.may.batch.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Parent1 {
    @ValueMapValue
    private String productname;

    public String getProductname() {
        return productname;
    }
    
    @ChildResource(name = "productdetails") 
    private List<Child1> productdetails;

    public List<Child1> getProductdetails() {
        return productdetails;
    }

    

}