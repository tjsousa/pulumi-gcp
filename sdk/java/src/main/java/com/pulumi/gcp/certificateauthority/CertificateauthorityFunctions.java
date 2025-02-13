// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityPlainArgs;
import com.pulumi.gcp.certificateauthority.outputs.GetAuthorityResult;
import java.util.concurrent.CompletableFuture;

public final class CertificateauthorityFunctions {
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorityResult> getAuthority() {
        return getAuthority(GetAuthorityArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorityResult> getAuthorityPlain() {
        return getAuthorityPlain(GetAuthorityPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorityResult> getAuthority(GetAuthorityArgs args) {
        return getAuthority(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorityResult> getAuthorityPlain(GetAuthorityPlainArgs args) {
        return getAuthorityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorityResult> getAuthority(GetAuthorityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:certificateauthority/getAuthority:getAuthority", TypeShape.of(GetAuthorityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get info about a Google CAS Certificate Authority.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions;
     * import com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var default = CertificateauthorityFunctions.getAuthority(GetAuthorityArgs.builder()
     *             .location(&#34;us-west1&#34;)
     *             .pool(&#34;pool-name&#34;)
     *             .certificateAuthorityId(&#34;ca-id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;csr&#34;, default_.pemCsr());
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorityResult> getAuthorityPlain(GetAuthorityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:certificateauthority/getAuthority:getAuthority", TypeShape.of(GetAuthorityResult.class), args, Utilities.withVersion(options));
    }
}
