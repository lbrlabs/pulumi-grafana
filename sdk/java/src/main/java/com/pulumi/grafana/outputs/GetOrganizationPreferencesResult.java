// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationPreferencesResult {
    /**
     * @return The Organization home dashboard ID.
     * 
     */
    private Integer homeDashboardId;
    /**
     * @return The Organization home dashboard UID.
     * 
     */
    private String homeDashboardUid;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
     * 
     */
    private String theme;
    /**
     * @return The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
     * 
     */
    private String timezone;
    /**
     * @return The Organization week start.
     * 
     */
    private String weekStart;

    private GetOrganizationPreferencesResult() {}
    /**
     * @return The Organization home dashboard ID.
     * 
     */
    public Integer homeDashboardId() {
        return this.homeDashboardId;
    }
    /**
     * @return The Organization home dashboard UID.
     * 
     */
    public String homeDashboardUid() {
        return this.homeDashboardUid;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Organization theme. Available values are `light`, `dark`, or an empty string for the default.
     * 
     */
    public String theme() {
        return this.theme;
    }
    /**
     * @return The Organization timezone. Available values are `utc`, `browser`, or an empty string for the default.
     * 
     */
    public String timezone() {
        return this.timezone;
    }
    /**
     * @return The Organization week start.
     * 
     */
    public String weekStart() {
        return this.weekStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPreferencesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer homeDashboardId;
        private String homeDashboardUid;
        private String id;
        private String theme;
        private String timezone;
        private String weekStart;
        public Builder() {}
        public Builder(GetOrganizationPreferencesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homeDashboardId = defaults.homeDashboardId;
    	      this.homeDashboardUid = defaults.homeDashboardUid;
    	      this.id = defaults.id;
    	      this.theme = defaults.theme;
    	      this.timezone = defaults.timezone;
    	      this.weekStart = defaults.weekStart;
        }

        @CustomType.Setter
        public Builder homeDashboardId(Integer homeDashboardId) {
            this.homeDashboardId = Objects.requireNonNull(homeDashboardId);
            return this;
        }
        @CustomType.Setter
        public Builder homeDashboardUid(String homeDashboardUid) {
            this.homeDashboardUid = Objects.requireNonNull(homeDashboardUid);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder theme(String theme) {
            this.theme = Objects.requireNonNull(theme);
            return this;
        }
        @CustomType.Setter
        public Builder timezone(String timezone) {
            this.timezone = Objects.requireNonNull(timezone);
            return this;
        }
        @CustomType.Setter
        public Builder weekStart(String weekStart) {
            this.weekStart = Objects.requireNonNull(weekStart);
            return this;
        }
        public GetOrganizationPreferencesResult build() {
            final var o = new GetOrganizationPreferencesResult();
            o.homeDashboardId = homeDashboardId;
            o.homeDashboardUid = homeDashboardUid;
            o.id = id;
            o.theme = theme;
            o.timezone = timezone;
            o.weekStart = weekStart;
            return o;
        }
    }
}