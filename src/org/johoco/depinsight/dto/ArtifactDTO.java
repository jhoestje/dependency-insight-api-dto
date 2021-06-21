package org.johoco.depinsight.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArtifactDTO {
	private String language;
	private String groupId;
	private String artifactId;
	private String version;
	private String packaging;

//	@JsonFormat(pattern="dd MMM yyyy")
//	@JsonSerialize(using = LocalDateSerializer.class)
//	LocalDate dateOfBirth;
//
//	@JsonFormat(pattern="dd MMM yyyy hh:mm:ss")
//	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private Date createdDate;
	private Date lastUpdatedDate;
	
}
