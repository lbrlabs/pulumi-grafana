// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.DataSourcePermissionPermissionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DataSourcePermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourcePermissionArgs Empty = new DataSourcePermissionArgs();

    /**
     * ID of the datasource to apply permissions to.
     * 
     */
    @Import(name="datasourceId", required=true)
    private Output<Integer> datasourceId;

    /**
     * @return ID of the datasource to apply permissions to.
     * 
     */
    public Output<Integer> datasourceId() {
        return this.datasourceId;
    }

    /**
     * The permission items to add/update. Items that are omitted from the list will be removed.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<DataSourcePermissionPermissionArgs>> permissions;

    /**
     * @return The permission items to add/update. Items that are omitted from the list will be removed.
     * 
     */
    public Output<List<DataSourcePermissionPermissionArgs>> permissions() {
        return this.permissions;
    }

    private DataSourcePermissionArgs() {}

    private DataSourcePermissionArgs(DataSourcePermissionArgs $) {
        this.datasourceId = $.datasourceId;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourcePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourcePermissionArgs $;

        public Builder() {
            $ = new DataSourcePermissionArgs();
        }

        public Builder(DataSourcePermissionArgs defaults) {
            $ = new DataSourcePermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasourceId ID of the datasource to apply permissions to.
         * 
         * @return builder
         * 
         */
        public Builder datasourceId(Output<Integer> datasourceId) {
            $.datasourceId = datasourceId;
            return this;
        }

        /**
         * @param datasourceId ID of the datasource to apply permissions to.
         * 
         * @return builder
         * 
         */
        public Builder datasourceId(Integer datasourceId) {
            return datasourceId(Output.of(datasourceId));
        }

        /**
         * @param permissions The permission items to add/update. Items that are omitted from the list will be removed.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<DataSourcePermissionPermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The permission items to add/update. Items that are omitted from the list will be removed.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<DataSourcePermissionPermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions The permission items to add/update. Items that are omitted from the list will be removed.
         * 
         * @return builder
         * 
         */
        public Builder permissions(DataSourcePermissionPermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        public DataSourcePermissionArgs build() {
            $.datasourceId = Objects.requireNonNull($.datasourceId, "expected parameter 'datasourceId' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
