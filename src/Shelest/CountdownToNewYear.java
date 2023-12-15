package Shelest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CountdownToNewYear {
    public static void main(String[] args) {
    long totalSeconds = getSecondsUntilNewYear();
    Duration duration = Duration.ofSeconds(totalSeconds);

    long days = duration.toDays();
    long hours = duration.toHoursPart();
    long minutes = duration.toMinutesPart();
    long seconds = duration.toSecondsPart();

    System.out.printf("%d днів, %d годин, %d хвилин і %d секунд%n", days, hours, minutes, seconds);
}

    private static long getSecondsUntilNewYear() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newYear = LocalDateTime.of(now.getYear() + 1, 1, 1, 0, 0, 0);

        ZoneId zoneId = ZoneId.systemDefault();
        long secondsUntilNewYear = Duration.between(now, newYear.atZone(zoneId).toLocalDateTime()).getSeconds();

        return secondsUntilNewYear;
    }
}
