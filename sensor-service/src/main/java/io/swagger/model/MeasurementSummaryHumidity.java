package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasurementTypeHumidityWithTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasurementSummaryHumidity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-01T17:48:42.711Z[GMT]")
public class MeasurementSummaryHumidity   {
  @JsonProperty("average")
  private Double average = null;

  @JsonProperty("latest")
  private MeasurementTypeHumidityWithTimestamp latest = null;

  @JsonProperty("minimum")
  private MeasurementTypeHumidityWithTimestamp minimum = null;

  @JsonProperty("maximum")
  private MeasurementTypeHumidityWithTimestamp maximum = null;

  public MeasurementSummaryHumidity average(Double average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(value = "")
  
    public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public MeasurementSummaryHumidity latest(MeasurementTypeHumidityWithTimestamp latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeHumidityWithTimestamp getLatest() {
    return latest;
  }

  public void setLatest(MeasurementTypeHumidityWithTimestamp latest) {
    this.latest = latest;
  }

  public MeasurementSummaryHumidity minimum(MeasurementTypeHumidityWithTimestamp minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeHumidityWithTimestamp getMinimum() {
    return minimum;
  }

  public void setMinimum(MeasurementTypeHumidityWithTimestamp minimum) {
    this.minimum = minimum;
  }

  public MeasurementSummaryHumidity maximum(MeasurementTypeHumidityWithTimestamp maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasurementTypeHumidityWithTimestamp getMaximum() {
    return maximum;
  }

  public void setMaximum(MeasurementTypeHumidityWithTimestamp maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSummaryHumidity measurementSummaryHumidity = (MeasurementSummaryHumidity) o;
    return Objects.equals(this.average, measurementSummaryHumidity.average) &&
        Objects.equals(this.latest, measurementSummaryHumidity.latest) &&
        Objects.equals(this.minimum, measurementSummaryHumidity.minimum) &&
        Objects.equals(this.maximum, measurementSummaryHumidity.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, latest, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSummaryHumidity {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
