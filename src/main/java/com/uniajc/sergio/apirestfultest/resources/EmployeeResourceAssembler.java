package com.uniajc.sergio.apirestfultest.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.uniajc.sergio.apirestfultest.controllers.EmployeeController;
import com.uniajc.sergio.apirestfultest.models.Employee;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeResourceAssembler implements ResourceAssembler<Employee, Resource<Employee>> {

    @Override
    public Resource<Employee> toResource(Employee employee) {
        return new Resource<Employee>(employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }

}