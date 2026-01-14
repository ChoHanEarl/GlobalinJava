package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A {

	void a() {
		try (FileWriter fw = new FileWriter("output.txt")) {
			fw.write("Hello, World!\nHi, Java!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void a2() {

		try (FileReader fr = new FileReader("output.txt")) {
			int ch;
			while ((ch = fr.read()) != -1) {
				if ('\r' == (char) ch) {
					System.out.println("*");
				}
				if ('\n' == (char) ch) {
					System.out.println("!");
				}

//				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void a3() {
		try (
			FileReader fr = new FileReader("output.txt");
			BufferedReader br = new BufferedReader(fr)
		) {
			String line;
			int lineNumber = 1;
			
			while((line = br.readLine()) != null) {
				System.out.printf("%3d: %s\n", lineNumber++, line);
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	// 파일 복사 정석 코드
	void copyBinaryFile(String sourceFile, String destFile) {
		System.out.println("=== 바이너리 파일 복사 ===");
		
		try (
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 8192);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile), 8192);
		) {
			byte[] buffer = new byte[8192];
			int bytesRead;
			while((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			System.out.println("바이너리 파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void a4() {
		Path p = Paths.get("C:/temp/file.txt");
		String str1 = p.getFileName().toString();
		String str2 = p.getRoot().toString();
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	void a5() {
		try {
			Path folderA = Paths.get("C:/a");
			Files.createDirectory(folderA);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
