package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ServiceTimeSlot;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvailablilityRequest
 */
@Validated

public class AvailablilityRequest   {
  @JsonProperty("timeSlot")
  private ServiceTimeSlot timeSlot = null;

  public AvailablilityRequest timeSlot(ServiceTimeSlot timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

  /**
   * Get timeSlot
   * @return timeSlot
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ServiceTimeSlot getTimeSlot() {
    return timeSlot;
  }

  public void setTimeSlot(ServiceTimeSlot timeSlot) {
    this.timeSlot = timeSlot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablilityRequest availablilityRequest = (AvailablilityRequest) o;
    return Objects.equals(this.timeSlot, availablilityRequest.timeSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablilityRequest {\n");
    
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
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

