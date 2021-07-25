package org.johoco.depinsight.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 *
 * @author John Hoestje
 */
@Data
@Builder
public class Repository {
	private RepositoryPolicy releases;
	private RepositoryPolicy snapshots;
	private String id;
	private String name;
	private String url;
	private String layout;
}
