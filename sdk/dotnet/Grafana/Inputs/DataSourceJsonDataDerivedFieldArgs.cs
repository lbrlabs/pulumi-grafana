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

    public sealed class DataSourceJsonDataDerivedFieldArgs : global::Pulumi.ResourceArgs
    {
        [Input("datasourceUid")]
        public Input<string>? DatasourceUid { get; set; }

        [Input("matcherRegex")]
        public Input<string>? MatcherRegex { get; set; }

        /// <summary>
        /// A unique name for the data source.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL for the data source. The type of URL required varies depending on the chosen data source type.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public DataSourceJsonDataDerivedFieldArgs()
        {
        }
        public static new DataSourceJsonDataDerivedFieldArgs Empty => new DataSourceJsonDataDerivedFieldArgs();
    }
}