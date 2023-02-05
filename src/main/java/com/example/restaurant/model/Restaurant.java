package com.example.restaurant.model;

public class Restaurant {
    private Long id;

    private String name;
    private String address;
    private Long phoneNumber;
    private String speciality;
    private Integer totalStaffs;
    private String openHours;
    private String closeHours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(Integer totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public String getCloseHours() {
        return closeHours;
    }

    public void setCloseHours(String closeHours) {
        this.closeHours = closeHours;
    }

    public Restaurant(Long id, String name, String address, Long phoneNumber, String speciality, Integer totalStaffs, String openHours, String closeHours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.totalStaffs = totalStaffs;
        this.openHours = openHours;
        this.closeHours = closeHours;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", speciality='" + speciality + '\'' +
                ", totalStaffs=" + totalStaffs +
                ", openHours='" + openHours + '\'' +
                ", closeHours='" + closeHours + '\'' +
                '}';
    }
}

