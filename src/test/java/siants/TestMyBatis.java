package siants;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.siants.test.model.LDMenu;
import com.siants.test.service.impl.ILDMenuService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private ILDMenuService ldMenuService;
	
	@Test
	public void test() {
		try {
			LDMenu menu = ldMenuService.getLDMenuByCode("1");
			logger.info(JSON.toJSONString(menu));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
