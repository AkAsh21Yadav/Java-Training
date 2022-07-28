class Common
{
    static boolean isValid(String password)
    {
        int len = password.length();
        if (len >= 8)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

public class RunnerCommon
{
    public static void main(String[] args)
    {
        boolean result = Common.isValid("Akash2321");
        System.out.println(result);
    }
}