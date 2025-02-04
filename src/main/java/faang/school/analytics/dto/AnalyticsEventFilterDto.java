package faang.school.analytics.dto;

import faang.school.analytics.model.EventType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnalyticsEventFilterDto {
    private long receiverId;

    @NotNull
    private EventType eventType;
    private String interval;
    private LocalDateTime from;
    private LocalDateTime to;
}
