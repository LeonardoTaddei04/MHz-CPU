import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class CalcolaPotenzaCPU {
     public static void main(String[] args) {
          OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

          long frequenzaCPUMHz = osBean.getProcessCpuTime();
          int numeroCoreCPU = osBean.getAvailableProcessors();

          System.out.println("CPU (MHz): " + frequenzaCPUMHz);
          System.out.println("Core CPU: " + numeroCoreCPU);
     }
}