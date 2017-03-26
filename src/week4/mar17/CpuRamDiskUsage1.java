package week4.mar17;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
//Cpu,Ram,System Usage commands in java

public class CpuRamDiskUsage1 {
	public static void main(String[] args) {
		CpuRamDiskUsage1 cpuRamDiskUsage1 = new CpuRamDiskUsage1();
		int i=0;
		while(i<10){
		cpuRamDiskUsage1.printUsage();
		}
	}

	private void printUsage() {
		OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
			method.setAccessible(true);
			if (method.getName().startsWith("get") && Modifier.isPublic(method.getModifiers())) {
				Object value;
				try {
					value = method.invoke(operatingSystemMXBean);
				} catch (Exception e) {
					value = e;
				} // try
				System.out.println(method.getName() + " = " + value);
			} // if
		} // for
	}
}