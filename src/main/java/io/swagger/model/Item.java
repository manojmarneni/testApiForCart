package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")
@Table(name = "ItemDetails")
@Entity
@Configuration
public class Item   {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @JsonProperty("barcode")
  @NotNull(message = "barcode Cannot be Null")
  @NotEmpty(message = "barcode Cannot be Empty")
  private String barcode = null;

  @JsonProperty("imageUrl")
  @NotNull(message = "ImageUrl Cannot be Null")
  @NotEmpty(message = "ImageUrl Cannot be Empty")
  private String imageUrl = null;

  @JsonProperty("Weight")
  private int weight;

  public Item barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  @AssertTrue(message = "weight of item should be between 10 and 10,000 grams")
  public boolean isValidWeight(){
    if(weight>10000 || weight < 10) return false;
    return true;
  }

  @AssertTrue(message = "url image should of type .png or .jpg")
  public boolean isValidUrl(){

    String substring = imageUrl.substring(Math.max(imageUrl.length() - 4, 0));
    if(substring.equals(".jpg")) return true;
    else if(substring.equals(".jpg")) return true;
    else return false;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @ApiModelProperty(value = "")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Item imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Item weight(int weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.barcode, item.barcode) &&
        Objects.equals(this.imageUrl, item.imageUrl) &&
        Objects.equals(this.weight, item.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, imageUrl, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

