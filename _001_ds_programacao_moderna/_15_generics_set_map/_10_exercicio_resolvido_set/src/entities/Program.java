package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String fields[] = line.split(" ");
				set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
				
				line = br.readLine();
				
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}