package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mycompany.proman.api.model.PermissionsType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleDetailsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.622+05:30")

public class RoleDetailsType   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permissions")
  @Valid
  private List<PermissionsType> permissions = new ArrayList<>();

  public RoleDetailsType id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Role id of authorized user
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Role id of authorized user")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RoleDetailsType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Role name of authorized user
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Role name of authorized user")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleDetailsType permissions(List<PermissionsType> permissions) {
    this.permissions = permissions;
    return this;
  }

  public RoleDetailsType addPermissionsItem(PermissionsType permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permissions assigned to authorized user
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "Permissions assigned to authorized user")
  @NotNull

  @Valid

  public List<PermissionsType> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsType> permissions) {
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
    RoleDetailsType roleDetailsType = (RoleDetailsType) o;
    return Objects.equals(this.id, roleDetailsType.id) &&
        Objects.equals(this.name, roleDetailsType.name) &&
        Objects.equals(this.permissions, roleDetailsType.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDetailsType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

