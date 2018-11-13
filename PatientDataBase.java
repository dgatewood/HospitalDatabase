import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
/**
 * Write a description of class PatientDataBase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatientDataBase
{
    public PatientDataBase(String filename)
    {
        
    }
    
    public void addPatientVisit()
    {
        
    }
    
    public Pair getReasonTreatmentPairs(int id,String date)
    {
        Pair p = new Pair();
    }
    
    public void writeDatabaseFile(String fileName)
    {
        
    }
    
    public void addPatientRecord(String firstName, String lastName, String DOB)
    {
        
    }
    
    public void removePatientRecord(String firstName, String lastName, String DOB)
    {
        
    }
    
    public PatientRecord getPatientRecord(int id)
    {
        ///Search through records and return public record with that ID
        PatientRecord pr = new PatientRecord();
        return pr;
    }
    
    public List getVisitDates(int id)
    {
        ///Need to search by ID and return a list of Strings of the dates that that patient has.
        List<String> visitDates = new ArrayList<String>();
        return visitDates;
    }
    
    public HashMap getPatientIdsNames()
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        return hm;
    }
}
