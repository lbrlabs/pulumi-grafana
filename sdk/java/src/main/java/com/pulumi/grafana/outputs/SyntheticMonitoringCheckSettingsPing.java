// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticMonitoringCheckSettingsPing {
    private @Nullable Boolean dontFragment;
    private @Nullable String ipVersion;
    private @Nullable Integer payloadSize;
    private @Nullable String sourceIpAddress;

    private SyntheticMonitoringCheckSettingsPing() {}
    public Optional<Boolean> dontFragment() {
        return Optional.ofNullable(this.dontFragment);
    }
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }
    public Optional<Integer> payloadSize() {
        return Optional.ofNullable(this.payloadSize);
    }
    public Optional<String> sourceIpAddress() {
        return Optional.ofNullable(this.sourceIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticMonitoringCheckSettingsPing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean dontFragment;
        private @Nullable String ipVersion;
        private @Nullable Integer payloadSize;
        private @Nullable String sourceIpAddress;
        public Builder() {}
        public Builder(SyntheticMonitoringCheckSettingsPing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dontFragment = defaults.dontFragment;
    	      this.ipVersion = defaults.ipVersion;
    	      this.payloadSize = defaults.payloadSize;
    	      this.sourceIpAddress = defaults.sourceIpAddress;
        }

        @CustomType.Setter
        public Builder dontFragment(@Nullable Boolean dontFragment) {
            this.dontFragment = dontFragment;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(@Nullable String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder payloadSize(@Nullable Integer payloadSize) {
            this.payloadSize = payloadSize;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpAddress(@Nullable String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }
        public SyntheticMonitoringCheckSettingsPing build() {
            final var o = new SyntheticMonitoringCheckSettingsPing();
            o.dontFragment = dontFragment;
            o.ipVersion = ipVersion;
            o.payloadSize = payloadSize;
            o.sourceIpAddress = sourceIpAddress;
            return o;
        }
    }
}
