// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOnCallSlackChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOnCallSlackChannelArgs Empty = new GetOnCallSlackChannelArgs();

    /**
     * The Slack channel name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Slack channel name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetOnCallSlackChannelArgs() {}

    private GetOnCallSlackChannelArgs(GetOnCallSlackChannelArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOnCallSlackChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOnCallSlackChannelArgs $;

        public Builder() {
            $ = new GetOnCallSlackChannelArgs();
        }

        public Builder(GetOnCallSlackChannelArgs defaults) {
            $ = new GetOnCallSlackChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Slack channel name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Slack channel name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetOnCallSlackChannelArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
