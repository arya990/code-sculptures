package week4.mar14;

import java.io.File;

/*
 * tree command in linux prints the contents of directory in tree structure, write code in java/python to print the same kind of structure by reading directory location as input

 */
public class LinuxTreeCommand {

	public static void main(String[] args) {
		tree(new File("E:\\workspace"));
	}

	public static void tree(File dir) {

		File listFile[] = dir.listFiles();
		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					System.out.println("|\t\t");
					tree(listFile[i]);
				} else {

					System.out.println("+---" + listFile[i].getName().toString());

				}
			}
		}
	}
}