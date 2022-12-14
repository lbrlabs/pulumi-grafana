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

    public sealed class SyntheticMonitoringCheckSettingsTcpArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("queryResponses")]
        private InputList<Inputs.SyntheticMonitoringCheckSettingsTcpQueryResponseArgs>? _queryResponses;
        public InputList<Inputs.SyntheticMonitoringCheckSettingsTcpQueryResponseArgs> QueryResponses
        {
            get => _queryResponses ?? (_queryResponses = new InputList<Inputs.SyntheticMonitoringCheckSettingsTcpQueryResponseArgs>());
            set => _queryResponses = value;
        }

        [Input("sourceIpAddress")]
        public Input<string>? SourceIpAddress { get; set; }

        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        [Input("tlsConfig")]
        public Input<Inputs.SyntheticMonitoringCheckSettingsTcpTlsConfigArgs>? TlsConfig { get; set; }

        public SyntheticMonitoringCheckSettingsTcpArgs()
        {
        }
        public static new SyntheticMonitoringCheckSettingsTcpArgs Empty => new SyntheticMonitoringCheckSettingsTcpArgs();
    }
}
