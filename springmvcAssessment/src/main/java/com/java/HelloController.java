package com.java;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HelloController {

  @RequestMapping("/hello")

  public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,@RequestParam("email") String email,@RequestParam("addr") String addr,
		  @RequestParam("Desig") String Desig,@RequestParam("sal") String Sal, Model m) throws  Exception

  {

    if(pass.equals("admin"))

    {

      String msg="Hello "+ name +" registration is successfull Check the information :- ";
      String namee="Emp_Name :-"+name;
      String emaill="Emp_Email :- "+email;
      String address="Emp_Address :- "+addr;
      String designation="Emp_Designation :- "+Desig;
      String Salary="Emp_Salary :- "+Sal;


      m.addAttribute("message", msg);
      m.addAttribute("message1",namee );
      m.addAttribute("message3",emaill);
      m.addAttribute("message4",address);
      m.addAttribute("message5",designation);
      m.addAttribute("message6",Salary);
      
            return "viewpage";

    }

    else

    {

      String msg="Sorry "+ name+". Please enter the correct password ";

      m.addAttribute("message", msg);

      return "errorpage";

    }

  }
}




