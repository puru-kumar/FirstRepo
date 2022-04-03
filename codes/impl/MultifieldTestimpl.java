package com.mysite.core.models.impl;
import com.mysite.core.models.MultifieldTest;
import com.mysite.core.models.Title;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,adapters = MultifieldTest.class)
public class MultifieldTestimpl implements MultifieldTest {

    @ValueMapValue
    List<Title> field;

    @Override
    public List<Title> getField() {
        return field;
    }
}
