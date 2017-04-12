package week4.mar17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Cpu,Ram,System Usage commands in java

public class CpuRamandSystemUsage {

	public static void main(String[] args) throws IOException {
		WindowsSystemInformation information = new WindowsSystemInformation();
		information.get();
		System.out.println(information.get());
	}
}

class WindowsSystemInformation {
	String get() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("systeminfo");
		BufferedReader systemInformationReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		StringBuilder stringBuilder = new StringBuilder();
		String line;

		while ((line = systemInformationReader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(System.lineSeparator());
		}

		return stringBuilder.toString().trim();
	}
}