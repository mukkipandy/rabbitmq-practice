package rabbitmq;

import org.junit.jupiter.api.Test;

enum LoggerLevel {

}
enum CAMServerity {

}
interface LoggerIterface
{
    void logCAMAlarm(LoggerLevel level, String message, CAMServerity severity);
    void logMetrics(LoggerLevel level, Object metricsarray);
    void logMessage(LoggerLevel level, String text, Object stack);
    void logText(LoggerLevel level, String text, Object stack);
}

class SampleLogger
{
    public void RegisterLogger(LoggerIterface impl) {

    }
}

public class SampleTest {

    @Test
    public void Test1() {
        SampleLogger logger = new SampleLogger();
        logger.RegisterLogger(new LoggerIterface() {
            @Override
            public void logCAMAlarm(LoggerLevel level, String message, CAMServerity severity) {

            }

            @Override
            public void logMetrics(LoggerLevel level, Object metricsarray) {

            }

            @Override
            public void logMessage(LoggerLevel level, String text, Object stack) {

            }

            @Override
            public void logText(LoggerLevel level, String text, Object stack) {

            }
        });
    }
}
