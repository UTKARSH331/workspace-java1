package com.facade.pattern;

class CPU{
	public void CPUWorking() {
		System.out.println("cpuworking start : ");
	}
}

class GPU{
	public void GPUWorking() {
		System.out.println("gpuworking start : ");
	}
}

class CPUcooling{
	public void CPUcoolingWorking() {
		System.out.println("cpucoolingworking start : ");
	}
}

class Memory{
	public void MemoryWorking() {
		System.out.println("memoryworking start : ");
	}
}


class Hardware{
	public void HardwareWorking() {
		System.out.println("hardwareworking start : ");
	}
}

class ComputerSystem{
	private CPU cpu = new CPU();
	private GPU gpu = new GPU();
	private CPUcooling cc1 = new CPUcooling();
	private Memory m1 = new Memory();
	private Hardware h1 = new Hardware();
	
	public void computerSystem() {
		  System.out.println("----- Starting Computer -----");
		  cpu.CPUWorking();
		  gpu.GPUWorking();
		  cc1.CPUcoolingWorking();
		  m1.MemoryWorking();
		  h1.HardwareWorking();
	        System.out.println("Computer Booted Successfully!");
	}
}

public class FacadePattern {
	public static void main(String[] args) {
		ComputerSystem cs1 = new ComputerSystem();
		cs1.computerSystem();
	}

}
