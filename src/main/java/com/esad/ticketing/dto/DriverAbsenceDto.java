package com.esad.ticketing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverAbsenceDto {
    private Driver driver;
    private String leaveType;
    private String remark;
    private Date fromDate;
    private Date toDate;
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Driver {
    private Long driverId;
}