/*Shaan Chopra 2015090
Gunkirat Kaur 2015032*/
import java.util.*;
import java.io.*;

public class Decorate{
	private ObjectOutputStream out;
	private ObjectInputStream in;
	public Decorate(ObjectOutputStream out){
		this.out=out;
	}
	public Decorate(ObjectInputStream in){
		this.in=in;
	}
	public Object Encrpyt(Object obj){

		 if(obj instanceof Song){
		 	int i;
		 	
		 	Song newObj = new Song(null, null, null, null, null, null, null, null);
	 		int len_t = ((Song)obj).getTitle().length();
	 		String s = "";
			for(i = 0; i < len_t; i++){
				s = s + (char)(((Song)obj).getTitle().charAt(i)+1);
			}
			((Song)newObj).setTitle(s);

	 		int len_a = ((Song)obj).getArtist().length();
	 		String s1 = "";
	 		for(i = 0; i < len_a; i++){
            	s1 = s1 + (char)(((Song)obj).getArtist().charAt(i) + 1);
	 		}
	 		((Song)newObj).setArtist(s1);

	 		int len_y = (((Song)obj)).getYear().length();
	 		String s2 = "";
	 		for(i = 0; i < len_y; i++){
            	s2 = s2 + (char)(((Song)obj).getYear().charAt(i) + 1);
	 		}
	 		((Song)newObj).setYear(s2);

	 		int len_s = ((Song)obj).getSize().length();
	 		String s3 = "";
	 		for(i = 0; i < len_s; i++){
            	s3 = s3 + (char)(((Song)obj).getSize().charAt(i) + 1);
	 		}
	 		((Song)newObj).setSize(s3);

	 		int len_r = ((Song)obj).getRating().length();
	 		String s4 = "";
	 		for(i = 0; i < len_r; i++){
            	s4 = s4 + (char)(((Song)obj).getRating().charAt(i) + 1);
	 		}
	 		((Song)newObj).setRating(s4);

	 		int len_d = ((Song)obj).getDuration().length();
	 		String s5 = "";
	 		for(i = 0; i < len_d; i++){
            	s5 = s5 + (char)(((Song)obj).getDuration().charAt(i) + 1);
	 		}
	 		((Song)newObj).setDuration(s5);

	 		int len_g = ((Song)obj).getGenre().length();
	 		String s6 = "";
	 		for(i = 0; i < len_g; i++){
            	s6 = s6 + (char)(((Song)obj).getGenre().charAt(i) + 1);
	 		}
	 		((Song)newObj).setGenre(s6);

	 		int len_m = ((Song)obj).getMoviename().length();
	 		String s7 = "";
	 		for(i = 0; i < len_m; i++){
            	s7 = s7 + (char)(((Song)obj).getMoviename().charAt(i) + 1);
	 		}
	 		((Song)newObj).setMoviename(s7);
	 		return newObj;
		 }
		 else if(obj instanceof Movie){
		 	int i;
		 	Movie newObj = new Movie(null, null, null, null, null, null, null, null, null, null);
	 		//Movie newObj = (Movie) obj;
	 		int len_t = ((Movie)obj).getTitle().length();
	 		String s = "";
			for(i = 0; i < len_t; i++){
				s = s + (char)(((Movie)obj).getTitle().charAt(i)+1);
			}
			((Movie)newObj).setTitle(s);

	 		int len_a = ((Movie)obj).getArtist().length();
	 		String s1 = "";
	 		for(i = 0; i < len_a; i++){
            	s1 = s1 + (char)(((Movie)obj).getArtist().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setArtist(s1);

	 		int len_y = ((Movie)obj).getYear().length();
	 		String s2 = "";
	 		for(i = 0; i < len_y; i++){
            	s2 = s2 + (char)(((Movie)obj).getYear().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setYear(s2);

	 		int len_s = ((Movie)obj).getSize().length();
	 		String s3 = "";
	 		for(i = 0; i < len_s; i++){
            	s3 = s3 + (char)(((Movie)obj).getSize().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setSize(s3);

	 		int len_r = ((Movie)obj).getRating().length();
	 		String s4 = "";
	 		for(i = 0; i < len_r; i++){
            	s4 = s4 + (char)(((Movie)obj).getRating().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setRating(s4);

	 		int len_d = ((Movie)obj).getDuration().length();
	 		String s5 = "";
	 		for(i = 0; i < len_d; i++){
            	s5 = s5 + (char)(((Movie)obj).getDuration().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setDuration(s5);

	 		int len_g = ((Movie)obj).getGenre().length();
	 		String s6 = "";
	 		for(i = 0; i < len_g; i++){
            	s6 = s6 + (char)(((Movie)obj).getGenre().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setGenre(s6);

	 		int len_dir = ((Movie)obj).getDirector().length();
	 		String s7 = "";
	 		for(i = 0; i < len_dir; i++){
            	s7 = s7 + (char)(((Movie)obj).getDirector().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setDirector(s7);

	 		int len_pro = ((Movie)obj).getProducer().length();
	 		String s8 = "";
	 		for(i = 0; i < len_pro; i++){
            	s8 = s8 + (char)(((Movie)obj).getProducer().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setProducer(s8);

	 		int len_cer = ((Movie)obj).getCertification().length();
	 		String s9 = "";
	 		for(i = 0; i < len_cer; i++){
            	s9 = s9 + (char)(((Movie)obj).getCertification().charAt(i) + 1);
	 		}
	 		((Movie)newObj).setCertification(s9);
	 		return newObj;
		}

		return null;
	}	

	public Object Decrpyt(Object obj){
		 if(obj instanceof Song){
		 	int i;
		 	Song newObj = new Song(null, null, null, null, null, null, null, null);
	 		int len_t = ((Song)obj).getTitle().length();
	 		String s = "";
			for(i = 0; i < len_t; i++){
				s = s + (char)(((Song)obj).getTitle().charAt(i) - 1);
			}
			((Song)newObj).setTitle(s);

	 		int len_a = ((Song)obj).getArtist().length();
	 		String s1 = "";
	 		for(i = 0; i < len_a; i++){
            	s1 = s1 + (char)(((Song)obj).getArtist().charAt(i) - 1);
	 		}
	 		((Song)newObj).setArtist(s1);

	 		int len_y = ((Song)obj).getYear().length();
	 		String s2 = "";
	 		for(i = 0; i < len_y; i++){
            	s2 = s2 + (char)(((Song)obj).getYear().charAt(i) - 1);
	 		}
	 		((Song)newObj).setYear(s2);

	 		int len_s = ((Song)obj).getSize().length();
	 		String s3 = "";
	 		for(i = 0; i < len_s; i++){
            	s3 = s3 + (char)(((Song)obj).getSize().charAt(i) - 1);
	 		}
	 		((Song)newObj).setSize(s3);

	 		int len_r = ((Song)obj).getRating().length();
	 		String s4 = "";
	 		for(i = 0; i < len_r; i++){
            	s4 = s4 + (char)(((Song)obj).getRating().charAt(i) - 1);
	 		}
	 		((Song)newObj).setRating(s4);

	 		int len_d = ((Song)obj).getDuration().length();
	 		String s5 = "";
	 		for(i = 0; i < len_d; i++){
            	s5 = s5 + (char)(((Song)obj).getDuration().charAt(i) - 1);
	 		}
	 		((Song)newObj).setDuration(s5);

	 		int len_g = ((Song)obj).getGenre().length();
	 		String s6 = "";
	 		for(i = 0; i < len_g; i++){
            	s6 = s6 + (char)(((Song)obj).getGenre().charAt(i) - 1);
	 		}
	 		((Song)newObj).setGenre(s6);

	 		int len_m = ((Song)obj).getMoviename().length();
	 		String s7 = "";
	 		for(i = 0; i < len_m; i++){
            	s7 = s7 + (char)(((Song)obj).getMoviename().charAt(i) - 1);
	 		}
	 		((Song)newObj).setMoviename(s7);
	 		return newObj;
		 }
		 else if(obj instanceof Movie){
		 	int i;
		 	Movie newObj = new Movie(null, null, null, null, null, null, null, null, null, null);
	 		int len_t = ((Movie)obj).getTitle().length();
	 		String s = "";
			for(i = 0; i < len_t; i++){
				s = s + (char)(((Movie)obj).getTitle().charAt(i) - 1);
			}
			((Movie)newObj).setTitle(s);

	 		int len_a = ((Movie)obj).getArtist().length();
	 		String s1 = "";
	 		for(i = 0; i < len_a; i++){
            	s1 = s1 + (char)(((Movie)obj).getArtist().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setArtist(s1);

	 		int len_y = ((Movie)obj).getYear().length();
	 		String s2 = "";
	 		for(i = 0; i < len_y; i++){
            	s2 = s2 + (char)(((Movie)obj).getYear().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setYear(s2);

	 		int len_s = ((Movie)obj).getSize().length();
	 		String s3 = "";
	 		for(i = 0; i < len_s; i++){
            	s3 = s3 + (char)(((Movie)obj).getSize().charAt(i) - 1);
	 		}

	 		((Movie)newObj).setSize(s3);

	 		int len_r = ((Movie)obj).getRating().length();
	 		String s4 = "";
	 		for(i = 0; i < len_r; i++){
            	s4 = s4 + (char)(((Movie)obj).getRating().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setRating(s4);

	 		int len_d = ((Movie)obj).getDuration().length();
	 		String s5 = "";
	 		for(i = 0; i < len_d; i++){
            	s5 = s5 + (char)(((Movie)obj).getDuration().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setDuration(s5);

	 		int len_g = ((Movie)obj).getGenre().length();
	 		String s6 = "";
	 		for(i = 0; i < len_g; i++){
            	s6 = s6 + (char)(((Movie)obj).getGenre().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setGenre(s6);

	 		int len_dir = ((Movie)obj).getDirector().length();
	 		String s7 = "";
	 		for(i = 0; i < len_dir; i++){
            	s7 = s7 + (char)(((Movie)obj).getDirector().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setDirector(s7);

	 		int len_pro = ((Movie)obj).getProducer().length();
	 		String s8 = "";
	 		for(i = 0; i < len_pro; i++){
            	s8 = s8 + (char)(((Movie)obj).getProducer().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setProducer(s8);

	 		int len_cer = ((Movie)obj).getCertification().length();
	 		String s9 = "";
	 		for(i = 0; i < len_cer; i++){
            	s9 = s9 + (char)(((Movie)obj).getCertification().charAt(i) - 1);
	 		}
	 		((Movie)newObj).setCertification(s9);
	 		return newObj;
		}

		return null;
	}

	public void writeObj(Object obj){
		try{
			out.writeObject(Encrpyt(obj));
		}
		catch(IOException e) {
	        e.printStackTrace();
		}	
	}

	public Object readObj(){
		Object obj = null;
		try{
			obj = in.readObject();
			return Decrpyt(obj);
		}
		catch(IOException e) {
	         e.printStackTrace();
	      }
	    catch(ClassNotFoundException c) {
	          System.out.println("Class not found");
	          c.printStackTrace();
	      }
	      return obj;
	}

}

