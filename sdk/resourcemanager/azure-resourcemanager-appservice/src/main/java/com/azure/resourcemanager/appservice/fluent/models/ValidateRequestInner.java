// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ValidateResourceTypes;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource validation request content. */
@Fluent
public final class ValidateRequestInner {
    /*
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private ValidateResourceTypes type;

    /*
     * Expected location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Properties of the resource to validate.
     */
    @JsonProperty(value = "properties", required = true)
    private ValidatePropertiesInner innerProperties = new ValidatePropertiesInner();

    /**
     * Get the name property: Resource name to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     *
     * @param name the name value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     *
     * @return the type value.
     */
    public ValidateResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     *
     * @param type the type value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withType(ValidateResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location property: Expected location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Expected location of the resource.
     *
     * @param location the location value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the resource to validate.
     *
     * @return the innerProperties value.
     */
    private ValidatePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.innerProperties() == null ? null : this.innerProperties().serverFarmId();
    }

    /**
     * Set the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withServerFarmId(String serverFarmId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withServerFarmId(serverFarmId);
        return this;
    }

    /**
     * Get the skuName property: Name of the target SKU for the App Service plan.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.innerProperties() == null ? null : this.innerProperties().skuName();
    }

    /**
     * Set the skuName property: Name of the target SKU for the App Service plan.
     *
     * @param skuName the skuName value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withSkuName(String skuName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withSkuName(skuName);
        return this;
    }

    /**
     * Get the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the needLinuxWorkers value.
     */
    public Boolean needLinuxWorkers() {
        return this.innerProperties() == null ? null : this.innerProperties().needLinuxWorkers();
    }

    /**
     * Set the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param needLinuxWorkers the needLinuxWorkers value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withNeedLinuxWorkers(Boolean needLinuxWorkers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withNeedLinuxWorkers(needLinuxWorkers);
        return this;
    }

    /**
     * Get the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.innerProperties() == null ? null : this.innerProperties().isSpot();
    }

    /**
     * Set the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isSpot the isSpot value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withIsSpot(Boolean isSpot) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withIsSpot(isSpot);
        return this;
    }

    /**
     * Get the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.innerProperties() == null ? null : this.innerProperties().capacity();
    }

    /**
     * Set the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @param capacity the capacity value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withCapacity(Integer capacity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withCapacity(capacity);
        return this;
    }

    /**
     * Get the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().hostingEnvironment();
    }

    /**
     * Set the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withHostingEnvironment(String hostingEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withHostingEnvironment(hostingEnvironment);
        return this;
    }

    /**
     * Get the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.innerProperties() == null ? null : this.innerProperties().isXenon();
    }

    /**
     * Set the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @param isXenon the isXenon value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withIsXenon(Boolean isXenon) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withIsXenon(isXenon);
        return this;
    }

    /**
     * Get the containerRegistryBaseUrl property: Base URL of the container registry.
     *
     * @return the containerRegistryBaseUrl value.
     */
    public String containerRegistryBaseUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().containerRegistryBaseUrl();
    }

    /**
     * Set the containerRegistryBaseUrl property: Base URL of the container registry.
     *
     * @param containerRegistryBaseUrl the containerRegistryBaseUrl value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerRegistryBaseUrl(String containerRegistryBaseUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerRegistryBaseUrl(containerRegistryBaseUrl);
        return this;
    }

    /**
     * Get the containerRegistryUsername property: Username for to access the container registry.
     *
     * @return the containerRegistryUsername value.
     */
    public String containerRegistryUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().containerRegistryUsername();
    }

    /**
     * Set the containerRegistryUsername property: Username for to access the container registry.
     *
     * @param containerRegistryUsername the containerRegistryUsername value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerRegistryUsername(String containerRegistryUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerRegistryUsername(containerRegistryUsername);
        return this;
    }

    /**
     * Get the containerRegistryPassword property: Password for to access the container registry.
     *
     * @return the containerRegistryPassword value.
     */
    public String containerRegistryPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().containerRegistryPassword();
    }

    /**
     * Set the containerRegistryPassword property: Password for to access the container registry.
     *
     * @param containerRegistryPassword the containerRegistryPassword value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerRegistryPassword(String containerRegistryPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerRegistryPassword(containerRegistryPassword);
        return this;
    }

    /**
     * Get the containerImageRepository property: Repository name (image name).
     *
     * @return the containerImageRepository value.
     */
    public String containerImageRepository() {
        return this.innerProperties() == null ? null : this.innerProperties().containerImageRepository();
    }

    /**
     * Set the containerImageRepository property: Repository name (image name).
     *
     * @param containerImageRepository the containerImageRepository value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerImageRepository(String containerImageRepository) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerImageRepository(containerImageRepository);
        return this;
    }

    /**
     * Get the containerImageTag property: Image tag.
     *
     * @return the containerImageTag value.
     */
    public String containerImageTag() {
        return this.innerProperties() == null ? null : this.innerProperties().containerImageTag();
    }

    /**
     * Set the containerImageTag property: Image tag.
     *
     * @param containerImageTag the containerImageTag value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerImageTag(String containerImageTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerImageTag(containerImageTag);
        return this;
    }

    /**
     * Get the containerImagePlatform property: Platform (windows or linux).
     *
     * @return the containerImagePlatform value.
     */
    public String containerImagePlatform() {
        return this.innerProperties() == null ? null : this.innerProperties().containerImagePlatform();
    }

    /**
     * Set the containerImagePlatform property: Platform (windows or linux).
     *
     * @param containerImagePlatform the containerImagePlatform value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withContainerImagePlatform(String containerImagePlatform) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withContainerImagePlatform(containerImagePlatform);
        return this;
    }

    /**
     * Get the appServiceEnvironment property: App Service Environment Properties.
     *
     * @return the appServiceEnvironment value.
     */
    public AppServiceEnvironmentInner appServiceEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().appServiceEnvironment();
    }

    /**
     * Set the appServiceEnvironment property: App Service Environment Properties.
     *
     * @param appServiceEnvironment the appServiceEnvironment value to set.
     * @return the ValidateRequestInner object itself.
     */
    public ValidateRequestInner withAppServiceEnvironment(AppServiceEnvironmentInner appServiceEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidatePropertiesInner();
        }
        this.innerProperties().withAppServiceEnvironment(appServiceEnvironment);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ValidateRequestInner"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ValidateRequestInner"));
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model ValidateRequestInner"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ValidateRequestInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidateRequestInner.class);
}
