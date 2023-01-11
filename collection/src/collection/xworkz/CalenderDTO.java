package collection.xworkz;

import java.io.Serializable;

public class CalenderDTO  implements Serializable{

	private String name;
	private int pageNo;
	private String company;
	
	public CalenderDTO() 
	{
		super();
	}

	public CalenderDTO(String name, int pageNo, String company) 
	{
		super();
		this.name = name;
		this.pageNo = pageNo;
		this.company = company;
	}
	
	@Override
	public boolean equals(Object ref)
	{
		System.out.println("running equals from calenderDTO");
	if(ref!=null) 
	{
		if(ref instanceof CalenderDTO) 
		{
			CalenderDTO dto=(CalenderDTO)ref;
			if(dto.name.equals(this.name)) {
				System.out.println("name is matching"+dto.name);
				return true;
			}	
		}
	}
	return false;
	}
	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", pageNo=" + pageNo + ", company=" + company + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


	
	

}
