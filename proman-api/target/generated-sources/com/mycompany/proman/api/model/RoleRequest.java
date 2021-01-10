package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.474+05:30")

public class RoleRequest   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("permissions")
  @Valid
  private List<Integer> permissions = null;

  public RoleRequest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Role id to be mapped to the user
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Role id to be mapped to the user")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RoleRequest permissions(List<Integer> permissions) {
    this.permissions = permissions;
    return this;
  }

  public RoleRequest addPermissionsItem(Integer permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * List of permission ids to be mapped to the new user
   * @return permissions
  **/
  @ApiModelProperty(value = "List of permission ids to be mapped to the new user")


  public List<Integer> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Integer> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleRequest roleRequest = (RoleRequest) o;
    return Objects.equals(this.id, roleRequest.id) &&
        Objects.equals(this.permissions, roleRequest.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

