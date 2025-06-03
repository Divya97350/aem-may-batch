package com.adobe.aem.may.batch.core.services;



import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="EmployeeConfiguration")
public @interface EmployeeConfiguration {

    @AttributeDefinition(
name = "Employee Name",
description = "about meghana",
required = true,
defaultValue = "employee name"

    )
    public String name();

    @AttributeDefinition(
        name = "Employee id",
        description = "about Employee id",
        required = true,
        defaultValue = "9999"
        
            )
    public int id();

    @AttributeDefinition(
        name = "Employee salary",
        description = "about Employee salary",
        required = true,
        defaultValue = "99,000.00"
        
            )

    public double salary();
}