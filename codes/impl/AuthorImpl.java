package com.mysite.core.models.impl;

import com.day.cq.wcm.api.Page;
import com.mysite.core.models.Author;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import javax.inject.Inject;



@Model(adaptables = {SlingHttpServletRequest.class,Resource.class}, adapters = Author.class)
public class AuthorImpl implements Author {
    //String title;
    @ValueMapValue
    @Required
    @Default(values = "kill")
    String firstName;


    @ValueMapValue
    @Optional
    @Default(values = "bill")
    String lastName;



    @Override
    public String getFirstName() {
        return firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }

//    @Override
//    public String getTitle() {
//        return title;
//    }

}