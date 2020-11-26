/*
 * AMAZON SONG & GENERE QUESTION:
 * 
 * 
 * Given a map Map<String, List<String>> userSongs with user names as keys and a list of all the songs that the user has listened to as values.

Also given a map Map<String, List<String>> songGenres, with song genre as keys and a list of all the songs within that genre as values. The song can only belong to only one genre.

The task is to return a map Map<String, List<String>>, where the key is a user name and the value is a list of the user's favorite genre(s). Favorite genre is the most listened to genre. A user can have more than one favorite genre if he/she has listened to the same number of songs per each of the genres.

Example 1:

Input:
userSongs = {  
   "David": ["song1", "song2", "song3", "song4", "song8"],
   "Emma":  ["song5", "song6", "song7"]
},
songGenres = {  
   "Rock":    ["song1", "song3"],
   "Dubstep": ["song7"],
   "Techno":  ["song2", "song4"],
   "Pop":     ["song5", "song6"],
   "Jazz":    ["song8", "song9"]
}

Output: {  
   "David": ["Rock", "Techno"],
   "Emma":  ["Pop"]
}

Explanation:
David has 2 Rock, 2 Techno and 1 Jazz song. So he has 2 favorite genres.
Emma has 2 Pop and 1 Dubstep song. Pop is Emma's favorite genre.
Example 2:

Input:
userSongs = {  
   "David": ["song1", "song2"],
   "Emma":  ["song3", "song4"]
},
songGenres = {}

Output: {  
   "David": [],
   "Emma":  []
}
 * 
 * */import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AmazonSong {
	
	
	
	public static void main(String args[]) {
		HashMap<String, List<String>> userSong = new HashMap<String, List<String>>();
		List<String> Davidlistsong = Arrays.asList("song1","song2","song3","song4","song8");
		userSong.put("David", Davidlistsong);
		List<String> Emmalistsong = Arrays.asList("song5","song6","song7");
		userSong.put("Emma", Emmalistsong);
		
		HashMap<String, List<String>> songGenre = new HashMap<String, List<String>>();
		
				   songGenre.put("Rock"   , Arrays.asList("song1", "song3"));
				   songGenre.put("Dubstep", Arrays.asList("song7"));
				   songGenre.put("Techno",  Arrays.asList("song2", "song4"));
				   songGenre.put("Pop",     Arrays.asList("song5", "song6"));
				   songGenre.put("Jazz",   Arrays.asList("song8", "song9"));
		System.out.println("SongList: " +userSong);
		System.out.println("GenreList: " +songGenre);
		
		favourite_genere(userSong, songGenre);
		
	}

	private static void favourite_genere(HashMap<String, List<String>> userSong,
			HashMap<String, List<String>> songGenre) {
		// TODO Auto-generated method stub
		Map<String, String> songstogenre = new HashMap<>();
	   	
	   	for(String genre : songGenre.keySet()) {
	   		List<String> songs = songGenre.get(genre);
	   		for(String song : songs) {
	   			songstogenre.put(song, genre);
	   		}
	   	}

		
		HashMap<String, List<String>> output = new HashMap<String, List<String>>();
		for(String name : userSong.keySet() )
		{
		   	HashMap<String, Integer> temporaryusermap = new HashMap<String, Integer>();
		List<String > l = userSong.get(name);//System.out.println(l);
		List<String> temp = new ArrayList<String>();
		
		for(int i=0;i<l.size();i++)
			{
				String s = l.get(i);
				if(songstogenre.containsKey(s))
				{
					temp.add(songstogenre.get(s));

				}
				
			}
		for(String s : temp)
		{
			if(temporaryusermap.containsKey(s))
			temporaryusermap.put(s,temporaryusermap.get(s)+1);
			else
				temporaryusermap.put(s, 1);
		}
		
			//output.put(name, new ArrayList<String>(new HashSet<String>(temp)));

		int max = Collections.max(temporaryusermap.values());
		//System.out.print("Max is"+max);
		//System.out.print(finalmap);
		List<String> ls = new ArrayList<String>();
		for(String s : temporaryusermap.keySet()) {
			if(temporaryusermap.get(s)==max)
				ls.add(s);
		}
		output.put(name,ls);
		}
		System.out.print("\nOutput is:\t"+output);
		}
		
		
	}

