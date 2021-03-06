package src.main.java.edu.mtholyoke.cs341bd.bookz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author jfoley.
 */
public class GutenbergBook {
  public String id;
  public String title;
  public String longTitle;
  public String creator;
  public String uploaded;
  public List<String> maybeWikipedias = new ArrayList<>();
  public List<String> libraryOfCongressSubjectHeading = new ArrayList<>();
  public List<String> libraryOfCongressSubjectCode = new ArrayList<>();
  public int downloads;

  public int getBookNumber() {
    return Integer.parseInt(
        Objects.requireNonNull(
            Util.getAfterIfStartsWith("etext", id)));
  }

  public String getGutenbergURL() {
    return "http://www.gutenberg.org/ebooks/"+getBookNumber();
  }
  	/** called in HTML view**/
	public static Comparator<GutenbergBook> sortByTitle = new Comparator<GutenbergBook>() {

		@Override
		public int compare(GutenbergBook lhs, GutenbergBook rhs) {
			// TODO Auto-generated method stub
			return lhs.title.compareTo(rhs.title);
		}

	};

	public static Comparator<GutenbergBook> sortByAuthor = new Comparator<GutenbergBook>() {

		@Override
		public int compare(GutenbergBook lhs, GutenbergBook rhs) {
			// TODO Auto-generated method stub
			return lhs.creator.compareTo(rhs.creator);
		}

	};
	
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
