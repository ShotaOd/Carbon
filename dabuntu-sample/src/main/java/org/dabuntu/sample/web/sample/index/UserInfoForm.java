package org.dabuntu.sample.web.sample.index;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ubuntu 2016/10/12.
 */
@Data
public class UserInfoForm {

	private String name;
	private Integer age;
	private LocalDateTime birthDate;

	private List<JobForm> jobs;
}
