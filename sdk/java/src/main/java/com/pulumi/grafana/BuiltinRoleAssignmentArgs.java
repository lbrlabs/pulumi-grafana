// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.BuiltinRoleAssignmentRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BuiltinRoleAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuiltinRoleAssignmentArgs Empty = new BuiltinRoleAssignmentArgs();

    /**
     * Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
     * 
     */
    @Import(name="builtinRole", required=true)
    private Output<String> builtinRole;

    /**
     * @return Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
     * 
     */
    public Output<String> builtinRole() {
        return this.builtinRole;
    }

    /**
     * Fixed or custom roles which provide granular access for specific resources within Grafana.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<BuiltinRoleAssignmentRoleArgs>> roles;

    /**
     * @return Fixed or custom roles which provide granular access for specific resources within Grafana.
     * 
     */
    public Output<List<BuiltinRoleAssignmentRoleArgs>> roles() {
        return this.roles;
    }

    private BuiltinRoleAssignmentArgs() {}

    private BuiltinRoleAssignmentArgs(BuiltinRoleAssignmentArgs $) {
        this.builtinRole = $.builtinRole;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuiltinRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuiltinRoleAssignmentArgs $;

        public Builder() {
            $ = new BuiltinRoleAssignmentArgs();
        }

        public Builder(BuiltinRoleAssignmentArgs defaults) {
            $ = new BuiltinRoleAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param builtinRole Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
         * 
         * @return builder
         * 
         */
        public Builder builtinRole(Output<String> builtinRole) {
            $.builtinRole = builtinRole;
            return this;
        }

        /**
         * @param builtinRole Organization roles (`Viewer`, `Editor`, `Admin`) or `Grafana Admin` to assign the roles to.
         * 
         * @return builder
         * 
         */
        public Builder builtinRole(String builtinRole) {
            return builtinRole(Output.of(builtinRole));
        }

        /**
         * @param roles Fixed or custom roles which provide granular access for specific resources within Grafana.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<BuiltinRoleAssignmentRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Fixed or custom roles which provide granular access for specific resources within Grafana.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<BuiltinRoleAssignmentRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Fixed or custom roles which provide granular access for specific resources within Grafana.
         * 
         * @return builder
         * 
         */
        public Builder roles(BuiltinRoleAssignmentRoleArgs... roles) {
            return roles(List.of(roles));
        }

        public BuiltinRoleAssignmentArgs build() {
            $.builtinRole = Objects.requireNonNull($.builtinRole, "expected parameter 'builtinRole' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
