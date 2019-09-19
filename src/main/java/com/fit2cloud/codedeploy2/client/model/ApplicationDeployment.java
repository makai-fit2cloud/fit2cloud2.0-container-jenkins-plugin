package com.fit2cloud.codedeploy2.client.model;

import java.io.Serializable;

public class ApplicationDeployment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.id
     *
     *
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.application_version_id
     *
     *
     */
    private String applicationVersionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.cluster_id
     *
     *
     */
    private String clusterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.cluster_role_id
     *
     *
     */
    private String clusterRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.cloud_server_id
     *
     *
     */
    private String cloudServerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.policy
     *
     *
     */
    private String policy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.start_time
     *
     *
     */
    private Long startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.end_time
     *
     *
     */
    private Long endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.status
     *
     *
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.progress
     *
     *
     */
    private Double progress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.description
     *
     *
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.user_id
     *
     *
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.workspace_id
     *
     *
     */
    private String workspaceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devops_application_deployment.created_time
     *
     *
     */
    private Long createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table devops_application_deployment
     *
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.id
     *
     * @return the value of devops_application_deployment.id
     *
     *
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.id
     *
     * @param id the value for devops_application_deployment.id
     *
     *
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.application_version_id
     *
     * @return the value of devops_application_deployment.application_version_id
     *
     *
     */
    public String getApplicationVersionId() {
        return applicationVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.application_version_id
     *
     * @param applicationVersionId the value for devops_application_deployment.application_version_id
     *
     *
     */
    public void setApplicationVersionId(String applicationVersionId) {
        this.applicationVersionId = applicationVersionId == null ? null : applicationVersionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.cluster_id
     *
     * @return the value of devops_application_deployment.cluster_id
     *
     *
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.cluster_id
     *
     * @param clusterId the value for devops_application_deployment.cluster_id
     *
     *
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.cluster_role_id
     *
     * @return the value of devops_application_deployment.cluster_role_id
     *
     *
     */
    public String getClusterRoleId() {
        return clusterRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.cluster_role_id
     *
     * @param clusterRoleId the value for devops_application_deployment.cluster_role_id
     *
     *
     */
    public void setClusterRoleId(String clusterRoleId) {
        this.clusterRoleId = clusterRoleId == null ? null : clusterRoleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.cloud_server_id
     *
     * @return the value of devops_application_deployment.cloud_server_id
     *
     *
     */
    public String getCloudServerId() {
        return cloudServerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.cloud_server_id
     *
     * @param cloudServerId the value for devops_application_deployment.cloud_server_id
     *
     *
     */
    public void setCloudServerId(String cloudServerId) {
        this.cloudServerId = cloudServerId == null ? null : cloudServerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.policy
     *
     * @return the value of devops_application_deployment.policy
     *
     *
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.policy
     *
     * @param policy the value for devops_application_deployment.policy
     *
     *
     */
    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.start_time
     *
     * @return the value of devops_application_deployment.start_time
     *
     *
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.start_time
     *
     * @param startTime the value for devops_application_deployment.start_time
     *
     *
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.end_time
     *
     * @return the value of devops_application_deployment.end_time
     *
     *
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.end_time
     *
     * @param endTime the value for devops_application_deployment.end_time
     *
     *
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.status
     *
     * @return the value of devops_application_deployment.status
     *
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.status
     *
     * @param status the value for devops_application_deployment.status
     *
     *
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.progress
     *
     * @return the value of devops_application_deployment.progress
     *
     *
     */
    public Double getProgress() {
        return progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.progress
     *
     * @param progress the value for devops_application_deployment.progress
     *
     *
     */
    public void setProgress(Double progress) {
        this.progress = progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.description
     *
     * @return the value of devops_application_deployment.description
     *
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.description
     *
     * @param description the value for devops_application_deployment.description
     *
     *
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.user_id
     *
     * @return the value of devops_application_deployment.user_id
     *
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.user_id
     *
     * @param userId the value for devops_application_deployment.user_id
     *
     *
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.workspace_id
     *
     * @return the value of devops_application_deployment.workspace_id
     *
     *
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.workspace_id
     *
     * @param workspaceId the value for devops_application_deployment.workspace_id
     *
     *
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId == null ? null : workspaceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devops_application_deployment.created_time
     *
     * @return the value of devops_application_deployment.created_time
     *
     *
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column devops_application_deployment.created_time
     *
     * @param createdTime the value for devops_application_deployment.created_time
     *
     *
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}
