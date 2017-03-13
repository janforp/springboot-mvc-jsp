package com.janita.oss;

import com.janita.oss.configuration.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OssApplicationTests {

	@Test
	public void testConfig() {
		System.out.println("*******"+ Config.getAccessKeySecret());
	}
}
