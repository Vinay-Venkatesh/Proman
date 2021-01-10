package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserOperationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.474+05:30")

public class UserOperationRequest   {
  /**
   * Type of operation
   */
  public enum OpEnum {
    REPLACE("replace"),
    
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("op")
  private OpEnum op = null;

  /**
   * Resource path whose state to be modified
   */
  public enum PathEnum {
    STATUS("status"),
    
    ROLE("role"),
    
    PERMISSIONS("permissions");

    private String value;

    PathEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PathEnum fromValue(String text) {
      for (PathEnum b : PathEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("path")
  private PathEnum path = null;

  @JsonProperty("value")
  private String value = null;

  public UserOperationRequest op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Type of operation
   * @return op
  **/
  @ApiModelProperty(value = "Type of operation")


  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public UserOperationRequest path(PathEnum path) {
    this.path = path;
    return this;
  }

  /**
   * Resource path whose state to be modified
   * @return path
  **/
  @ApiModelProperty(value = "Resource path whose state to be modified")


  public PathEnum getPath() {
    return path;
  }

  public void setPath(PathEnum path) {
    this.path = path;
  }

  public UserOperationRequest value(String value) {
    this.value = value;
    return this;
  }

  /**
   * New state value to be updated to the resource
   * @return value
  **/
  @ApiModelProperty(value = "New state value to be updated to the resource")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOperationRequest userOperationRequest = (UserOperationRequest) o;
    return Objects.equals(this.op, userOperationRequest.op) &&
        Objects.equals(this.path, userOperationRequest.path) &&
        Objects.equals(this.value, userOperationRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOperationRequest {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

