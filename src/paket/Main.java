package paket;

public class Main
{
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Rezultat rez = new Rezultat();
                rez.setLocationRelativeTo(null);
                rez.setVisible(true);
            }
        });
    }
}