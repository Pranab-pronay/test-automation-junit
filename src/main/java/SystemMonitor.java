import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Min {

    public long getMemoryUsage() {
        return ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
    }
    public long getCpuUsage() {
return ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();


    }
    public static void main(String args[]) {
        Min min = new Min();
        System.out.println(min.getMemoryUsage());
        System.out.println(min.getCpuUsage());    }
}