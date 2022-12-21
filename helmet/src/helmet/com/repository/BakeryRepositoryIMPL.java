package helmet.com.repository;

import helmet.com.dto.BakeryDTO;
import helmet.com.exception.StorageFullException;

public class BakeryRepositoryIMPL implements BakeryRepository {
	
	private BakeryDTO[] dtos=new BakeryDTO[5];
	private int currentIndex=0;
	
	@Override
	public boolean store(BakeryDTO dto) {
		System.out.println("running store in bakeryrepositoryimpl"+ dto);
		if(this.currentIndex >=this.dtos.length) {
			System.out.println("cannot add more bakery");
			throw new StorageFullException("storage is full max size is needed"+ dto);
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("saved dto into index"+this.currentIndex);
		this.currentIndex++;
		
		return true;
	}
	
}

