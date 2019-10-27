import java.util.*;
//import javax.swing.*;
import java.io.*;
class Dictionary {
    
    ArrayList <String> name;
    ArrayList <String> meaning;


    Dictionary ()
    {
        name = new ArrayList<String>();
        meaning = new ArrayList<String>();
        loadSample();

    } // constructor ends


    public void addNewRecord(String n , String m)
    {
        setM(m);
        setN(n);
    } // addNewRecord Ends

    public void updateRecord(String word , String m)
    {

        int index = searchRecord(word);
        System.out.println(index);
        if(index != -1)
        {
        name.set(index, word);
        meaning.set(index, m);
        } // if statement
    } // updateRecord end 




    public int searchRecord(String word)
    {

        for(int i = 0 ; i < name.size() ;i++)
        {
            if(word.equals(name.get(i)))
            {
                return i;
            } // if statement
        } // for statment
        
        return -1;

    } // searchRecord end




    public String getN(int index)
    {
        if(name.isEmpty() != true)
        return name.get(index);
        // if end
        return null;
    } // getN
    public String getM(int index)
    {
        
        if(meaning.isEmpty() != true)
        return meaning.get(index);
        return null;
    } // getM
    public void setN(String n)
    {
        try{ 
            if(searchRecord(n) == -1)   
             name.add(n) ;
             else
             throw new contentAvailableException();
        } // try block
        catch (contentAvailableException caex)
        {
            caex.toString();
        } // catch block
    }
    public void setM(String m)
    {
        try{ 
            if(searchRecord(m) == -1)   
            meaning.add(m) ;
            else
             throw new contentAvailableException();
        } // try block
        catch (contentAvailableException caex)
        {
            caex.toString();
        } // catch block
    } // setM end
    
    public void loadSample()
    {
        String tokens[] = null;
        String n , m;
        try{
            FileReader fr = new FileReader ("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line != null)
            {
                tokens = line.split(",");
                n = tokens[0];
                m = tokens[1];
                name.add(n);
                meaning.add(m);
                line = br.readLine();
            } // while ends

            fr.close();
            br.close();
        } // try block ends
             catch(IOException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
    } // loadPerson ends


    public void saveSample()
    {
        try{
            
            FileWriter fw = new FileWriter("sample.txt") ;
            PrintWriter pw = new PrintWriter(fw);
            
            String line ;
            System.out.println(name.size());
            for (int i = 0 ; i < name.size();i++)
            {
                line = name.get(i)+ "," + meaning.get(i) ; 
                pw.println(line);
            } // for loop ends
            pw.flush();
            pw.close();
            fw.close();
            
            
        } // try block ends
             catch(IOException ioEx)
             {
             System.out.println(ioEx);
             } // catch block ends
    } // savePerson ends


} // class Ends


class noContentAvailableException extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString()
    {
    System.out.println("No such word exsist");        
    return null; 
    }
}


class contentAvailableException extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString()
    {
    System.out.println("Word already exsist");        
    return null; 
    }
}
