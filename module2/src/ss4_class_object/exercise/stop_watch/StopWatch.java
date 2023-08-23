package ss4_class_object.exercise.stop_watch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime = LocalTime.now();
    private LocalTime endTime = LocalTime.now();

    public StopWatch () {
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime start() {
        return LocalTime.now();
    }

    public LocalTime stop() {
        return LocalTime.now();
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + getStartTime() +
                ", endTime=" + getEndTime() +
                '}';
    }

        public int getElapsedTime() {
        int miliSecond = (stop().getSecond() - start().getSecond());
        return miliSecond;
    }
}