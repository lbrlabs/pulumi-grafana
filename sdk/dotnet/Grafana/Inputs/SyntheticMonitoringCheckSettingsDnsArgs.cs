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

    public sealed class SyntheticMonitoringCheckSettingsDnsArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("recordType")]
        public Input<string>? RecordType { get; set; }

        [Input("server")]
        public Input<string>? Server { get; set; }

        [Input("sourceIpAddress")]
        public Input<string>? SourceIpAddress { get; set; }

        [Input("validRCodes")]
        private InputList<string>? _validRCodes;
        public InputList<string> ValidRCodes
        {
            get => _validRCodes ?? (_validRCodes = new InputList<string>());
            set => _validRCodes = value;
        }

        [Input("validateAdditionalRrs")]
        private InputList<Inputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs>? _validateAdditionalRrs;
        public InputList<Inputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs> ValidateAdditionalRrs
        {
            get => _validateAdditionalRrs ?? (_validateAdditionalRrs = new InputList<Inputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs>());
            set => _validateAdditionalRrs = value;
        }

        [Input("validateAnswerRrs")]
        public Input<Inputs.SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs>? ValidateAnswerRrs { get; set; }

        [Input("validateAuthorityRrs")]
        public Input<Inputs.SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs>? ValidateAuthorityRrs { get; set; }

        public SyntheticMonitoringCheckSettingsDnsArgs()
        {
        }
        public static new SyntheticMonitoringCheckSettingsDnsArgs Empty => new SyntheticMonitoringCheckSettingsDnsArgs();
    }
}
