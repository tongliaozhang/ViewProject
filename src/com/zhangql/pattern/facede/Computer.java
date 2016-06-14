package com.zhangql.pattern.facede;

public class Computer {
	private CPU cpu ;
	private Disk disk;
	private Memory memory;
	
	public Computer(){
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void startup(){
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void shutdown(){
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
