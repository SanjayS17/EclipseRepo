package helmet.com.service;

import helmet.com.dto.BakeryDTO;
import helmet.com.exception.InvalidBakeryDataException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException;

}
