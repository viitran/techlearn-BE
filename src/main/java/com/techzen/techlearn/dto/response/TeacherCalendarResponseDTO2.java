package com.techzen.techlearn.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherCalendarResponseDTO2 implements Serializable {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Subject")
    private String title;

    @JsonProperty("StartTime")
    private String startTime;

    @JsonProperty("EndTime")
    private String endTime;

    @JsonProperty("IsAllDay")
    private boolean isAllDay;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("StartTimezone")
    private String startTimezone;

    @JsonProperty("EndTimezone")
    private String endTimezone;

    @JsonProperty("OwnerId")
    private String ownerId;
}