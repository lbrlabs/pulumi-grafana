// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContactPointDiscord {
    /**
     * @return The URL of a custom avatar image to use. Defaults to ``.
     * 
     */
    private @Nullable String avatarUrl;
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    private @Nullable Boolean disableResolveMessage;
    /**
     * @return The templated content of the message. Defaults to ``.
     * 
     */
    private @Nullable String message;
    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,String> settings;
    /**
     * @return The UID of the contact point.
     * 
     */
    private @Nullable String uid;
    /**
     * @return The discord webhook URL.
     * 
     */
    private String url;
    /**
     * @return Whether to use the bot account&#39;s plain username instead of &#34;Grafana.&#34; Defaults to `false`.
     * 
     */
    private @Nullable Boolean useDiscordUsername;

    private ContactPointDiscord() {}
    /**
     * @return The URL of a custom avatar image to use. Defaults to ``.
     * 
     */
    public Optional<String> avatarUrl() {
        return Optional.ofNullable(this.avatarUrl);
    }
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    public Optional<Boolean> disableResolveMessage() {
        return Optional.ofNullable(this.disableResolveMessage);
    }
    /**
     * @return The templated content of the message. Defaults to ``.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    public Map<String,String> settings() {
        return this.settings == null ? Map.of() : this.settings;
    }
    /**
     * @return The UID of the contact point.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * @return The discord webhook URL.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Whether to use the bot account&#39;s plain username instead of &#34;Grafana.&#34; Defaults to `false`.
     * 
     */
    public Optional<Boolean> useDiscordUsername() {
        return Optional.ofNullable(this.useDiscordUsername);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactPointDiscord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String avatarUrl;
        private @Nullable Boolean disableResolveMessage;
        private @Nullable String message;
        private @Nullable Map<String,String> settings;
        private @Nullable String uid;
        private String url;
        private @Nullable Boolean useDiscordUsername;
        public Builder() {}
        public Builder(ContactPointDiscord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avatarUrl = defaults.avatarUrl;
    	      this.disableResolveMessage = defaults.disableResolveMessage;
    	      this.message = defaults.message;
    	      this.settings = defaults.settings;
    	      this.uid = defaults.uid;
    	      this.url = defaults.url;
    	      this.useDiscordUsername = defaults.useDiscordUsername;
        }

        @CustomType.Setter
        public Builder avatarUrl(@Nullable String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        @CustomType.Setter
        public Builder disableResolveMessage(@Nullable Boolean disableResolveMessage) {
            this.disableResolveMessage = disableResolveMessage;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable Map<String,String> settings) {
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder useDiscordUsername(@Nullable Boolean useDiscordUsername) {
            this.useDiscordUsername = useDiscordUsername;
            return this;
        }
        public ContactPointDiscord build() {
            final var o = new ContactPointDiscord();
            o.avatarUrl = avatarUrl;
            o.disableResolveMessage = disableResolveMessage;
            o.message = message;
            o.settings = settings;
            o.uid = uid;
            o.url = url;
            o.useDiscordUsername = useDiscordUsername;
            return o;
        }
    }
}
