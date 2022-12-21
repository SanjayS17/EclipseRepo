package helmet.com.xworkz.service;

import javax.sound.midi.SysexMessage;

import helmet.com.xworkz.constant.Color;
import helmet.com.xworkz.constant.HelmetType;
import helmet.com.xworkz.dto.HelmetDTO;
import helmet.com.xworkz.repository.HelmetRepository;

public class HelmetServiceIMPL implements HelmetService {
	
	private HelmetRepository helmetRepository;  
	
	public HelmetServiceIMPL(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
	}
	
	@Override
	public boolean validateAndSave(HelmetDTO dto) {
     String brand=dto.getBrand();
     HelmetType type=dto.getType();
     Double Price=dto.getPrice();
     Color color=dto.getColor();
     
     boolean validBrand=false;
     boolean validType=false;
     boolean validPrice=false;
     boolean validColor=false;
     
     if(brand!=null && brand.length()>=4 && brand.length()<=10) 
     {
    	 System.out.println("Brand is valid");
    	 validBrand=true;
     }
     else 
     {
    	 System.out.println("brand is invalid");
     }
     if(type!=null)
     {
    	 System.out.println("type is valid"); 
    	 validType=true;
     }
     else 
     {
    	System.out.println("type is invalid"); 
     }
     if(color!=null)
     {
    	 System.out.println("color is valid");
    	 validColor=true;
     }
     else
     {
    	 System.out.println("color is invalid");
     }
     if(Price>100 && Price<10000)
     {
    	System.out.println("price is valid"); 
    	validPrice=true;
     }
     else
     {
    	 System.out.println("price is invalid");
     }
     if(validBrand && validPrice && validColor && validType)
     {
    	 System.out.println("helmetdto is valid,can save using repository");
    	 boolean saved=this.helmetRepository.save(dto);
    	 System.out.println("helmet dto is saved"+ saved);
    	 return saved;
     }
     else
     {
    	 System.out.println("helmetdto in invalid ,cannot save using repository");
     }	
     System.out.println("Dto is Invalid");
		return false;
	}

}
