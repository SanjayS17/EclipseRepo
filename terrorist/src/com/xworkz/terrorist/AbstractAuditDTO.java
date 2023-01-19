package com.xworkz.terrorist;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.core.serializer.Serializer;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public  abstract class AbstractAuditDTO implements Serializable {
	
	private String createdBy;
	private LocalDateTime CreatedAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
	
	

}
