package com.ivanwidyan.runner;

import com.ivanwidyan.module.api.SampleAPI;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ApiRunner {

    @Test
    public void getUser() {
        SampleAPI.getUser();
    }
}
