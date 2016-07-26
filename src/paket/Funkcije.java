package paket;

import java.io.*;

public class Funkcije
{
    static public String vratiSadrzaj(File aFile)
    {
    StringBuilder contents = new StringBuilder();

    try
    {
      BufferedReader input =  new BufferedReader(new FileReader(aFile));
      try {
        String line = null;
        while (( line = input.readLine()) != null){
          contents.append(line);
          contents.append(System.getProperty("line.separator"));
        }
      }
      finally {
        input.close();
      }
    }
    catch (IOException ex){
      ex.printStackTrace();
    }

    return contents.toString();
  }

    public Abeceda[] vratiAbecedu()
    {
        char[] abc = {'e', 't', 'a', 'o', 'n', 'i', 's', 'h', 'r', 'd', 'l', 'u', 'c', 'm', 'f', 'w', 'y', 'g', 'p', 'b', 'v', 'k', 'j', 'x', 'z', 'q'};

        Abeceda[] niz = new Abeceda[abc.length];
        
        for(int i=0; i<abc.length; i++)
        {
            niz[i] = new Abeceda();
            niz[i].setSlovo(abc[i]);
            niz[i].setBrojPojavljivanja(0);
        }

        return niz;
    }

    public Abeceda[] obrada(char[] ulaz)
    {
        Abeceda[] slova = new Abeceda[26];

        slova = this.vratiAbecedu();
    
        for(int j=0; j<ulaz.length; j++)
        {
            for(int k=0; k<slova.length; k++)
            {
                if(slova[k].getSlovo() == ulaz[j])
                {
                    slova[k].incBrojPojavljivanja();
                }
            }
        }

        //for(int k=0; k<slova.length; k++)
           // System.out.println(slova[k].getSlovo() + " -> " + slova[k].getBrojPojavljivanja());

        slova = this.vratiSortiranNiz(slova);
        return slova;
    }

    public Abeceda[] vratiSortiranNiz(Abeceda[] niz)
    {
        Abeceda temp = new Abeceda();

        for(int j=1; j<niz.length; j++)
            for(int i=niz.length-1; i>=j; i--)
            {
                if(niz[i-1].getBrojPojavljivanja()<niz[i].getBrojPojavljivanja())
                {
                    temp = niz[i-1];
                    niz[i-1] = niz[i];
                    niz[i] = temp;
                }
            }
        return niz;
    }
}
