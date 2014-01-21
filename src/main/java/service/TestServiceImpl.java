package service;
import javax.jws.WebService;
@WebService(endpointInterface = "com.digicompass.ws.service.TestService", serviceName = "Test")
public class TestServiceImpl implements TestService {
	@Override
	public String excute(String name) {
		// TODO Auto-generated method stub
		return "Hello,"+name;
	}

}
