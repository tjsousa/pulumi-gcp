// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
import com.pulumi.gcp.secretmanager.inputs.GetSecretPlainArgs;
import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs;
import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessPlainArgs;
import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionPlainArgs;
import com.pulumi.gcp.secretmanager.outputs.GetSecretResult;
import com.pulumi.gcp.secretmanager.outputs.GetSecretVersionAccessResult;
import com.pulumi.gcp.secretmanager.outputs.GetSecretVersionResult;
import java.util.concurrent.CompletableFuture;

public final class SecretmanagerFunctions {
    /**
     * Use this data source to get information about a Secret Manager Secret
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
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
     *         final var qa = SecretmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .secretId(&#34;foobar&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Secret Manager Secret
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
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
     *         final var qa = SecretmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .secretId(&#34;foobar&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecretPlain(GetSecretPlainArgs args) {
        return getSecretPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Secret Manager Secret
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
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
     *         final var qa = SecretmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .secretId(&#34;foobar&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:secretmanager/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Secret Manager Secret
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
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
     *         final var qa = SecretmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .secretId(&#34;foobar&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecretPlain(GetSecretPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args) {
        return getSecretVersion(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersionPlain(GetSecretVersionPlainArgs args) {
        return getSecretVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:secretmanager/getSecretVersion:getSecretVersion", TypeShape.of(GetSecretVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersionPlain(GetSecretVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecretVersion:getSecretVersion", TypeShape.of(GetSecretVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersionAccess(GetSecretVersionAccessArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretVersionAccessResult> getSecretVersionAccess(GetSecretVersionAccessArgs args) {
        return getSecretVersionAccess(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersionAccess(GetSecretVersionAccessArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionAccessResult> getSecretVersionAccessPlain(GetSecretVersionAccessPlainArgs args) {
        return getSecretVersionAccessPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersionAccess(GetSecretVersionAccessArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSecretVersionAccessResult> getSecretVersionAccess(GetSecretVersionAccessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:secretmanager/getSecretVersionAccess:getSecretVersionAccess", TypeShape.of(GetSecretVersionAccessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.secretmanager.SecretmanagerFunctions;
     * import com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs;
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
     *         final var basic = SecretmanagerFunctions.getSecretVersionAccess(GetSecretVersionAccessArgs.builder()
     *             .secret(&#34;my-secret&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionAccessResult> getSecretVersionAccessPlain(GetSecretVersionAccessPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecretVersionAccess:getSecretVersionAccess", TypeShape.of(GetSecretVersionAccessResult.class), args, Utilities.withVersion(options));
    }
}
