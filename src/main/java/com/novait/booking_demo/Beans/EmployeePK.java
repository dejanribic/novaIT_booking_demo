package com.novait.booking_demo.Beans;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
public class EmployeePK implements Serializable {

    private Long employeeId;
    private Long hotelId;

    @Id
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeePK that = (EmployeePK) o;

        if (employeeId != that.employeeId) return false;
        return hotelId == that.hotelId;

    }

    @Override
    public int hashCode() {
        int result = (int) (employeeId ^ (employeeId >>> 32));
        result = 31 * result + (int) (hotelId ^ (hotelId >>> 32));
        return result;
    }
}
