package stream;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;
import java.util.stream.Collectors;

public class PalaceDTORunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> collection=new LinkedList();
		
		collection.add(new PalaceDTO("appu palace","btm","raj",false,50.0));
		collection.add(new PalaceDTO("preethi palace","bangalore","buddy",true,500.0));
		collection.add(new PalaceDTO("pavithra palace","mysore","buddy1",false,100.0));
		collection.add(new PalaceDTO("bhavana palace","rajajinagar","buddy2",true,150.0));
		
		collection.stream().forEach(dto->System.out.println(dto));
		System.out.println("after destroying the palace");
		
		collection
		.stream()
		.filter(e ->e
		.isDestroyed())
		.collect(Collectors.toList())
		.forEach(dto ->
		System.out.println(dto));
		
		
		
	}

}
