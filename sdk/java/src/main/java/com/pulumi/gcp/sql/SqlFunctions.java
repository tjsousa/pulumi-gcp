// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
import com.pulumi.gcp.sql.inputs.GetBackupRunPlainArgs;
import com.pulumi.gcp.sql.inputs.GetCaCertsArgs;
import com.pulumi.gcp.sql.inputs.GetCaCertsPlainArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseInstancePlainArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesPlainArgs;
import com.pulumi.gcp.sql.inputs.GetDatabasePlainArgs;
import com.pulumi.gcp.sql.inputs.GetDatabasesArgs;
import com.pulumi.gcp.sql.inputs.GetDatabasesPlainArgs;
import com.pulumi.gcp.sql.outputs.GetBackupRunResult;
import com.pulumi.gcp.sql.outputs.GetCaCertsResult;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesResult;
import com.pulumi.gcp.sql.outputs.GetDatabaseResult;
import com.pulumi.gcp.sql.outputs.GetDatabasesResult;
import java.util.concurrent.CompletableFuture;

public final class SqlFunctions {
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
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
     *         final var backup = SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .mostRecent(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBackupRunResult> getBackupRun(GetBackupRunArgs args) {
        return getBackupRun(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
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
     *         final var backup = SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .mostRecent(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupRunResult> getBackupRunPlain(GetBackupRunPlainArgs args) {
        return getBackupRunPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
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
     *         final var backup = SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .mostRecent(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBackupRunResult> getBackupRun(GetBackupRunArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getBackupRun:getBackupRun", TypeShape.of(GetBackupRunResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
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
     *         final var backup = SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .mostRecent(true)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupRunResult> getBackupRunPlain(GetBackupRunPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getBackupRun:getBackupRun", TypeShape.of(GetBackupRunResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static Output<GetCaCertsResult> getCaCerts(GetCaCertsArgs args) {
        return getCaCerts(args, InvokeOptions.Empty);
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static CompletableFuture<GetCaCertsResult> getCaCertsPlain(GetCaCertsPlainArgs args) {
        return getCaCertsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static Output<GetCaCertsResult> getCaCerts(GetCaCertsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getCaCerts:getCaCerts", TypeShape.of(GetCaCertsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static CompletableFuture<GetCaCertsResult> getCaCertsPlain(GetCaCertsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getCaCerts:getCaCerts", TypeShape.of(GetCaCertsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a database in a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseArgs;
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
     *         final var qa = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;test-sql-database&#34;)
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args) {
        return getDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a database in a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseArgs;
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
     *         final var qa = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;test-sql-database&#34;)
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args) {
        return getDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a database in a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseArgs;
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
     *         final var qa = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;test-sql-database&#34;)
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getDatabase:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a database in a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseArgs;
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
     *         final var qa = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;test-sql-database&#34;)
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabase:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseInstanceResult> getDatabaseInstance(GetDatabaseInstanceArgs args) {
        return getDatabaseInstance(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstanceResult> getDatabaseInstancePlain(GetDatabaseInstancePlainArgs args) {
        return getDatabaseInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseInstanceResult> getDatabaseInstance(GetDatabaseInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getDatabaseInstance:getDatabaseInstance", TypeShape.of(GetDatabaseInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstanceResult> getDatabaseInstancePlain(GetDatabaseInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabaseInstance:getDatabaseInstance", TypeShape.of(GetDatabaseInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseInstancesResult> getDatabaseInstances() {
        return getDatabaseInstances(GetDatabaseInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstancesResult> getDatabaseInstancesPlain() {
        return getDatabaseInstancesPlain(GetDatabaseInstancesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseInstancesResult> getDatabaseInstances(GetDatabaseInstancesArgs args) {
        return getDatabaseInstances(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstancesResult> getDatabaseInstancesPlain(GetDatabaseInstancesPlainArgs args) {
        return getDatabaseInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseInstancesResult> getDatabaseInstances(GetDatabaseInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getDatabaseInstances:getDatabaseInstances", TypeShape.of(GetDatabaseInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a list of Cloud SQL instances in a project. You can also apply some filters over this list to get a more filtered list of Cloud SQL instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabaseInstancesArgs;
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
     *         final var qa = SqlFunctions.getDatabaseInstances(GetDatabaseInstancesArgs.builder()
     *             .project(&#34;test-project&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstancesResult> getDatabaseInstancesPlain(GetDatabaseInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabaseInstances:getDatabaseInstances", TypeShape.of(GetDatabaseInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a list of databases in a Cloud SQL instance.
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabasesArgs;
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
     *         final var qa = SqlFunctions.getDatabases(GetDatabasesArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabasesResult> getDatabases(GetDatabasesArgs args) {
        return getDatabases(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of databases in a Cloud SQL instance.
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabasesArgs;
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
     *         final var qa = SqlFunctions.getDatabases(GetDatabasesArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabasesResult> getDatabasesPlain(GetDatabasesPlainArgs args) {
        return getDatabasesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a list of databases in a Cloud SQL instance.
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabasesArgs;
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
     *         final var qa = SqlFunctions.getDatabases(GetDatabasesArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabasesResult> getDatabases(GetDatabasesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:sql/getDatabases:getDatabases", TypeShape.of(GetDatabasesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a list of databases in a Cloud SQL instance.
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.sql.SqlFunctions;
     * import com.pulumi.gcp.sql.inputs.GetDatabasesArgs;
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
     *         final var qa = SqlFunctions.getDatabases(GetDatabasesArgs.builder()
     *             .instance(google_sql_database_instance.main().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabasesResult> getDatabasesPlain(GetDatabasesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabases:getDatabases", TypeShape.of(GetDatabasesResult.class), args, Utilities.withVersion(options));
    }
}
