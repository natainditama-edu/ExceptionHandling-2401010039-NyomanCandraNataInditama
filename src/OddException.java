public class OddException extends Exception
{
    public OddException(int dibagi)
    {
        super("Angka " + dibagi + " harus angka ganjil");
    }
}
