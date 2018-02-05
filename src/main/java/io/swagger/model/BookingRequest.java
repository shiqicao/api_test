package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ServiceTimeSlot;
import io.swagger.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-05T00:10:30.448-08:00")

public class BookingRequest   {
  @JsonProperty("user")
  private User user = null;

  @JsonProperty("timeSlot")
  private ServiceTimeSlot timeSlot = null;

  @JsonProperty("notes")
  private String notes = null;

  public BookingRequest user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public BookingRequest timeSlot(ServiceTimeSlot timeSlot) {
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

  public BookingRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingRequest bookingRequest = (BookingRequest) o;
    return Objects.equals(this.user, bookingRequest.user) &&
        Objects.equals(this.timeSlot, bookingRequest.timeSlot) &&
        Objects.equals(this.notes, bookingRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, timeSlot, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

