package Main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class Controller
{
    @RequestMapping("/")
    public String index()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMM.yy HH:mm:ss");

        int randomInt = (int)(Math.random()*100);
        return ("<i>" + sdf.format(new Date()) + "</i>" + "  <h1>Случайное число  " + randomInt) + "</h1>";
    }
}
