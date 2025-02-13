// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupPlanRetentionPolicy {
    /**
     * @return Minimum age for a Backup created via this BackupPlan (in days).
     * Must be an integer value between 0-90 (inclusive).
     * A Backup created under this BackupPlan will not be deletable
     * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
     * Updating this field of a BackupPlan does not affect existing Backups.
     * Backups created after a successful update will inherit this new value.
     * 
     */
    private @Nullable Integer backupDeleteLockDays;
    /**
     * @return The default maximum age of a Backup created via this BackupPlan.
     * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
     * a Backup created under this BackupPlan will be automatically deleted
     * after its age reaches (createTime + backupRetainDays).
     * If not specified, Backups created under this BackupPlan will NOT be
     * subject to automatic deletion. Updating this field does NOT affect
     * existing Backups under it. Backups created AFTER a successful update
     * will automatically pick up the new value.
     * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
     * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
     * 
     */
    private @Nullable Integer backupRetainDays;
    /**
     * @return This flag denotes whether the retention policy of this BackupPlan is locked.
     * If set to True, no further update is allowed on this policy, including
     * the locked field itself.
     * 
     */
    private @Nullable Boolean locked;

    private BackupPlanRetentionPolicy() {}
    /**
     * @return Minimum age for a Backup created via this BackupPlan (in days).
     * Must be an integer value between 0-90 (inclusive).
     * A Backup created under this BackupPlan will not be deletable
     * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
     * Updating this field of a BackupPlan does not affect existing Backups.
     * Backups created after a successful update will inherit this new value.
     * 
     */
    public Optional<Integer> backupDeleteLockDays() {
        return Optional.ofNullable(this.backupDeleteLockDays);
    }
    /**
     * @return The default maximum age of a Backup created via this BackupPlan.
     * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
     * a Backup created under this BackupPlan will be automatically deleted
     * after its age reaches (createTime + backupRetainDays).
     * If not specified, Backups created under this BackupPlan will NOT be
     * subject to automatic deletion. Updating this field does NOT affect
     * existing Backups under it. Backups created AFTER a successful update
     * will automatically pick up the new value.
     * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
     * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
     * 
     */
    public Optional<Integer> backupRetainDays() {
        return Optional.ofNullable(this.backupRetainDays);
    }
    /**
     * @return This flag denotes whether the retention policy of this BackupPlan is locked.
     * If set to True, no further update is allowed on this policy, including
     * the locked field itself.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanRetentionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer backupDeleteLockDays;
        private @Nullable Integer backupRetainDays;
        private @Nullable Boolean locked;
        public Builder() {}
        public Builder(BackupPlanRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupDeleteLockDays = defaults.backupDeleteLockDays;
    	      this.backupRetainDays = defaults.backupRetainDays;
    	      this.locked = defaults.locked;
        }

        @CustomType.Setter
        public Builder backupDeleteLockDays(@Nullable Integer backupDeleteLockDays) {
            this.backupDeleteLockDays = backupDeleteLockDays;
            return this;
        }
        @CustomType.Setter
        public Builder backupRetainDays(@Nullable Integer backupRetainDays) {
            this.backupRetainDays = backupRetainDays;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        public BackupPlanRetentionPolicy build() {
            final var o = new BackupPlanRetentionPolicy();
            o.backupDeleteLockDays = backupDeleteLockDays;
            o.backupRetainDays = backupRetainDays;
            o.locked = locked;
            return o;
        }
    }
}
