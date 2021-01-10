package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mycompany.proman.api.model.RoleDetailsType;
import com.mycompany.proman.api.model.UserStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.474+05:30")

public class UserDetailsResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("mobile_number")
  private String mobileNumber = null;

  @JsonProperty("status")
  private UserStatusType status = null;

  @JsonProperty("role")
  private RoleDetailsType role = null;

  public UserDetailsResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the user in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the user in a standard UUID format")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDetailsResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of the user")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDetailsResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of the user")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDetailsResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of the user
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "Email address of the user")
  @NotNull


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserDetailsResponse mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Mobile number of the user
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "Mobile number of the user")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserDetailsResponse status(UserStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserStatusType getStatus() {
    return status;
  }

  public void setStatus(UserStatusType status) {
    this.status = status;
  }

  public UserDetailsResponse role(RoleDetailsType role) {
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
    UserDetailsResponse userDetailsResponse = (UserDetailsResponse) o;
    return Objects.equals(this.id, userDetailsResponse.id) &&
        Objects.equals(this.firstName, userDetailsResponse.firstName) &&
        Objects.equals(this.lastName, userDetailsResponse.lastName) &&
        Objects.equals(this.emailAddress, userDetailsResponse.emailAddress) &&
        Objects.equals(this.mobileNumber, userDetailsResponse.mobileNumber) &&
        Objects.equals(this.status, userDetailsResponse.status) &&
        Objects.equals(this.role, userDetailsResponse.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, emailAddress, mobileNumber, status, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

