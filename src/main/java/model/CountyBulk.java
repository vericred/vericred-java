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

import java.io.Serializable;
/**
 * CountyBulk
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T13:33:39.716-04:00")
public class CountyBulk  implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state_id")
  private String stateId = null;

  @JsonProperty("rating_area_count")
  private String ratingAreaCount = null;

  @JsonProperty("service_area_count")
  private String serviceAreaCount = null;

  public CountyBulk id(String id) {
    this.id = id;
    return this;
  }

   /**
   * FIPs code for the county
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "FIPs code for the county")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CountyBulk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the county
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of the county")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountyBulk stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * State code
   * @return stateId
  **/
  @ApiModelProperty(example = "null", value = "State code")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public CountyBulk ratingAreaCount(String ratingAreaCount) {
    this.ratingAreaCount = ratingAreaCount;
    return this;
  }

   /**
   * Count of unique rating areas in the county
   * @return ratingAreaCount
  **/
  @ApiModelProperty(example = "null", value = "Count of unique rating areas in the county")
  public String getRatingAreaCount() {
    return ratingAreaCount;
  }

  public void setRatingAreaCount(String ratingAreaCount) {
    this.ratingAreaCount = ratingAreaCount;
  }

  public CountyBulk serviceAreaCount(String serviceAreaCount) {
    this.serviceAreaCount = serviceAreaCount;
    return this;
  }

   /**
   * Count of unique service areas in the county
   * @return serviceAreaCount
  **/
  @ApiModelProperty(example = "null", value = "Count of unique service areas in the county")
  public String getServiceAreaCount() {
    return serviceAreaCount;
  }

  public void setServiceAreaCount(String serviceAreaCount) {
    this.serviceAreaCount = serviceAreaCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountyBulk countyBulk = (CountyBulk) o;
    return Objects.equals(this.id, countyBulk.id) &&
        Objects.equals(this.name, countyBulk.name) &&
        Objects.equals(this.stateId, countyBulk.stateId) &&
        Objects.equals(this.ratingAreaCount, countyBulk.ratingAreaCount) &&
        Objects.equals(this.serviceAreaCount, countyBulk.serviceAreaCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stateId, ratingAreaCount, serviceAreaCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountyBulk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    ratingAreaCount: ").append(toIndentedString(ratingAreaCount)).append("\n");
    sb.append("    serviceAreaCount: ").append(toIndentedString(serviceAreaCount)).append("\n");
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

