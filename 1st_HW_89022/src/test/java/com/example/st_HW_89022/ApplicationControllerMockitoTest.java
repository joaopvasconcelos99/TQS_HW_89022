package com.example.st_HW_89022;
import com.example.st_HW_89022.controller.ApplicationController;
import com.example.st_HW_89022.models.Datum;
import com.example.st_HW_89022.models.Example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationControllerMockitoTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ApplicationController applicationController = new ApplicationController();

    @Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {

        Datum exDatum = new Datum(null,44,0.190974,302.076,96.0231,null,0.507571,null,null,1.32271,0.0929512,null);
        List<Datum> data = new ArrayList<Datum>();
        data.add(exDatum);
        Example exAveiro = new Example(data,null,"-7.90971","Europe/Lisbon","40.66101",null,null);
        Mockito
                .when(restTemplate.getForObject(
                        "https://api.weatherbit.io/v2.0/current/airquality?city=Aveiro&key=null", Example.class))
          .thenReturn(exAveiro);

        Example example = applicationController.getCityWeather("Aveiro");
        Assert.assertEquals(exAveiro, example);
    }
}
