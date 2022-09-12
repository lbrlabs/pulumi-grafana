// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Grafana.Outputs
{

    [OutputType]
    public sealed class SyntheticMonitoringCheckSettingsDns
    {
        public readonly string? IpVersion;
        public readonly int? Port;
        public readonly string? Protocol;
        public readonly string? RecordType;
        public readonly string? Server;
        public readonly string? SourceIpAddress;
        public readonly ImmutableArray<string> ValidRCodes;
        public readonly ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRr> ValidateAdditionalRrs;
        public readonly Outputs.SyntheticMonitoringCheckSettingsDnsValidateAnswerRrs? ValidateAnswerRrs;
        public readonly Outputs.SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrs? ValidateAuthorityRrs;

        [OutputConstructor]
        private SyntheticMonitoringCheckSettingsDns(
            string? ipVersion,

            int? port,

            string? protocol,

            string? recordType,

            string? server,

            string? sourceIpAddress,

            ImmutableArray<string> validRCodes,

            ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRr> validateAdditionalRrs,

            Outputs.SyntheticMonitoringCheckSettingsDnsValidateAnswerRrs? validateAnswerRrs,

            Outputs.SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrs? validateAuthorityRrs)
        {
            IpVersion = ipVersion;
            Port = port;
            Protocol = protocol;
            RecordType = recordType;
            Server = server;
            SourceIpAddress = sourceIpAddress;
            ValidRCodes = validRCodes;
            ValidateAdditionalRrs = validateAdditionalRrs;
            ValidateAnswerRrs = validateAnswerRrs;
            ValidateAuthorityRrs = validateAuthorityRrs;
        }
    }
}