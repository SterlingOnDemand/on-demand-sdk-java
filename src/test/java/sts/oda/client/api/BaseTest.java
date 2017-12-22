package sts.oda.client.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;

public class BaseTest {

    protected Gson gson = new GsonBuilder().setPrettyPrinting().create();
    protected ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Before
    public void base_setup(){
        OBJECT_MAPPER.registerModule(new JodaModule());
        OBJECT_MAPPER.configure(com.fasterxml.jackson.databind.SerializationFeature.
                WRITE_DATES_AS_TIMESTAMPS , false);
    }

}
