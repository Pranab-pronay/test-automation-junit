import java.lang.management.ManagementFactory;

public class SystemMonitor {

    public long getMemoryUsage() {
        return ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
    }

    public long getCpuUsage() {
        return ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
    }

    public static void main(String args[]) {
        SystemMonitor systemMonitor = new SystemMonitor();
        System.out.println(systemMonitor.getMemoryUsage());
        System.out.println(systemMonitor.getCpuUsage());
    }
}