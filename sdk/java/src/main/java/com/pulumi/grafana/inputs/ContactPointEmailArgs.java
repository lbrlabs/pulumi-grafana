// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactPointEmailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactPointEmailArgs Empty = new ContactPointEmailArgs();

    /**
     * The addresses to send emails to.
     * 
     */
    @Import(name="addresses", required=true)
    private Output<List<String>> addresses;

    /**
     * @return The addresses to send emails to.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }

    /**
     * Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    @Import(name="disableResolveMessage")
    private @Nullable Output<Boolean> disableResolveMessage;

    /**
     * @return Whether to disable sending resolve messages. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableResolveMessage() {
        return Optional.ofNullable(this.disableResolveMessage);
    }

    /**
     * The templated content of the email. Defaults to ``.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The templated content of the email. Defaults to ``.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<Map<String,String>> settings;

    /**
     * @return Additional custom properties to attach to the notifier. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,String>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
     * 
     */
    @Import(name="singleEmail")
    private @Nullable Output<Boolean> singleEmail;

    /**
     * @return Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> singleEmail() {
        return Optional.ofNullable(this.singleEmail);
    }

    /**
     * The templated subject line of the email. Defaults to ``.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return The templated subject line of the email. Defaults to ``.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * The UID of the contact point.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return The UID of the contact point.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private ContactPointEmailArgs() {}

    private ContactPointEmailArgs(ContactPointEmailArgs $) {
        this.addresses = $.addresses;
        this.disableResolveMessage = $.disableResolveMessage;
        this.message = $.message;
        this.settings = $.settings;
        this.singleEmail = $.singleEmail;
        this.subject = $.subject;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactPointEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactPointEmailArgs $;

        public Builder() {
            $ = new ContactPointEmailArgs();
        }

        public Builder(ContactPointEmailArgs defaults) {
            $ = new ContactPointEmailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses The addresses to send emails to.
         * 
         * @return builder
         * 
         */
        public Builder addresses(Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses The addresses to send emails to.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses The addresses to send emails to.
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param disableResolveMessage Whether to disable sending resolve messages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableResolveMessage(@Nullable Output<Boolean> disableResolveMessage) {
            $.disableResolveMessage = disableResolveMessage;
            return this;
        }

        /**
         * @param disableResolveMessage Whether to disable sending resolve messages. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableResolveMessage(Boolean disableResolveMessage) {
            return disableResolveMessage(Output.of(disableResolveMessage));
        }

        /**
         * @param message The templated content of the email. Defaults to ``.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The templated content of the email. Defaults to ``.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param settings Additional custom properties to attach to the notifier. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<Map<String,String>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Additional custom properties to attach to the notifier. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder settings(Map<String,String> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param singleEmail Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder singleEmail(@Nullable Output<Boolean> singleEmail) {
            $.singleEmail = singleEmail;
            return this;
        }

        /**
         * @param singleEmail Whether to send a single email CC&#39;ing all addresses, rather than a separate email to each address. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder singleEmail(Boolean singleEmail) {
            return singleEmail(Output.of(singleEmail));
        }

        /**
         * @param subject The templated subject line of the email. Defaults to ``.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The templated subject line of the email. Defaults to ``.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param uid The UID of the contact point.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The UID of the contact point.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public ContactPointEmailArgs build() {
            $.addresses = Objects.requireNonNull($.addresses, "expected parameter 'addresses' to be non-null");
            return $;
        }
    }

}
