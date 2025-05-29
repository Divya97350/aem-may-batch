package com.adobe.aem.may.batch.core.models;



import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Child {

    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String date;

    @ValueMapValue
    private String author;

    @ChildResource(name = "publicationdetails") // 👈 IMPORTANT
    private List<SubChild> publicationdetails;


    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookname() {
        return bookname;
    }

     public List<SubChild> getPublicationdetails() {
        return publicationdetails;
    }



}
