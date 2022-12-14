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

    public sealed class ServiceAccountPermissionPermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Permission to associate with item. Must be `Edit` or `Admin`.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        /// <summary>
        /// ID of the team to manage permissions for. Specify either this or `user_id`. Defaults to `0`.
        /// </summary>
        [Input("teamId")]
        public Input<int>? TeamId { get; set; }

        /// <summary>
        /// ID of the user to manage permissions for. Specify either this or `team_id`. Defaults to `0`.
        /// </summary>
        [Input("userId")]
        public Input<int>? UserId { get; set; }

        public ServiceAccountPermissionPermissionArgs()
        {
        }
        public static new ServiceAccountPermissionPermissionArgs Empty => new ServiceAccountPermissionPermissionArgs();
    }
}
