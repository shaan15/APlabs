/*Shaan Chopra 2015090
Gunkirat Kaur 2015032*/
import java.util.*;
import java.io.*;

abstract class Media implements Comparable<Media>,Serializable{
	//private String songName;
	private String title;
	private String artist;
	private String year; 
	private String genre;
	private String size;
	private String rating;
	private String duration; 

	public int compareTo(Media m){
		return rating.compareTo(m.getRating());
	}

	Media(String t, String a, String y, String gen, String s,String r, String d){
		title = t;
		artist = a;
		year = y;
		genre = gen;
		size = s;
		rating = r;
		duration = d;

	}

	public String getTitle(){
		return title;
	}
	public String getArtist(){
		return artist;
	}
	public String getYear(){
		return year;
	}
	public String getGenre(){
		return genre;
	}
	public String getSize(){
		return size;
	}
	public String getRating(){
		return rating;
	}
	public String getDuration(){
		return duration;
	}
	public void setTitle(String t){
		title = t;
	}
	public void setArtist(String a){
		artist = a;
	}
	public void setYear(String y){
		year = y;
	}
	public void setGenre(String g){
		genre = g;
	}
	public void setSize(String s){
		size = s;
	}
	public void setDuration(String d){
		duration = d;
	}	
	public void setRating(String r){
		rating = r;
	}
}