// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AttachedClusterAuthorization {
    /**
     * @return Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    private @Nullable List<String> adminUsers;

    private AttachedClusterAuthorization() {}
    /**
     * @return Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    public List<String> adminUsers() {
        return this.adminUsers == null ? List.of() : this.adminUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedClusterAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> adminUsers;
        public Builder() {}
        public Builder(AttachedClusterAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsers = defaults.adminUsers;
        }

        @CustomType.Setter
        public Builder adminUsers(@Nullable List<String> adminUsers) {
            this.adminUsers = adminUsers;
            return this;
        }
        public Builder adminUsers(String... adminUsers) {
            return adminUsers(List.of(adminUsers));
        }
        public AttachedClusterAuthorization build() {
            final var o = new AttachedClusterAuthorization();
            o.adminUsers = adminUsers;
            return o;
        }
    }
}
