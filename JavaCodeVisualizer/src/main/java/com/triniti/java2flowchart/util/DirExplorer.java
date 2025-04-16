package com.triniti.java2flowchart.util;

import java.io.File;

/**
 * Got it from https://github.com/ftomassetti/analyze-java-code-examples
 */
public class DirExplorer 
{
	public interface FileHandler 
    {
        void handle(int level, String path, File file);
    }
    public interface Filter 
    {
        boolean filter(int level, String path, File file);
    }

    private FileHandler fileHandler;
    private Filter filter;
    
    public void setFileHandler(FileHandler fileHandler) 
    {
		this.fileHandler = fileHandler;
	}
    
    public void setFilter(Filter filter) 
    {
		this.filter = filter;
	}
    
    public void explore(File root) 
    {
        explore(0, "", root);
    }

    private void explore(int level, String path, File file) 
    {
    	
        if (file.isDirectory()) 
        {
            for (File child : file.listFiles()) 
            {
            	
                explore(level + 1, path + "/" + child.getName(), child);
               
            }
        } 
        else 
        {
        	boolean flag01=filter.filter(level, path, file);
            if (flag01) 
            {
                fileHandler.handle(level, path, file);
            }
        }
    }
}