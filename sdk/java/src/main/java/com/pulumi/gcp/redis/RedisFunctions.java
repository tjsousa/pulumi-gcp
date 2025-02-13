// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
import com.pulumi.gcp.redis.inputs.GetInstancePlainArgs;
import com.pulumi.gcp.redis.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class RedisFunctions {
    /**
     * Get info about a Google Cloud Redis instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.redis.RedisFunctions;
     * import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
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
     *         final var myInstance = RedisFunctions.getInstance(GetInstanceArgs.builder()
     *             .name(&#34;my-redis-instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceMemorySizeGb&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.memorySizeGb()));
     *         ctx.export(&#34;instanceConnectMode&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.connectMode()));
     *         ctx.export(&#34;instanceAuthorizedNetwork&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.authorizedNetwork()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Cloud Redis instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.redis.RedisFunctions;
     * import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
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
     *         final var myInstance = RedisFunctions.getInstance(GetInstanceArgs.builder()
     *             .name(&#34;my-redis-instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceMemorySizeGb&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.memorySizeGb()));
     *         ctx.export(&#34;instanceConnectMode&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.connectMode()));
     *         ctx.export(&#34;instanceAuthorizedNetwork&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.authorizedNetwork()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args) {
        return getInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Cloud Redis instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.redis.RedisFunctions;
     * import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
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
     *         final var myInstance = RedisFunctions.getInstance(GetInstanceArgs.builder()
     *             .name(&#34;my-redis-instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceMemorySizeGb&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.memorySizeGb()));
     *         ctx.export(&#34;instanceConnectMode&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.connectMode()));
     *         ctx.export(&#34;instanceAuthorizedNetwork&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.authorizedNetwork()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:redis/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get info about a Google Cloud Redis instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.redis.RedisFunctions;
     * import com.pulumi.gcp.redis.inputs.GetInstanceArgs;
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
     *         final var myInstance = RedisFunctions.getInstance(GetInstanceArgs.builder()
     *             .name(&#34;my-redis-instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instanceMemorySizeGb&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.memorySizeGb()));
     *         ctx.export(&#34;instanceConnectMode&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.connectMode()));
     *         ctx.export(&#34;instanceAuthorizedNetwork&#34;, myInstance.applyValue(getInstanceResult -&gt; getInstanceResult.authorizedNetwork()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:redis/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}
