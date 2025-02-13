// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs();

    /**
     * The value should exactly match contents of exactMatch. Only one of exactMatch,
     * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="exactMatch")
    private @Nullable Output<String> exactMatch;

    /**
     * @return The value should exactly match contents of exactMatch. Only one of exactMatch,
     * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<String>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request&#39;s
     * authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a
     * request&#39;s method, use the headerName &#34;:method&#34;.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return The name of the HTTP header to match. For matching against the HTTP request&#39;s
     * authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a
     * request&#39;s method, use the headerName &#34;:method&#34;.
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    @Import(name="invertMatch")
    private @Nullable Output<Boolean> invertMatch;

    /**
     * @return If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> invertMatch() {
        return Optional.ofNullable(this.invertMatch);
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    /**
     * @return The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * A header with the contents of headerName must exist. The match takes place
     * whether or not the request&#39;s header has a value or not. Only one of exactMatch,
     * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="presentMatch")
    private @Nullable Output<Boolean> presentMatch;

    /**
     * @return A header with the contents of headerName must exist. The match takes place
     * whether or not the request&#39;s header has a value or not. Only one of exactMatch,
     * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<Boolean>> presentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }

    /**
     * The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]
     * * -3 will match
     * * 0 will not match
     * * 0.25 will not match
     * * -3someString will not match.
     *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     *   rangeMatch must be set.
     *   Structure is documented below.
     * 
     */
    @Import(name="rangeMatch")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs> rangeMatch;

    /**
     * @return The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]
     * * -3 will match
     * * 0 will not match
     * * 0.25 will not match
     * * -3someString will not match.
     *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     *   rangeMatch must be set.
     *   Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs>> rangeMatch() {
        return Optional.ofNullable(this.rangeMatch);
    }

    /**
     * The value of the header must match the regular expression specified in
     * regexMatch. For regular expression grammar, please see:
     * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
     * specified in the HTTP request, use a headerMatch with headerName set to PORT and
     * a regular expression that satisfies the RFC2616 Host header&#39;s port specifier.
     * Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     * rangeMatch must be set.
     * 
     */
    @Import(name="regexMatch")
    private @Nullable Output<String> regexMatch;

    /**
     * @return The value of the header must match the regular expression specified in
     * regexMatch. For regular expression grammar, please see:
     * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
     * specified in the HTTP request, use a headerMatch with headerName set to PORT and
     * a regular expression that satisfies the RFC2616 Host header&#39;s port specifier.
     * Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     * rangeMatch must be set.
     * 
     */
    public Optional<Output<String>> regexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="suffixMatch")
    private @Nullable Output<String> suffixMatch;

    /**
     * @return The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<Output<String>> suffixMatch() {
        return Optional.ofNullable(this.suffixMatch);
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs() {}

    private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs $) {
        this.exactMatch = $.exactMatch;
        this.headerName = $.headerName;
        this.invertMatch = $.invertMatch;
        this.prefixMatch = $.prefixMatch;
        this.presentMatch = $.presentMatch;
        this.rangeMatch = $.rangeMatch;
        this.regexMatch = $.regexMatch;
        this.suffixMatch = $.suffixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactMatch The value should exactly match contents of exactMatch. Only one of exactMatch,
         * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        /**
         * @param exactMatch The value should exactly match contents of exactMatch. Only one of exactMatch,
         * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(String exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        /**
         * @param headerName The name of the HTTP header to match. For matching against the HTTP request&#39;s
         * authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a
         * request&#39;s method, use the headerName &#34;:method&#34;.
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName The name of the HTTP header to match. For matching against the HTTP request&#39;s
         * authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a
         * request&#39;s method, use the headerName &#34;:method&#34;.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param invertMatch If set to false, the headerMatch is considered a match if the match criteria
         * above are met. If set to true, the headerMatch is considered a match if the
         * match criteria above are NOT met. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            $.invertMatch = invertMatch;
            return this;
        }

        /**
         * @param invertMatch If set to false, the headerMatch is considered a match if the match criteria
         * above are met. If set to true, the headerMatch is considered a match if the
         * match criteria above are NOT met. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder invertMatch(Boolean invertMatch) {
            return invertMatch(Output.of(invertMatch));
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        /**
         * @param presentMatch A header with the contents of headerName must exist. The match takes place
         * whether or not the request&#39;s header has a value or not. Only one of exactMatch,
         * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            $.presentMatch = presentMatch;
            return this;
        }

        /**
         * @param presentMatch A header with the contents of headerName must exist. The match takes place
         * whether or not the request&#39;s header has a value or not. Only one of exactMatch,
         * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(Boolean presentMatch) {
            return presentMatch(Output.of(presentMatch));
        }

        /**
         * @param rangeMatch The header value must be an integer and its value must be in the range specified
         * in rangeMatch. If the header does not contain an integer, number or is empty,
         * the match fails. For example for a range [-5, 0]
         * * -3 will match
         * * 0 will not match
         * * 0.25 will not match
         * * -3someString will not match.
         *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
         *   rangeMatch must be set.
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangeMatch(@Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs> rangeMatch) {
            $.rangeMatch = rangeMatch;
            return this;
        }

        /**
         * @param rangeMatch The header value must be an integer and its value must be in the range specified
         * in rangeMatch. If the header does not contain an integer, number or is empty,
         * the match fails. For example for a range [-5, 0]
         * * -3 will match
         * * 0 will not match
         * * 0.25 will not match
         * * -3someString will not match.
         *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
         *   rangeMatch must be set.
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangeMatch(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchArgs rangeMatch) {
            return rangeMatch(Output.of(rangeMatch));
        }

        /**
         * @param regexMatch The value of the header must match the regular expression specified in
         * regexMatch. For regular expression grammar, please see:
         * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
         * specified in the HTTP request, use a headerMatch with headerName set to PORT and
         * a regular expression that satisfies the RFC2616 Host header&#39;s port specifier.
         * Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
         * rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        /**
         * @param regexMatch The value of the header must match the regular expression specified in
         * regexMatch. For regular expression grammar, please see:
         * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
         * specified in the HTTP request, use a headerMatch with headerName set to PORT and
         * a regular expression that satisfies the RFC2616 Host header&#39;s port specifier.
         * Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
         * rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(String regexMatch) {
            return regexMatch(Output.of(regexMatch));
        }

        /**
         * @param suffixMatch The value of the header must end with the contents of suffixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            $.suffixMatch = suffixMatch;
            return this;
        }

        /**
         * @param suffixMatch The value of the header must end with the contents of suffixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder suffixMatch(String suffixMatch) {
            return suffixMatch(Output.of(suffixMatch));
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            return $;
        }
    }

}
