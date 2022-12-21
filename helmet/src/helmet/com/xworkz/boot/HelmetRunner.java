package helmet.com.xworkz.boot;

import helmet.com.xworkz.constant.Color;
import helmet.com.xworkz.constant.HelmetType;
import helmet.com.xworkz.dto.HelmetDTO;
import helmet.com.xworkz.repository.HelmetRepository;
import helmet.com.xworkz.repository.HelmetRepositoryIMPL;
import helmet.com.xworkz.service.HelmetService;
import helmet.com.xworkz.service.HelmetServiceIMPL;

public class HelmetRunner {

	public static void main(String[] args) {
		
		HelmetDTO dto=new HelmetDTO("vega", HelmetType.HALF, 1234D,Color.PINK);
		
		HelmetRepository repository=new HelmetRepositoryIMPL();
		
		HelmetService helmetService=new HelmetServiceIMPL(repository);
		
		boolean success=helmetService.validateAndSave(dto);
		System.out.println("success "+success);

	}

}
