package com.mysite.core.models.impl;
import com.mysite.core.models.Title;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,adapters = Title.class)
public class Titlesimpl implements Title{

    @ValueMapValue
    String name;

    @ValueMapValue
    String date;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }
}