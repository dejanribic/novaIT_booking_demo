package com.novait.booking_demo.Models.Mappers;

import com.novait.booking_demo.Models.DTO.EmployeeDTO;
import com.novait.booking_demo.Models.Entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class );

    @Mapping(source = "name", target = "employeeName")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);
}
