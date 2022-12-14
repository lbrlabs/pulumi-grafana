// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs;
import com.pulumi.grafana.inputs.SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs;
import com.pulumi.grafana.inputs.SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticMonitoringCheckSettingsDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticMonitoringCheckSettingsDnsArgs Empty = new SyntheticMonitoringCheckSettingsDnsArgs();

    @Import(name="ipVersion")
    private @Nullable Output<String> ipVersion;

    public Optional<Output<String>> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="recordType")
    private @Nullable Output<String> recordType;

    public Optional<Output<String>> recordType() {
        return Optional.ofNullable(this.recordType);
    }

    @Import(name="server")
    private @Nullable Output<String> server;

    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    @Import(name="sourceIpAddress")
    private @Nullable Output<String> sourceIpAddress;

    public Optional<Output<String>> sourceIpAddress() {
        return Optional.ofNullable(this.sourceIpAddress);
    }

    @Import(name="validRCodes")
    private @Nullable Output<List<String>> validRCodes;

    public Optional<Output<List<String>>> validRCodes() {
        return Optional.ofNullable(this.validRCodes);
    }

    @Import(name="validateAdditionalRrs")
    private @Nullable Output<List<SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs>> validateAdditionalRrs;

    public Optional<Output<List<SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs>>> validateAdditionalRrs() {
        return Optional.ofNullable(this.validateAdditionalRrs);
    }

    @Import(name="validateAnswerRrs")
    private @Nullable Output<SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs> validateAnswerRrs;

    public Optional<Output<SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs>> validateAnswerRrs() {
        return Optional.ofNullable(this.validateAnswerRrs);
    }

    @Import(name="validateAuthorityRrs")
    private @Nullable Output<SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs> validateAuthorityRrs;

    public Optional<Output<SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs>> validateAuthorityRrs() {
        return Optional.ofNullable(this.validateAuthorityRrs);
    }

    private SyntheticMonitoringCheckSettingsDnsArgs() {}

    private SyntheticMonitoringCheckSettingsDnsArgs(SyntheticMonitoringCheckSettingsDnsArgs $) {
        this.ipVersion = $.ipVersion;
        this.port = $.port;
        this.protocol = $.protocol;
        this.recordType = $.recordType;
        this.server = $.server;
        this.sourceIpAddress = $.sourceIpAddress;
        this.validRCodes = $.validRCodes;
        this.validateAdditionalRrs = $.validateAdditionalRrs;
        this.validateAnswerRrs = $.validateAnswerRrs;
        this.validateAuthorityRrs = $.validateAuthorityRrs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticMonitoringCheckSettingsDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticMonitoringCheckSettingsDnsArgs $;

        public Builder() {
            $ = new SyntheticMonitoringCheckSettingsDnsArgs();
        }

        public Builder(SyntheticMonitoringCheckSettingsDnsArgs defaults) {
            $ = new SyntheticMonitoringCheckSettingsDnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipVersion(@Nullable Output<String> ipVersion) {
            $.ipVersion = ipVersion;
            return this;
        }

        public Builder ipVersion(String ipVersion) {
            return ipVersion(Output.of(ipVersion));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder recordType(@Nullable Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        public Builder server(String server) {
            return server(Output.of(server));
        }

        public Builder sourceIpAddress(@Nullable Output<String> sourceIpAddress) {
            $.sourceIpAddress = sourceIpAddress;
            return this;
        }

        public Builder sourceIpAddress(String sourceIpAddress) {
            return sourceIpAddress(Output.of(sourceIpAddress));
        }

        public Builder validRCodes(@Nullable Output<List<String>> validRCodes) {
            $.validRCodes = validRCodes;
            return this;
        }

        public Builder validRCodes(List<String> validRCodes) {
            return validRCodes(Output.of(validRCodes));
        }

        public Builder validRCodes(String... validRCodes) {
            return validRCodes(List.of(validRCodes));
        }

        public Builder validateAdditionalRrs(@Nullable Output<List<SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs>> validateAdditionalRrs) {
            $.validateAdditionalRrs = validateAdditionalRrs;
            return this;
        }

        public Builder validateAdditionalRrs(List<SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs> validateAdditionalRrs) {
            return validateAdditionalRrs(Output.of(validateAdditionalRrs));
        }

        public Builder validateAdditionalRrs(SyntheticMonitoringCheckSettingsDnsValidateAdditionalRrArgs... validateAdditionalRrs) {
            return validateAdditionalRrs(List.of(validateAdditionalRrs));
        }

        public Builder validateAnswerRrs(@Nullable Output<SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs> validateAnswerRrs) {
            $.validateAnswerRrs = validateAnswerRrs;
            return this;
        }

        public Builder validateAnswerRrs(SyntheticMonitoringCheckSettingsDnsValidateAnswerRrsArgs validateAnswerRrs) {
            return validateAnswerRrs(Output.of(validateAnswerRrs));
        }

        public Builder validateAuthorityRrs(@Nullable Output<SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs> validateAuthorityRrs) {
            $.validateAuthorityRrs = validateAuthorityRrs;
            return this;
        }

        public Builder validateAuthorityRrs(SyntheticMonitoringCheckSettingsDnsValidateAuthorityRrsArgs validateAuthorityRrs) {
            return validateAuthorityRrs(Output.of(validateAuthorityRrs));
        }

        public SyntheticMonitoringCheckSettingsDnsArgs build() {
            return $;
        }
    }

}
