package com.music.player;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.music.jdbc.OracleConnection;

public class UserInterface {

	private Connection conn;
	private Scanner sc;
	private MusicPlayer mp;
	
	public UserInterface() {
		conn = OracleConnection.getConnection();
		sc = new Scanner(System.in);
		mp = new MusicPlayer(false);
	}
	
	public void start() {
		while ( true ) {
			System.out.println("=============================");
			System.out.println("글로벌 뮤직타운에 오신 것을 환영합니다.");
			System.out.println("1> 뮤직 등록");
			System.out.println("2> 뮤직 조회");
			String menu = sc.nextLine();
			if (menu.equals("1")) {
				addMusic();
			}
			if (menu.equals("2")) {
				showMusic();
			}
			System.out.println();
		}
	}
	
	private void addMusic() {
		try {
			System.out.println("=============================");
			System.out.println("가수명?");
			String singer = sc.nextLine();
			System.out.println("곡명?");
			String title = sc.nextLine();
			System.out.println("발매사?");
			String releasComp = sc.nextLine();
			System.out.println("발매일?");
			String releasDate = sc.nextLine();
			conn = mp.addMusic(conn, singer, title, releasComp, releasDate);
			System.out.println("등록하시겠습니까(y/n)?");
			String insertYN = sc.nextLine();
			if ( insertYN.equals("y")) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	private void showMusic() {
		System.out.println("=============================");
		List<Music> musicList = mp.getMusicList(conn);
		for ( int i = 0 ; i < musicList.size() ; i++) {
			Music music = musicList.get(i);
			System.out.printf(
					"[%s] %s (%s, %s, %s)"
					, music.getMusicNo()
					, music.getTitle()
					, music.getVocal()
					, music.getReleasComp()
					, music.getReleasDate()
					);
			System.out.println();
		}
	}
	
}
