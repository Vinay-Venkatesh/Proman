package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mycompany.proman.api.model.RoleDetailsType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object, which describes the successfully authenticated user details
 */
@ApiModel(description = "Object, which describes the successfully authenticated user details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.622+05:30")

public class AuthorizedUserResponse   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("mobile_phone")
  private String mobilePhone = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("last_login_time")
  private Object lastLoginTime = null;

  @JsonProperty("role")
  private RoleDetailsType role = null;

  public AuthorizedUserResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the authorized user in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the authorized user in a standard UUID format")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AuthorizedUserResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name of user
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "first name of user")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AuthorizedUserResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name of user
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "last name of user")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AuthorizedUserResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * email address of member
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "email address of member")
  @NotNull


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AuthorizedUserResponse mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  /**
   * mobile phone number of user
   * @return mobilePhone
  **/
  @ApiModelProperty(required = true, value = "mobile phone number of user")
  @NotNull


  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public AuthorizedUserResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of user (e.g. active, inactive, locked)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of user (e.g. active, inactive, locked)")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AuthorizedUserResponse lastLoginTime(Object lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

  /**
   * The last login time of authorized user (time in milliseconds)
   * @return lastLoginTime
  **/
  @ApiModelProperty(required = true, value = "The last login time of authorized user (time in milliseconds)")
  @NotNull


  public Object getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Object lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public AuthorizedUserResponse role(RoleDetailsType role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RoleDetailsType getRole() {
    return role;
  }

  public void setRole(RoleDetailsType role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedUserResponse authorizedUserResponse = (AuthorizedUserResponse) o;
    return Objects.equals(this.id, authorizedUserResponse.id) &&
        Objects.equals(this.firstName, authorizedUserResponse.firstName) &&
        Objects.equals(this.lastName, authorizedUserResponse.lastName) &&
        Objects.equals(this.emailAddress, authorizedUserResponse.emailAddress) &&
        Objects.equals(this.mobilePhone, authorizedUserResponse.mobilePhone) &&
        Objects.equals(this.status, authorizedUserResponse.status) &&
        Objects.equals(this.lastLoginTime, authorizedUserResponse.lastLoginTime) &&
        Objects.equals(this.role, authorizedUserResponse.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, emailAddress, mobilePhone, status, lastLoginTime, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedUserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

