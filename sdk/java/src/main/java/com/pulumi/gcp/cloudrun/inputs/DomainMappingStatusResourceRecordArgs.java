// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingStatusResourceRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusResourceRecordArgs Empty = new DomainMappingStatusResourceRecordArgs();

    /**
     * Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Output)
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * 
     */
    @Import(name="rrdata")
    private @Nullable Output<String> rrdata;

    /**
     * @return (Output)
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * 
     */
    public Optional<Output<String>> rrdata() {
        return Optional.ofNullable(this.rrdata);
    }

    /**
     * Resource record type. Example: `AAAA`.
     * Possible values are `A`, `AAAA`, and `CNAME`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Resource record type. Example: `AAAA`.
     * Possible values are `A`, `AAAA`, and `CNAME`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DomainMappingStatusResourceRecordArgs() {}

    private DomainMappingStatusResourceRecordArgs(DomainMappingStatusResourceRecordArgs $) {
        this.name = $.name;
        this.rrdata = $.rrdata;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingStatusResourceRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingStatusResourceRecordArgs $;

        public Builder() {
            $ = new DomainMappingStatusResourceRecordArgs();
        }

        public Builder(DomainMappingStatusResourceRecordArgs defaults) {
            $ = new DomainMappingStatusResourceRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rrdata (Output)
         * Data for this record. Values vary by record type, as defined in RFC 1035
         * (section 5) and RFC 1034 (section 3.6.1).
         * 
         * @return builder
         * 
         */
        public Builder rrdata(@Nullable Output<String> rrdata) {
            $.rrdata = rrdata;
            return this;
        }

        /**
         * @param rrdata (Output)
         * Data for this record. Values vary by record type, as defined in RFC 1035
         * (section 5) and RFC 1034 (section 3.6.1).
         * 
         * @return builder
         * 
         */
        public Builder rrdata(String rrdata) {
            return rrdata(Output.of(rrdata));
        }

        /**
         * @param type Resource record type. Example: `AAAA`.
         * Possible values are `A`, `AAAA`, and `CNAME`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Resource record type. Example: `AAAA`.
         * Possible values are `A`, `AAAA`, and `CNAME`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainMappingStatusResourceRecordArgs build() {
            return $;
        }
    }

}
