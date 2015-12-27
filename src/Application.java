import spring.service.CustomerService;
import spring.service.CustomerServiceImpl;

/**
 * Created by SAM on 12/27/2015.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.print(service.findAll().get(0).getFirstName());
        System.out.print(service.findAll().get(0).getLastName());
    }
}
