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

    public sealed class SyntheticMonitoringCheckSettingsPingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dontFragment")]
        public Input<bool>? DontFragment { get; set; }

        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("payloadSize")]
        public Input<int>? PayloadSize { get; set; }

        [Input("sourceIpAddress")]
        public Input<string>? SourceIpAddress { get; set; }

        public SyntheticMonitoringCheckSettingsPingGetArgs()
        {
        }
        public static new SyntheticMonitoringCheckSettingsPingGetArgs Empty => new SyntheticMonitoringCheckSettingsPingGetArgs();
    }
}
