package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class RequestPlanFindApplicant  implements Serializable {
  
  private Integer age = null;

  
  /**
   * Age of applicant to search for
   **/
  public RequestPlanFindApplicant age(Integer age) {
    this.age = age;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Age of applicant to search for")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPlanFindApplicant requestPlanFindApplicant = (RequestPlanFindApplicant) o;
    return Objects.equals(this.age, requestPlanFindApplicant.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPlanFindApplicant {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

