package io.swagger.model;

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
 * BookingResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-02T11:14:42.902-08:00")

public class BookingResponse   {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    BOOKED("booked"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("merchantPhoneNumber")
  private String merchantPhoneNumber = null;

  @JsonProperty("confirmationId")
  private String confirmationId = null;

  @JsonProperty("failureMessage")
  private String failureMessage = null;

  public BookingResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BookingResponse merchantPhoneNumber(String merchantPhoneNumber) {
    this.merchantPhoneNumber = merchantPhoneNumber;
    return this;
  }

  /**
   * Get merchantPhoneNumber
   * @return merchantPhoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getMerchantPhoneNumber() {
    return merchantPhoneNumber;
  }

  public void setMerchantPhoneNumber(String merchantPhoneNumber) {
    this.merchantPhoneNumber = merchantPhoneNumber;
  }

  public BookingResponse confirmationId(String confirmationId) {
    this.confirmationId = confirmationId;
    return this;
  }

  /**
   * Get confirmationId
   * @return confirmationId
  **/
  @ApiModelProperty(value = "")


  public String getConfirmationId() {
    return confirmationId;
  }

  public void setConfirmationId(String confirmationId) {
    this.confirmationId = confirmationId;
  }

  public BookingResponse failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

  /**
   * Get failureMessage
   * @return failureMessage
  **/
  @ApiModelProperty(value = "")


  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingResponse bookingResponse = (BookingResponse) o;
    return Objects.equals(this.status, bookingResponse.status) &&
        Objects.equals(this.merchantPhoneNumber, bookingResponse.merchantPhoneNumber) &&
        Objects.equals(this.confirmationId, bookingResponse.confirmationId) &&
        Objects.equals(this.failureMessage, bookingResponse.failureMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, merchantPhoneNumber, confirmationId, failureMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    merchantPhoneNumber: ").append(toIndentedString(merchantPhoneNumber)).append("\n");
    sb.append("    confirmationId: ").append(toIndentedString(confirmationId)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
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

