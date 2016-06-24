import java.io.File;
import java.io.IOException;
import java.util.List;

import difflib.Chunk;

public class FileCompPrint {
	private final File original = new File("/Users/margaretknoblock/Documents/Summer2016/originalFile.txt");
	 
    private final File revised = new File("/Users/margaretknoblock/Documents/Summer2016/revisedFile.txt");
    
    public void printChanges() throws IOException{
    	final FileComparator comparator = new FileComparator(original, revised);
    	final List<Chunk> changes = comparator.getChangesFromOriginal();
    	
    }
    
    public void main(String[] args){ //must be a static main method, but problems with throwing io when i try to do this, look into file reading in java
    	final FileComparator comparator = new FileComparator(original, revised);
    	
    	try {
            final List<Chunk> changesFromOriginal = comparator.getChangesFromOriginal();
            for(int i = 0; i<changesFromOriginal.size();i++){
        		System.out.println(changesFromOriginal.get(i));
        	}
           
        } catch (IOException ioe) {
        	
        }
    }
}
