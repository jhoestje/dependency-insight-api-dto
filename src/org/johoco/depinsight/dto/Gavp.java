package org.johoco.depinsight.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Gavp {
	private String artifactId;
	private String groupId;
	private String version;
	private String extension;
}
