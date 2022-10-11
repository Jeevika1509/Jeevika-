package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song song=new Song();
		System.out.println(song.name);
		System.out.println(song.lang);
		System.out.println(song.singer);
		System.out.println(song.lyricst);
		System.out.println(song.type);
		song.name="Kesarirya";
		song.lang="Hindi";
		song.singer="Arijit Singh";
		song.lyricst="Amitabh Bhattacharya";
		song.type="romantic song";
		System.out.println(song.name);
		System.out.println(song.lang);
		System.out.println(song.singer);
		System.out.println(song.lyricst);
		System.out.println(song.type);


	}

}
