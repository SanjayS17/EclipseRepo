package helmet.com.service;

import helmet.com.dto.BakeryDTO;
import helmet.com.exception.InvalidBakeryDataException;
import helmet.com.repository.BakeryRepository;

public class BakeryServiceIMPL  implements BakeryService{
	
	private BakeryRepository repository;
	

	public BakeryServiceIMPL(BakeryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException {

		System.out.println("Running validateAndSave " + dto);
		String name = dto.getName();
		String ownerName=dto.getOwnerName();
		String famousFor=dto.getFamousFor();
		String location=dto.getLocation();
		long contactNo=dto.getContactNo();
		
		boolean validName=false;
		boolean validownerName=false;
		boolean validfamousFor=false;
		boolean validlocation=false;
		boolean validcontactNo=false;
		
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}
		if(ownerName!=null && ownerName.length() >=3 && ownerName.length() <=20) {
			System.out.println("valid ownerNmae");
			validownerName=true;
		}
		else {
			System.out.println("invalid ownerName"+ownerName);
		}
		if(famousFor!=null && famousFor.length() >=3 && famousFor.length() <=20) {
			System.out.println("valid famousFor");
			validfamousFor=true;
		}
		else {
			System.out.println("invalid famousFor");
		}
		if(location!=null && location.length() >=3&& location.length() <=20) {
			System.out.println("valid location ");
			validlocation=true;
		}
		else {
			System.out.println("invalid location");
		}	
		if (contactNo > 1234563L && contactNo < 9876543210L) {
				System.out.println("Valid phNo");
				validcontactNo = true;
		} else {
				System.err.println("Invalid phNo " + contactNo);
			}

		if (validName && validownerName && validfamousFor && validlocation && validcontactNo) {
			System.out.println("Data is valid can store");
			boolean saved = this.repository.store(dto);
			System.out.println("Data is saved successfully " + saved);
			return saved;
		} else {
			throw new InvalidBakeryDataException("Check the data i have passed");
		}

	}


}
