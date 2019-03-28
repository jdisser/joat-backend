package com.altocirrusapps.apps.joatbackend;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.altocirrusapps.apps.joatbackend.entities.Address;
import com.altocirrusapps.apps.joatbackend.entities.Property;
import com.altocirrusapps.apps.joatbackend.repositories.PropertyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JoatBackendApplicationTests {

	@Autowired
	private PropertyRepository pr;
	
	private Property tp = new Property(100, "testName", new Address("testAdd1","testAdd2","testCity","testState","testCountry","testZip"));
	
	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void readDbTest() {
		Optional<Property> p = pr.findById(1L);
		
		assertEquals("106A", p.get().getName());
		
	}
	
	@Test
	public void writeDbTest() {
		
		
		pr.save(tp);
		
		Optional<Property> rp = pr.findByName("testName");
		
		assertEquals("testAdd1", rp.get().getAddress().getAddress1());
		
		long pid = rp.get().getId();
		
		pr.deleteById(pid);
		
	}

}
