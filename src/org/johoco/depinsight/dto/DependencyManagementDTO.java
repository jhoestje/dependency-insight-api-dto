package org.johoco.depinsight.dto;

import java.util.Collection;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DependencyManagementDTO {

    private String version;

    private String scope;

    private Boolean optional;

    private Collection<Exclusion> exclusions;

    private Map<String, String> properties;

}
