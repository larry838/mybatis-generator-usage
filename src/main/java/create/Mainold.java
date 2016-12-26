package create;
import org.mybatis.generator.api.ShellRunner;
public class Mainold extends ShellRunner{

    /** 
     * @param args
     */
    public static void main(String[] args) {
        String[]arg={"-configfile","src/main/resource/config.xml","-overwrite"};
        
          ShellRunner.main(arg);
        
    }

}
