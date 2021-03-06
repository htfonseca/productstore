package com.myprojects.spring.productstore.order.dto;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/** Dto that represents an product order to be used in the json parser */
public class OrderDto {

  @NotNull @Email private String email;

  @Valid
  @NotNull
  @Size(min = 1)
  private List<ParcelDto> parcels;

  /** Constructor for JPA. */
  public OrderDto() {
    // empty
  }

  public OrderDto(String email, List<ParcelDto> parcels) {
    this.email = email;
    this.parcels = parcels;
  }

  public String getEmail() {
    return email;
  }

  public List<ParcelDto> getParcels() {
    return parcels;
  }
}
