package com.jun.tddexample;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class SalesRepositorySystemTest {

    @Test
    public void findsExampleSalesInOutput()
    {
        ApplicationRunner runner = new ApplicationRunner();

        String output = runner.run("src/main/resources/example-sales.csv");

        assertThat(output, containsString("- London          -    235 -"));
    }

}
