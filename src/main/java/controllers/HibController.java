package controllers;


import hibernet.UserDao;
import hibernet.entity.UserHibernetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hiber")
public class HibController {

    @Autowired
    private UserDao userDao;

    @ResponseBody
    @RequestMapping("/creare")
    public String create()
    {

        UserHibernetUser u = new UserHibernetUser();
        u.setFirst("Фамилия"+ System.currentTimeMillis());
        u.setLast("Имя");
        userDao.create(u);
        return "saved";
    }
    @ResponseBody
    @RequestMapping("/read")
    public String read(@RequestParam("id") Long idN)
    {
        return "read";
    }

    @ResponseBody
    @RequestMapping("/getUserByLogin")
    public String read(@RequestParam("first") String f)
    {
        UserHibernetUser read = userDao.getUserByLogin(f);
        System.out.println(read);
        return "getUserByLogin";}
}
