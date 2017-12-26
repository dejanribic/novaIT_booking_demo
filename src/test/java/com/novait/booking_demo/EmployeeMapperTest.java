package com.novait.booking_demo;

import com.novait.booking_demo.Models.DTO.EmployeeDTO;
import com.novait.booking_demo.Models.Entities.Employee;
import com.novait.booking_demo.Models.Mappers.EmployeeMapper;
import org.junit.Test;

import java.sql.Timestamp;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeMapperTest {

    @Test
    public void shouldMapCarToDto() {

        /*

        //given
        Employee emp = new Employee();

        emp.setEmployeeId(1L);
        emp.setHotelId(1L);

        emp.setCreationTime(new Timestamp(System.currentTimeMillis()));

        emp.setName("Sale");
        emp.setAddress("addressTest");
        emp.setEmail("a@a.com");

        //when
        EmployeeDTO empDTO = EmployeeMapper.INSTANCE.employeeToEmployeeDTO( emp );

        //then
        assertThat( empDTO ).isNotNull();
        assertThat( empDTO.getEmployeeInfo()).isEqualTo("addressTest");
        assertThat( empDTO.getEmployeeName()).isEqualTo("Sale");
        assertThat( empDTO.getEmployeeEmail()).isEqualTo("a@a.com");

        */

    }
}
