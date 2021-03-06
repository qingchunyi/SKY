/**
 * 小企业财税开放平台API Gateway 后端服务RestApi标准文档说明
 * http://www.17dz.com
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


package cn.com.servyou.xqy.openapi.client.sky.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ApiResponseobject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T13:42:20.693+08:00")
public class ApiResponseobject   {
  @SerializedName("body")
  private List<Sheet> body = new ArrayList<Sheet>();

  @SerializedName("head")
  private Head head = null;

  public ApiResponseobject body(List<Sheet> body) {
    this.body = body;
    return this;
  }

  public ApiResponseobject addBodyItem(Sheet bodyItem) {
    this.body.add(bodyItem);
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Sheet> getBody() {
    return body;
  }

  public void setBody(List<Sheet> body) {
    this.body = body;
  }

  public ApiResponseobject head(Head head) {
    this.head = head;
    return this;
  }

   /**
   * Get head
   * @return head
  **/
  @ApiModelProperty(example = "null", value = "")
  public Head getHead() {
    return head;
  }

  public void setHead(Head head) {
    this.head = head;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseobject apiResponseobject = (ApiResponseobject) o;
    return Objects.equals(this.body, apiResponseobject.body) &&
        Objects.equals(this.head, apiResponseobject.head);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, head);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseobject {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

