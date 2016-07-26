package paket;

public class Abeceda
{
    private char slovo;
    private int brojPojavljivanja = 0;

    public void incBrojPojavljivanja()
    {
        brojPojavljivanja++;
    }

    public int getBrojPojavljivanja()
    {
        return brojPojavljivanja;
    }

    public void setBrojPojavljivanja(int br)
    {
        brojPojavljivanja = br;
    }

    public char getSlovo()
    {
        return slovo;
    }

    public void setSlovo(char c)
    {
        slovo = c;
    }
}