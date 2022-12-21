package helmet.com.boot;

import helmet.com.dto.BakeryDTO;
import helmet.com.exception.InvalidBakeryDataException;
import helmet.com.repository.BakeryRepository;
import helmet.com.repository.BakeryRepositoryIMPL;
import helmet.com.service.BakeryService;
import helmet.com.service.BakeryServiceIMPL;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDTO dto=new BakeryDTO("natraj bakery","natraj",3432756756L,
				"jamoon","bhosdurga");
		BakeryDTO dto1=new BakeryDTO("natraj bakery","natraj",3432756756l,
				"jamoon","bhosdurga");
		BakeryDTO dto2=new BakeryDTO("natraj bakery","natraj",3432756756l,
				"jamoon","bhosdurga");
		BakeryDTO dto3=new BakeryDTO("natraj bakery","natraj",3432756756l,
				"jamoon","bhosdurga");
		BakeryDTO dto4=new BakeryDTO("natraj bakery","natraj",3432756756l,
				"jamoon","bhosdurga");
		
		/*BakeryDTO dto5=new BakeryDTO("natraj bakery","natraj",3432756756l,
				"jamoon","bhosdurga");*/
		
		BakeryRepository repository=new BakeryRepositoryIMPL ();
		
		BakeryService service=new BakeryServiceIMPL(repository);
		

		try {
			System.out.println("Before calling validate and save");
			service.validateAndSave(dto);
			/*service.validateAndSave(dto1);
			service.validateAndSave(dto2);
			service.validateAndSave(dto3);
			service.validateAndSave(dto4);*/
			// service.validateAndSave(dto5);

			System.out.println("After calling validate and save");
		} catch (InvalidBakeryDataException e) {
			e.printStackTrace();
		}
		System.out.println("After catch block");
	}

}

