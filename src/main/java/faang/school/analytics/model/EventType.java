package faang.school.analytics.model;

public enum EventType {
    PROFILE_VIEW,
    PROJECT_VIEW,
    USER_FOLLOWER,
    POST_PUBLISHED,
    POST_VIEW,
    POST_LIKE,
    POST_COMMENT,
    SKILL_RECEIVED,
    RECOMMENDATION_RECEIVED,
    ADDED_TO_FAVOURITES,
    PROJECT_INVITE,
    PROJECT_FOLLOWER,
    TASK_COMPLETED,
    GOAL_COMPLETED,
    ACHIEVEMENT_RECEIVED,
    PROFILE_APPEARED_IN_SEARCH,
    PROJECT_APPEARED_IN_SEARCH,
    MENTORSHIP_REQUESTED;

    public static EventType of(int type) {
        for (EventType eventType : EventType.values()) {
            if (eventType.ordinal() == type) {
                return eventType;
            }
        }
        throw new IllegalArgumentException("Unknown event type: " + type);
    }

    public static EventType of(String type) {
        for (EventType eventType : EventType.values()) {
            if (eventType.name().equalsIgnoreCase(type)) {
                return eventType;
            }
        }
        throw new IllegalArgumentException("Unknown event type: " + type);
    }
}
