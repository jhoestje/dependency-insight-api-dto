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
public class MailingLists {
	private String name;
	private String subscribe;
	private String unsubscribe;
	private String post;
	private String archive;
	private String otherArchives;
}
