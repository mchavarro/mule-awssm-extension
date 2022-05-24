package com.sandiindia.mule.provider.properties.awssm.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
public class AWSSMPropertiesProviderConfiguration {

  @Parameter
  private String configId;
  
  @Parameter
  private String region;

  
  @Parameter
  private String authType;
  
  @Parameter
  private String awsKey;
  
  @Parameter
  private String awsSecret;

  public String getAwsKey() {
	return awsKey;
}

public void setAwsKey(String awsKey) {
	this.awsKey = awsKey;
}

public String getAwsSecret() {
	return awsSecret;
}

public void setAwsSecret(String awsSecret) {
	this.awsSecret = awsSecret;
}

public String getConfigId(){
    return configId;
  }
  
  public String getRegion() {
	  return region;
  }
  
  
  public String getAuthType() {
	  return authType;
  }

}
