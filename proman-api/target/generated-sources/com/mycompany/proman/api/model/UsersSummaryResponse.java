package com.mycompany.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mycompany.proman.api.model.UserSummaryType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsersSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-10T16:09:28.474+05:30")

public class UsersSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("users")
  @Valid
  private List<UserSummaryType> users = new ArrayList<>();

  public UsersSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched users
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched users")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public UsersSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of users fetched per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of users fetched per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public UsersSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of users for the specified input
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of users for the specified input")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public UsersSummaryResponse users(List<UserSummaryType> users) {
    this.users = users;
    return this;
  }

  public UsersSummaryResponse addUsersItem(UserSummaryType usersItem) {
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of users
   * @return users
  **/
  @ApiModelProperty(required = true, value = "List of users")
  @NotNull

  @Valid

  public List<UserSummaryType> getUsers() {
    return users;
  }

  public void setUsers(List<UserSummaryType> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersSummaryResponse usersSummaryResponse = (UsersSummaryResponse) o;
    return Objects.equals(this.page, usersSummaryResponse.page) &&
        Objects.equals(this.limit, usersSummaryResponse.limit) &&
        Objects.equals(this.totalCount, usersSummaryResponse.totalCount) &&
        Objects.equals(this.users, usersSummaryResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

