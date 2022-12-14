// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContactPointEmail {
    /**
     * @return The addresses to send emails to.
     * 
     */
    private List<String> addresses;
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    private @Nullable Boolean disableResolveMessage;
    /**
     * @return The templated content of the email. Defaults to ``.
     * 
     */
    private @Nullable String message;
    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,String> settings;
    /**
     * @return Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
     * 
     */
    private @Nullable Boolean singleEmail;
    /**
     * @return The templated subject line of the email. Defaults to ``.
     * 
     */
    private @Nullable String subject;
    /**
     * @return The UID of the contact point.
     * 
     */
    private @Nullable String uid;

    private ContactPointEmail() {}
    /**
     * @return The addresses to send emails to.
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }
    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    public Optional<Boolean> disableResolveMessage() {
        return Optional.ofNullable(this.disableResolveMessage);
    }
    /**
     * @return The templated content of the email. Defaults to ``.
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
     * @return Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
     * 
     */
    public Optional<Boolean> singleEmail() {
        return Optional.ofNullable(this.singleEmail);
    }
    /**
     * @return The templated subject line of the email. Defaults to ``.
     * 
     */
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }
    /**
     * @return The UID of the contact point.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactPointEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private @Nullable Boolean disableResolveMessage;
        private @Nullable String message;
        private @Nullable Map<String,String> settings;
        private @Nullable Boolean singleEmail;
        private @Nullable String subject;
        private @Nullable String uid;
        public Builder() {}
        public Builder(ContactPointEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.disableResolveMessage = defaults.disableResolveMessage;
    	      this.message = defaults.message;
    	      this.settings = defaults.settings;
    	      this.singleEmail = defaults.singleEmail;
    	      this.subject = defaults.subject;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
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
        public Builder singleEmail(@Nullable Boolean singleEmail) {
            this.singleEmail = singleEmail;
            return this;
        }
        @CustomType.Setter
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public ContactPointEmail build() {
            final var o = new ContactPointEmail();
            o.addresses = addresses;
            o.disableResolveMessage = disableResolveMessage;
            o.message = message;
            o.settings = settings;
            o.singleEmail = singleEmail;
            o.subject = subject;
            o.uid = uid;
            return o;
        }
    }
}
