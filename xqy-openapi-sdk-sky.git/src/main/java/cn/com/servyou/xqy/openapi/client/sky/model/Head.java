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

import java.util.Objects;


/**
 * Head
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T13:42:20.693+08:00")
public class Head   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("messsage")
  private String messsage = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("requestId")
  private String requestId = null;

  public Head code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 成功/失败编码
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "成功/失败编码")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Head messsage(String messsage) {
    this.messsage = messsage;
    return this;
  }

   /**
   * 成功/失败信息
   * @return messsage
  **/
  @ApiModelProperty(example = "null", value = "成功/失败信息")
  public String getMesssage() {
    return messsage;
  }

  public void setMesssage(String messsage) {
    this.messsage = messsage;
  }

  public Head status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 结果状态
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "结果状态")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Head requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求Id,查询调用链路
   * @return requestId
  **/
  @ApiModelProperty(example = "null", value = "请求Id,查询调用链路")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Head head = (Head) o;
    return Objects.equals(this.code, head.code) &&
        Objects.equals(this.messsage, head.messsage) &&
        Objects.equals(this.status, head.status) &&
        Objects.equals(this.requestId, head.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messsage, status, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Head {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    messsage: ").append(toIndentedString(messsage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

