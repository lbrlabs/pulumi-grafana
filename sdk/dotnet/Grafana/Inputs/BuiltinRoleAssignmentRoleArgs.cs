// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Grafana.Inputs
{

    public sealed class BuiltinRoleAssignmentRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// States whether the assignment is available across all organizations or not. Defaults to `false`.
        /// </summary>
        [Input("global")]
        public Input<bool>? Global { get; set; }

        /// <summary>
        /// Unique identifier of the role to assign to `builtin_role`.
        /// </summary>
        [Input("uid", required: true)]
        public Input<string> Uid { get; set; } = null!;

        public BuiltinRoleAssignmentRoleArgs()
        {
        }
        public static new BuiltinRoleAssignmentRoleArgs Empty => new BuiltinRoleAssignmentRoleArgs();
    }
}
