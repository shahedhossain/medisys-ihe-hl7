package sa.com.medisys.spring;import static org.junit.Assert.assertTrue;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.test.context.ContextConfiguration;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.context.web.WebAppConfiguration;@WebAppConfiguration("webapp")@RunWith(SpringJUnit4ClassRunner.class)@ContextConfiguration(locations="classpath:/META-INF/spring/applicationContext.xml")public class IHEHL7Test {		private static final Logger log = LoggerFactory.getLogger(IHEHL7Test.class);		/*@Autowired	private CityService cityService;*/         @Before    public void setUp() throws Exception {        //TODO    }    @Test    public void testER7Message() {    	assertTrue(true);    }}