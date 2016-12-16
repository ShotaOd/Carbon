package org.dabuntu.sample.web.consumer.dto;

import lombok.Value;
import org.dabunt.sample.tables.pojos.Lecturer;
import org.dabunt.sample.tables.pojos.LecturerRoom;

import java.util.List;

/**
 * @author ubuntu 2016/12/10.
 */
@Value
public class LectureRoomDto {
    private Lecturer lecturer;
    private List<LecturerRoom> rooms;
}
