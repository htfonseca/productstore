package com.myprojects.spring.productstore.productorder.api.resource;

import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/** Simple resource for product order with the sending properties and links */
public class ProductOrderResource extends ResourceSupport {

  private UUID identifier;

  private String email;

  private LocalDate date;

  private List<ParcelResource> parcels;

  private BigDecimal total;

  public ProductOrderResource(
      UUID identifier,
      String email,
      LocalDate date,
      BigDecimal total,
      List<ParcelResource> parcels) {
    this.identifier = identifier;
    this.email = email;
    this.date = date;
    this.total = total;
    this.parcels = parcels;
  }

  public UUID getIdentifier() {
    return identifier;
  }

  public String getEmail() {
    return email;
  }

  public LocalDate getDate() {
    return date;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public List<ParcelResource> getParcels() {
    return parcels;
  }
}
