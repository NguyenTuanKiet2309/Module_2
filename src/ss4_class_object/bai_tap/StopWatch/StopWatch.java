package ss4_class_object.bai_tap.StopWatch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime() {
        this.startTime = startTime;
    }

    public void setEndTime() {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}
