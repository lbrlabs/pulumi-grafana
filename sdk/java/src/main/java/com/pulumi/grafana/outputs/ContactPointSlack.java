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
public final class ContactPointSlack {
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    private @Nullable Boolean disableResolveMessage;
    /**
     * @return Use this to override the Slack API endpoint URL to send requests to.
     * 
     */
    private @Nullable String endpointUrl;
    /**
     * @return The name of a Slack workspace emoji to use as the bot icon.
     * 
     */
    private @Nullable String iconEmoji;
    /**
     * @return A URL of an image to use as the bot icon.
     * 
     */
    private @Nullable String iconUrl;
    /**
     * @return Describes how to ping the slack channel that messages are being sent to. Options are `here` for an @here ping, `channel` for @channel, or empty for no ping.
     * 
     */
    private @Nullable String mentionChannel;
    /**
     * @return Comma-separated list of groups to mention in the message.
     * 
     */
    private @Nullable String mentionGroups;
    /**
     * @return Comma-separated list of users to mention in the message.
     * 
     */
    private @Nullable String mentionUsers;
    /**
     * @return Channel, private group, or IM channel (can be an encoded ID or a name) to send messages to.
     * 
     */
    private @Nullable String recipient;
    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,String> settings;
    /**
     * @return Templated content of the message.
     * 
     */
    private @Nullable String text;
    /**
     * @return Templated title of the message.
     * 
     */
    private @Nullable String title;
    /**
     * @return A Slack API token,for sending messages directly without the webhook method.
     * 
     */
    private @Nullable String token;
    /**
     * @return The UID of the contact point.
     * 
     */
    private @Nullable String uid;
    /**
     * @return A Slack webhook URL,for sending messages via the webhook method.
     * 
     */
    private @Nullable String url;
    /**
     * @return Username for the bot to use.
     * 
     */
    private @Nullable String username;

    private ContactPointSlack() {}
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    public Optional<Boolean> disableResolveMessage() {
        return Optional.ofNullable(this.disableResolveMessage);
    }
    /**
     * @return Use this to override the Slack API endpoint URL to send requests to.
     * 
     */
    public Optional<String> endpointUrl() {
        return Optional.ofNullable(this.endpointUrl);
    }
    /**
     * @return The name of a Slack workspace emoji to use as the bot icon.
     * 
     */
    public Optional<String> iconEmoji() {
        return Optional.ofNullable(this.iconEmoji);
    }
    /**
     * @return A URL of an image to use as the bot icon.
     * 
     */
    public Optional<String> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    /**
     * @return Describes how to ping the slack channel that messages are being sent to. Options are `here` for an @here ping, `channel` for @channel, or empty for no ping.
     * 
     */
    public Optional<String> mentionChannel() {
        return Optional.ofNullable(this.mentionChannel);
    }
    /**
     * @return Comma-separated list of groups to mention in the message.
     * 
     */
    public Optional<String> mentionGroups() {
        return Optional.ofNullable(this.mentionGroups);
    }
    /**
     * @return Comma-separated list of users to mention in the message.
     * 
     */
    public Optional<String> mentionUsers() {
        return Optional.ofNullable(this.mentionUsers);
    }
    /**
     * @return Channel, private group, or IM channel (can be an encoded ID or a name) to send messages to.
     * 
     */
    public Optional<String> recipient() {
        return Optional.ofNullable(this.recipient);
    }
    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    public Map<String,String> settings() {
        return this.settings == null ? Map.of() : this.settings;
    }
    /**
     * @return Templated content of the message.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    /**
     * @return Templated title of the message.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return A Slack API token,for sending messages directly without the webhook method.
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return The UID of the contact point.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * @return A Slack webhook URL,for sending messages via the webhook method.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return Username for the bot to use.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactPointSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableResolveMessage;
        private @Nullable String endpointUrl;
        private @Nullable String iconEmoji;
        private @Nullable String iconUrl;
        private @Nullable String mentionChannel;
        private @Nullable String mentionGroups;
        private @Nullable String mentionUsers;
        private @Nullable String recipient;
        private @Nullable Map<String,String> settings;
        private @Nullable String text;
        private @Nullable String title;
        private @Nullable String token;
        private @Nullable String uid;
        private @Nullable String url;
        private @Nullable String username;
        public Builder() {}
        public Builder(ContactPointSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableResolveMessage = defaults.disableResolveMessage;
    	      this.endpointUrl = defaults.endpointUrl;
    	      this.iconEmoji = defaults.iconEmoji;
    	      this.iconUrl = defaults.iconUrl;
    	      this.mentionChannel = defaults.mentionChannel;
    	      this.mentionGroups = defaults.mentionGroups;
    	      this.mentionUsers = defaults.mentionUsers;
    	      this.recipient = defaults.recipient;
    	      this.settings = defaults.settings;
    	      this.text = defaults.text;
    	      this.title = defaults.title;
    	      this.token = defaults.token;
    	      this.uid = defaults.uid;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder disableResolveMessage(@Nullable Boolean disableResolveMessage) {
            this.disableResolveMessage = disableResolveMessage;
            return this;
        }
        @CustomType.Setter
        public Builder endpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        @CustomType.Setter
        public Builder iconEmoji(@Nullable String iconEmoji) {
            this.iconEmoji = iconEmoji;
            return this;
        }
        @CustomType.Setter
        public Builder iconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        @CustomType.Setter
        public Builder mentionChannel(@Nullable String mentionChannel) {
            this.mentionChannel = mentionChannel;
            return this;
        }
        @CustomType.Setter
        public Builder mentionGroups(@Nullable String mentionGroups) {
            this.mentionGroups = mentionGroups;
            return this;
        }
        @CustomType.Setter
        public Builder mentionUsers(@Nullable String mentionUsers) {
            this.mentionUsers = mentionUsers;
            return this;
        }
        @CustomType.Setter
        public Builder recipient(@Nullable String recipient) {
            this.recipient = recipient;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable Map<String,String> settings) {
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ContactPointSlack build() {
            final var o = new ContactPointSlack();
            o.disableResolveMessage = disableResolveMessage;
            o.endpointUrl = endpointUrl;
            o.iconEmoji = iconEmoji;
            o.iconUrl = iconUrl;
            o.mentionChannel = mentionChannel;
            o.mentionGroups = mentionGroups;
            o.mentionUsers = mentionUsers;
            o.recipient = recipient;
            o.settings = settings;
            o.text = text;
            o.title = title;
            o.token = token;
            o.uid = uid;
            o.url = url;
            o.username = username;
            return o;
        }
    }
}
