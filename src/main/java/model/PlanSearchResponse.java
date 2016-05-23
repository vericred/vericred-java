package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import model.Drug;
import model.Meta;
import model.Plan;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:44:52.285-04:00")
public class PlanSearchResponse  implements Serializable {
  
  private Meta meta = null;
  private List<Plan> plans = new ArrayList<Plan>();
  private List<Drug> coverages = new ArrayList<Drug>();

  
  /**
   * Metadata for query
   **/
  public PlanSearchResponse meta(Meta meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for query")
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  /**
   * Plan search results
   **/
  public PlanSearchResponse plans(List<Plan> plans) {
    this.plans = plans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Plan search results")
  @JsonProperty("plans")
  public List<Plan> getPlans() {
    return plans;
  }
  public void setPlans(List<Plan> plans) {
    this.plans = plans;
  }


  /**
   * null
   **/
  public PlanSearchResponse coverages(List<Drug> coverages) {
    this.coverages = coverages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "null")
  @JsonProperty("coverages")
  public List<Drug> getCoverages() {
    return coverages;
  }
  public void setCoverages(List<Drug> coverages) {
    this.coverages = coverages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanSearchResponse planSearchResponse = (PlanSearchResponse) o;
    return Objects.equals(this.meta, planSearchResponse.meta) &&
        Objects.equals(this.plans, planSearchResponse.plans) &&
        Objects.equals(this.coverages, planSearchResponse.coverages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, plans, coverages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanSearchResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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

