package com.xworkz.ipl.boot;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {

		IplRepositoryImpl repository= new IplRepositoryImpl();
		
		IplDTO dto=new IplDTO();
		dto.setTeamName("Rcb");
		dto.setCaptainName("virat");
		dto.setisOwnerAlive(true);
		dto.setPurse(85);
		dto.setWins(107);
		dto.setDefeats(113);
        dto.setCreatedBy("system");
        dto.setCreatedDate(LocalDateTime.now());
        repository.created(dto);
        
        System.out.println("---------------------------");
        
        IplDTO dto1=new IplDTO();
        dto1.setTeamName("mi");
		dto1.setCaptainName("rohith");
		dto1.setisOwnerAlive(true);
		dto1.setPurse(86);
		dto1.setWins(108);
		dto1.setDefeats(112);
        dto1.setCreatedBy("system");
        dto1.setCreatedDate(LocalDateTime.now());
        repository.created(dto1);
        
 System.out.println("---------------------------");
        
        IplDTO dto2=new IplDTO();
        dto2.setTeamName("csk");
		dto2.setCaptainName("dhoni");
		dto2.setisOwnerAlive(true);
		dto2.setPurse(88);
		dto2.setWins(110);
		dto2.setDefeats(115);
        dto2.setCreatedBy("system");
        dto2.setCreatedDate(LocalDateTime.now());
        repository.created(dto2);
        
        
        System.out.println("---------------------------");
               
            IplDTO dto3=new IplDTO();
            dto3.setTeamName("kkr");
       		dto3.setCaptainName("shreyas");
       		dto3.setisOwnerAlive(true);
       		dto3.setPurse(90);
       		dto3.setWins(111);
       		dto3.setDefeats(117);
            dto3.setCreatedBy("system");
            dto3.setCreatedDate(LocalDateTime.now());
            repository.created(dto3);
            

            System.out.println("---------------------------");
                   
                IplDTO dto4=new IplDTO();
                dto4.setTeamName("srh");
           		dto4.setCaptainName("warner");
           		dto4.setisOwnerAlive(true);
           		dto4.setPurse(98);
           		dto4.setWins(100);
           		dto4.setDefeats(119);
                dto4.setCreatedBy("system");
                dto4.setCreatedDate(LocalDateTime.now());
                repository.created(dto4);
		

                System.out.println("---------------------------");
                       
                    IplDTO dto5=new IplDTO();
                    dto5.setTeamName(" pbks");
               		dto5.setCaptainName("mayank");
               		dto5.setisOwnerAlive(true);
               		dto5.setPurse(99);
               		dto5.setWins(123);
               		dto5.setDefeats(1123);
                    dto5.setCreatedBy("system");
                    dto5.setCreatedDate(LocalDateTime.now());
                    repository.created(dto5);
                    

                    System.out.println("---------------------------");
                           
                        IplDTO dto6=new IplDTO();
                        dto6.setTeamName("rr");
                        dto6.setCaptainName("sanju");
                        dto6.setisOwnerAlive(true);
                        dto6.setPurse(97);
                        dto6.setWins(116);
                        dto6.setDefeats(110);
                        dto6.setCreatedBy("system");
                        dto6.setCreatedDate(LocalDateTime.now());
                        repository.created(dto6);
		
                        

                        System.out.println("---------------------------");
                               
                            IplDTO dto7=new IplDTO();
                            dto7.setTeamName("dd");
                            dto7.setCaptainName("sanju");
                            dto7.setisOwnerAlive(true);
                            dto7.setPurse(90);
                            dto7.setWins(123);
                            dto7.setDefeats(115);
                            dto7.setCreatedBy("system");
                            dto7.setCreatedDate(LocalDateTime.now());
                            repository.created(dto7);
                            
                            
                            System.out.println("---------------------------");
                            
                            IplDTO dto71=new IplDTO();
                            dto71.setTeamName("dd");
                            dto71.setCaptainName("sanju");
                            dto71.setisOwnerAlive(true);
                            dto71.setPurse(90);
                            dto71.setWins(123);
                            dto71.setDefeats(115);
                            dto71.setCreatedBy("system");
                            dto71.setCreatedDate(LocalDateTime.now());
                            repository.created(dto71); 
                            
                            System.out.println("---------------------------");
                            
                            IplDTO dto8=new IplDTO();
                            dto8.setTeamName("luckno");
                            dto8.setCaptainName("rahul");
                            dto8.setisOwnerAlive(true);
                            dto8.setPurse(91);
                            dto8.setWins(100);
                            dto8.setDefeats(96);
                            dto8.setCreatedBy("system");
                            dto8.setCreatedDate(LocalDateTime.now());
                            repository.created(dto8);
                            
                            System.out.println("---------------------------");
                            
                            IplDTO dto9=new IplDTO();
                            dto9.setTeamName("gujarath");
                            dto9.setCaptainName("hardik");
                            dto9.setisOwnerAlive(true);
                            dto9.setPurse(92);
                            dto9.setWins(50);
                            dto9.setDefeats(80);
                            dto9.setCreatedBy("system");
                            dto9.setCreatedDate(LocalDateTime.now());
                            repository.created(dto9);
                            
    		
                        
		
		
	}

}
