package edu.isi.misd.tagfiler.upload;

import java.util.List;

/**
 * Interface for a file upload process to the tag server.
 * 
 * @author David Smith
 * 
 */
public interface FileUpload {

    /**
     * Sets the base directory for the file upload.
     * 
     * @param baseDir
     *            base directory
     */
    public void setBaseDirectory(String baseDir);

    /**
     * Posts a list of files to the tagfiler server with a random dataset name
     * and using the best available MessageDigest available.
     * 
     * @param files
     *            list of file names to upload
     * @return true if all files were uploaded successfully
     */
    public boolean postFileData(List<String> files);

    /**
     * Posts a list of files to the tagfilter server with a specified dataset
     * name and using the best available MessageDigest available.
     * 
     * @param files
     *            list of file names to upload
     * @param datasetName
     *            name of the dataset to assign
     * @return true if all files were uploaded successfully
     */
    public boolean postFileData(List<String> files, String datasetName);

}