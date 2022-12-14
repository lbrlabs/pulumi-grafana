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
    public sealed class SyntheticMonitoringCheckSettingsHttp
    {
        public readonly Outputs.SyntheticMonitoringCheckSettingsHttpBasicAuth? BasicAuth;
        public readonly string? BearerToken;
        public readonly string? Body;
        public readonly string? CacheBustingQueryParamName;
        public readonly ImmutableArray<string> FailIfBodyMatchesRegexps;
        public readonly ImmutableArray<string> FailIfBodyNotMatchesRegexps;
        public readonly ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsHttpFailIfHeaderMatchesRegexp> FailIfHeaderMatchesRegexps;
        public readonly ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsHttpFailIfHeaderNotMatchesRegexp> FailIfHeaderNotMatchesRegexps;
        public readonly bool? FailIfNotSsl;
        public readonly bool? FailIfSsl;
        public readonly ImmutableArray<string> Headers;
        public readonly string? IpVersion;
        public readonly string? Method;
        public readonly bool? NoFollowRedirects;
        public readonly string? ProxyUrl;
        public readonly Outputs.SyntheticMonitoringCheckSettingsHttpTlsConfig? TlsConfig;
        public readonly ImmutableArray<string> ValidHttpVersions;
        public readonly ImmutableArray<int> ValidStatusCodes;

        [OutputConstructor]
        private SyntheticMonitoringCheckSettingsHttp(
            Outputs.SyntheticMonitoringCheckSettingsHttpBasicAuth? basicAuth,

            string? bearerToken,

            string? body,

            string? cacheBustingQueryParamName,

            ImmutableArray<string> failIfBodyMatchesRegexps,

            ImmutableArray<string> failIfBodyNotMatchesRegexps,

            ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsHttpFailIfHeaderMatchesRegexp> failIfHeaderMatchesRegexps,

            ImmutableArray<Outputs.SyntheticMonitoringCheckSettingsHttpFailIfHeaderNotMatchesRegexp> failIfHeaderNotMatchesRegexps,

            bool? failIfNotSsl,

            bool? failIfSsl,

            ImmutableArray<string> headers,

            string? ipVersion,

            string? method,

            bool? noFollowRedirects,

            string? proxyUrl,

            Outputs.SyntheticMonitoringCheckSettingsHttpTlsConfig? tlsConfig,

            ImmutableArray<string> validHttpVersions,

            ImmutableArray<int> validStatusCodes)
        {
            BasicAuth = basicAuth;
            BearerToken = bearerToken;
            Body = body;
            CacheBustingQueryParamName = cacheBustingQueryParamName;
            FailIfBodyMatchesRegexps = failIfBodyMatchesRegexps;
            FailIfBodyNotMatchesRegexps = failIfBodyNotMatchesRegexps;
            FailIfHeaderMatchesRegexps = failIfHeaderMatchesRegexps;
            FailIfHeaderNotMatchesRegexps = failIfHeaderNotMatchesRegexps;
            FailIfNotSsl = failIfNotSsl;
            FailIfSsl = failIfSsl;
            Headers = headers;
            IpVersion = ipVersion;
            Method = method;
            NoFollowRedirects = noFollowRedirects;
            ProxyUrl = proxyUrl;
            TlsConfig = tlsConfig;
            ValidHttpVersions = validHttpVersions;
            ValidStatusCodes = validStatusCodes;
        }
    }
}
