package com.thoughtworks.computerinventory.dto;

public class ComputerDto {

  private int id;
  private String type;
  private String owner;
  private String createTime;

  public ComputerDto(int id, String type, String owner, String createTime) {
    this.id = id;
    this.type = type;
    this.owner = owner;
    this.createTime = createTime;
  }

  public int getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getOwner() {
    return owner;
  }

  public String getCreateTime() {
    return createTime;
  }
}
