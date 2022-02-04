import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

class UserTest {
    public static void main(String[] args){
        test();
    }
    public static void test(){
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        System.out.println("springVersion  "+springVersion);
        System.out.println("springBootVersion "+springBootVersion );
    }
}
