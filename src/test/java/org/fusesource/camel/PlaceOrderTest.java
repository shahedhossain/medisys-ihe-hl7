/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.camel;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.apache.activemq.util.IOHelper;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.apache.camel.test.spring.DisableJmx;
import org.apache.camel.test.spring.MockEndpoints;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.web.WebAppConfiguration;

@DisableJmx(false)
@MockEndpoints("log:*")
//@WebAppConfiguration("webapp")
@RunWith(CamelSpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations="classpath:/META-INF/spring/applicationContext.xml")
public class PlaceOrderTest {

	private static final Logger log = LoggerFactory.getLogger(PlaceOrderTest.class);

	@Autowired
    protected CamelContext camelContext;
 
    @EndpointInject(uri = "mock:foo")
    protected MockEndpoint foo;
	
	@Before
    public void setUp() throws Exception {
        //TODO
    }
	
	@Test
    public void testQuery() throws Exception {
		log.info("Hello world");
    	assertTrue(true);
    }

	@Test
    public void testMocksAreValid() throws Exception {
        foo.message(0).header("bar").isEqualTo("ABC"); 
        MockEndpoint.assertIsSatisfied(camelContext);
    }
}

