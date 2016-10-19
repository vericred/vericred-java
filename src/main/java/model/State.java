/*
 * Vericred API
 * Vericred's API allows you to search for Health Plans that a specific doctor
accepts.

## Getting Started

Visit our [Developer Portal](https://vericred.3scale.net) to
create an account.

Once you have created an account, you can create one Application for
Production and another for our Sandbox (select the appropriate Plan when
you create the Application).

## Authentication

To authenticate, pass the API Key you created in the Developer Portal as
a `Vericred-Api-Key` header.

`curl -H 'Vericred-Api-Key: YOUR_KEY' "https://api.vericred.com/providers?search_term=Foo&zip_code=11215"`

## Versioning

Vericred's API default to the latest version.  However, if you need a specific
version, you can request it with an `Accept-Version` header.

The current version is `v3`.  Previous versions are `v1` and `v2`.

`curl -H 'Vericred-Api-Key: YOUR_KEY' -H 'Accept-Version: v2' "https://api.vericred.com/providers?search_term=Foo&zip_code=11215"`

## Pagination

Endpoints that accept `page` and `per_page` parameters are paginated. They expose
four additional fields that contain data about your position in the response,
namely `Total`, `Per-Page`, `Link`, and `Page` as described in [RFC-5988](https://tools.ietf.org/html/rfc5988).

For example, to display 5 results per page and view the second page of a
`GET` to `/networks`, your final request would be `GET /networks?....page=2&per_page=5`.

## Sideloading

When we return multiple levels of an object graph (e.g. `Provider`s and their `State`s
we sideload the associated data.  In this example, we would provide an Array of
`State`s and a `state_id` for each provider.  This is done primarily to reduce the
payload size since many of the `Provider`s will share a `State`

```
{
  providers: [{ id: 1, state_id: 1}, { id: 2, state_id: 1 }],
  states: [{ id: 1, code: 'NY' }]
}
```

If you need the second level of the object graph, you can just match the
corresponding id.

## Selecting specific data

All endpoints allow you to specify which fields you would like to return.
This allows you to limit the response to contain only the data you need.

For example, let's take a request that returns the following JSON by default

```
{
  provider: {
    id: 1,
    name: 'John',
    phone: '1234567890',
    field_we_dont_care_about: 'value_we_dont_care_about'
  },
  states: [{
    id: 1,
    name: 'New York',
    code: 'NY',
    field_we_dont_care_about: 'value_we_dont_care_about'
  }]
}
```

To limit our results to only return the fields we care about, we specify the
`select` query string parameter for the corresponding fields in the JSON
document.

In this case, we want to select `name` and `phone` from the `provider` key,
so we would add the parameters `select=provider.name,provider.phone`.
We also want the `name` and `code` from the `states` key, so we would
add the parameters `select=states.name,staes.code`.  The id field of
each document is always returned whether or not it is requested.

Our final request would be `GET /providers/12345?select=provider.name,provider.phone,states.name,states.code`

The response would be

```
{
  provider: {
    id: 1,
    name: 'John',
    phone: '1234567890'
  },
  states: [{
    id: 1,
    name: 'New York',
    code: 'NY'
  }]
}
```


 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * State
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T13:33:39.716-04:00")
public class State  implements Serializable {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("fips_number")
  private String fipsNumber = null;

  @JsonProperty("last_date_for_individual")
  private LocalDate lastDateForIndividual = null;

  @JsonProperty("last_date_for_shop")
  private LocalDate lastDateForShop = null;

  @JsonProperty("live_for_business")
  private Boolean liveForBusiness = null;

  @JsonProperty("live_for_consumers")
  private Boolean liveForConsumers = null;

  public State id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Primary Key of State
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Primary Key of State")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public State name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of state
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of state")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 2 letter code for state
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "2 letter code for state")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public State fipsNumber(String fipsNumber) {
    this.fipsNumber = fipsNumber;
    return this;
  }

   /**
   * National FIPs number
   * @return fipsNumber
  **/
  @ApiModelProperty(example = "null", value = "National FIPs number")
  public String getFipsNumber() {
    return fipsNumber;
  }

  public void setFipsNumber(String fipsNumber) {
    this.fipsNumber = fipsNumber;
  }

  public State lastDateForIndividual(LocalDate lastDateForIndividual) {
    this.lastDateForIndividual = lastDateForIndividual;
    return this;
  }

   /**
   * Last date this state is live for individuals
   * @return lastDateForIndividual
  **/
  @ApiModelProperty(example = "null", value = "Last date this state is live for individuals")
  public LocalDate getLastDateForIndividual() {
    return lastDateForIndividual;
  }

  public void setLastDateForIndividual(LocalDate lastDateForIndividual) {
    this.lastDateForIndividual = lastDateForIndividual;
  }

  public State lastDateForShop(LocalDate lastDateForShop) {
    this.lastDateForShop = lastDateForShop;
    return this;
  }

   /**
   * Last date this state is live for shop
   * @return lastDateForShop
  **/
  @ApiModelProperty(example = "null", value = "Last date this state is live for shop")
  public LocalDate getLastDateForShop() {
    return lastDateForShop;
  }

  public void setLastDateForShop(LocalDate lastDateForShop) {
    this.lastDateForShop = lastDateForShop;
  }

  public State liveForBusiness(Boolean liveForBusiness) {
    this.liveForBusiness = liveForBusiness;
    return this;
  }

   /**
   * Is this State available for businesses
   * @return liveForBusiness
  **/
  @ApiModelProperty(example = "null", value = "Is this State available for businesses")
  public Boolean getLiveForBusiness() {
    return liveForBusiness;
  }

  public void setLiveForBusiness(Boolean liveForBusiness) {
    this.liveForBusiness = liveForBusiness;
  }

  public State liveForConsumers(Boolean liveForConsumers) {
    this.liveForConsumers = liveForConsumers;
    return this;
  }

   /**
   * Is this State available for individuals
   * @return liveForConsumers
  **/
  @ApiModelProperty(example = "null", value = "Is this State available for individuals")
  public Boolean getLiveForConsumers() {
    return liveForConsumers;
  }

  public void setLiveForConsumers(Boolean liveForConsumers) {
    this.liveForConsumers = liveForConsumers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.id, state.id) &&
        Objects.equals(this.name, state.name) &&
        Objects.equals(this.code, state.code) &&
        Objects.equals(this.fipsNumber, state.fipsNumber) &&
        Objects.equals(this.lastDateForIndividual, state.lastDateForIndividual) &&
        Objects.equals(this.lastDateForShop, state.lastDateForShop) &&
        Objects.equals(this.liveForBusiness, state.liveForBusiness) &&
        Objects.equals(this.liveForConsumers, state.liveForConsumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, fipsNumber, lastDateForIndividual, lastDateForShop, liveForBusiness, liveForConsumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fipsNumber: ").append(toIndentedString(fipsNumber)).append("\n");
    sb.append("    lastDateForIndividual: ").append(toIndentedString(lastDateForIndividual)).append("\n");
    sb.append("    lastDateForShop: ").append(toIndentedString(lastDateForShop)).append("\n");
    sb.append("    liveForBusiness: ").append(toIndentedString(liveForBusiness)).append("\n");
    sb.append("    liveForConsumers: ").append(toIndentedString(liveForConsumers)).append("\n");
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

