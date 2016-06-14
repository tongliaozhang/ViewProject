package com.zhangql.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ShowFileTest {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("E:\\workfile\\日常文档");
		Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
			@Override
			public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
				System.out.println(file.getFileName()+"");
				return FileVisitResult.CONTINUE;
			}
		});
	}
}
