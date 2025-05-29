package com.adobe.aem.may.batch.core.models;

import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Child1 {
    @ValueMapValue
    private String source;

    @ValueMapValue
    private String manufacturedate;
    @ChildResource(name = "companydetails") // 👈 IMPORTANT
    private List<SubChild1> companydetails;

    public String getSource() {
        return source;
    }

    public String getManufacturedate() {
        return manufacturedate;
    }

    public List<SubChild1> getCompanydetails() {
        return companydetails;
    }

}
