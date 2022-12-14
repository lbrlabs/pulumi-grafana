// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticMonitoringCheckSettingsHttpTlsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticMonitoringCheckSettingsHttpTlsConfigArgs Empty = new SyntheticMonitoringCheckSettingsHttpTlsConfigArgs();

    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    @Import(name="insecureSkipVerify")
    private @Nullable Output<Boolean> insecureSkipVerify;

    public Optional<Output<Boolean>> insecureSkipVerify() {
        return Optional.ofNullable(this.insecureSkipVerify);
    }

    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    private SyntheticMonitoringCheckSettingsHttpTlsConfigArgs() {}

    private SyntheticMonitoringCheckSettingsHttpTlsConfigArgs(SyntheticMonitoringCheckSettingsHttpTlsConfigArgs $) {
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.insecureSkipVerify = $.insecureSkipVerify;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticMonitoringCheckSettingsHttpTlsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticMonitoringCheckSettingsHttpTlsConfigArgs $;

        public Builder() {
            $ = new SyntheticMonitoringCheckSettingsHttpTlsConfigArgs();
        }

        public Builder(SyntheticMonitoringCheckSettingsHttpTlsConfigArgs defaults) {
            $ = new SyntheticMonitoringCheckSettingsHttpTlsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        public Builder insecureSkipVerify(@Nullable Output<Boolean> insecureSkipVerify) {
            $.insecureSkipVerify = insecureSkipVerify;
            return this;
        }

        public Builder insecureSkipVerify(Boolean insecureSkipVerify) {
            return insecureSkipVerify(Output.of(insecureSkipVerify));
        }

        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public SyntheticMonitoringCheckSettingsHttpTlsConfigArgs build() {
            return $;
        }
    }

}
