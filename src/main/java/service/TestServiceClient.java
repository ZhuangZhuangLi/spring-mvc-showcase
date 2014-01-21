package service;
import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TestServiceImpl impl=new TestServiceImpl();
	      String ADDRESS = "http://localhost:9000/ws"; 
	      System.out.println("service start:");  
	      Endpoint.publish(ADDRESS, impl);
		  JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
	      factoryBean.setServiceClass(TestService.class);  
	      factoryBean.setAddress("http://localhost:9000/ws");  
	          
	      TestService testService = (TestService)factoryBean.create();  
	      System.out.println(""+testService.excute("Tom"));  
//		
//		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-wsclient.xml");
//		  TestService test = (TestService) context.getBean("client");
//	      String response = test.excute("Li");
//	      System.out.println(response);
	}

}
