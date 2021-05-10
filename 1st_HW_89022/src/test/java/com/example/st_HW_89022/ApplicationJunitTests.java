package com.example.st_HW_89022;

import com.example.st_HW_89022.Cache.Cache;
import com.example.st_HW_89022.models.Example;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationJunitTests {

	@Test
	@DisplayName("Test if cache is working properly")
	void testCache(){
		Example example = new Example();
		example.setLon("-8.64554");
		Cache.setExample("Aveiro", example);
		Example example2 = Cache.example.get("Aveiro");
		Assert.assertEquals(example2.getLon(),example.getLon());
	}

	@Test
	@DisplayName("Test if number of requests is the expected")
	void testCacheNrRequests(){
		Example example = new Example();
		example.setLon("-8.64554");
		Cache.setExample("Aveiro", example);
		Example example2 = Cache.example.get("Aveiro");
		Assert.assertEquals(2, Cache.getNrRequests());
	}

}
