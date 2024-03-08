import org.junit.Test;
import static org.junit.Assert.*;

public class SystemMonitorTest {

    @Test
    public void testGetMemoryUsageFail() {
        // RED: Write a failing test
        SystemMonitor systemMonitor = new SystemMonitor();// Arrange
        long memoryUsage = systemMonitor.getMemoryUsage();// Act
        assertEquals("Memory usage should be 0 initially", 0, memoryUsage);// Assert
    }
    @Test
    public void testGetCpuUsageFail() {
        // RED: Write a failing test
        SystemMonitor systemMonitor = new SystemMonitor(); // Arrange
        long cpuUsage = systemMonitor.getCpuUsage(); // Act
        assertEquals("CPU usage should be 0 initially", 0, cpuUsage);// Assert
    }
    @Test
    public void testGetMemoryUsage() {
        // GREEN: Implement code to make the test pass
        SystemMonitor systemMonitor = new SystemMonitor();// Arrange
        long memoryUsage = systemMonitor.getMemoryUsage();// Act
        assertTrue("Memory usage should be non-negative", memoryUsage >= 0);// Assert
    }
    @Test
    public void testGetCpuUsage() {
        // GREEN: Implement code to make the test pass
        SystemMonitor systemMonitor = new SystemMonitor();// Arrange
        long cpuUsage = systemMonitor.getCpuUsage();// Act
        assertTrue("CPU usage should be non-negative", cpuUsage >= 0);// Assert
    }
}
